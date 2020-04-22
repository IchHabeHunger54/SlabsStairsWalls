package ihh.slabsstairswalls;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DirectoryCache;
import net.minecraft.data.IDataProvider;
import net.minecraft.data.LootTableProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.ConstantRange;
import net.minecraft.world.storage.loot.DynamicLootEntry;
import net.minecraft.world.storage.loot.ItemLootEntry;
import net.minecraft.world.storage.loot.LootParameterSets;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraft.world.storage.loot.LootTableManager;
import net.minecraft.world.storage.loot.functions.CopyName;
import net.minecraft.world.storage.loot.functions.CopyNbt;
import net.minecraft.world.storage.loot.functions.SetContents;
import net.minecraftforge.fml.RegistryObject;
import org.apache.logging.log4j.LogManager;

public abstract class LootTableGen extends LootTableProvider {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
    protected final Map<Block, LootTable.Builder> lootTables = new HashMap<>();
    private final DataGenerator generator;

    public LootTableGen(DataGenerator g) {
        super(g);
        this.generator = g;
    }

    protected abstract void addTables();
    
    protected LootTable.Builder dropSelf(Supplier<? extends Block> b) {
        return LootTable.builder().addLootPool(LootPool.builder().name(b.get().getRegistryName().getPath()).rolls(ConstantRange.of(1)).addEntry(ItemLootEntry.builder(b.get()).acceptFunction(CopyName.builder(CopyName.Source.BLOCK_ENTITY)).acceptFunction(CopyNbt.builder(CopyNbt.Source.BLOCK_ENTITY).addOperation("inv", "BlockEntityTag.inv", CopyNbt.Action.REPLACE).addOperation("energy", "BlockEntityTag.energy", CopyNbt.Action.REPLACE)).acceptFunction(SetContents.func_215920_b().func_216075_a(DynamicLootEntry.func_216162_a(new ResourceLocation("minecraft", "contents"))))));
    }
    
    protected LootTable.Builder dropSelf(RegistryObject<? extends Block> b) {
        return LootTable.builder().addLootPool(LootPool.builder().name(b.get().getRegistryName().getPath()).rolls(ConstantRange.of(1)).addEntry(ItemLootEntry.builder(b.get())));
    }

    @Override
    public void act(DirectoryCache c) {
        addTables();
        Map<ResourceLocation, LootTable> tables = new HashMap<>();
        for (Map.Entry<Block, LootTable.Builder> entry : lootTables.entrySet()) tables.put(entry.getKey().getLootTable(), entry.getValue().setParameterSet(LootParameterSets.BLOCK).build());
        Path outputFolder = this.generator.getOutputFolder();
        tables.forEach((key, lootTable) -> {
            Path path = outputFolder.resolve("data/" + SlabsStairsWalls.MODID + "/loot_tables/blocks/" + key.getPath() + ".json");
            try {
                IDataProvider.save(GSON, c, LootTableManager.toJson(lootTable), path);
            } catch (IOException e) {
                LogManager.getLogger().error("Couldn't write loot table {}", path, e);
            }
        });
    }
}
