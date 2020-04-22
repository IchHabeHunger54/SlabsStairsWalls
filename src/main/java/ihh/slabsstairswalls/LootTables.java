package ihh.slabsstairswalls;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import net.minecraft.block.Block;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraftforge.fml.RegistryObject;

/**
 * @author Minecraftschurli
 * @version 2019-11-12
 */
public abstract class LootTables extends BlockLootTables {
    private final Map<ResourceLocation, LootTable.Builder> tables = new HashMap<>();

    @Override
    protected abstract void addTables();

    @Override
    public void accept(BiConsumer<ResourceLocation, LootTable.Builder> b) {
        addTables();
        Set<ResourceLocation> set = new HashSet<>();
        for (Block block : getKnownBlocks()) {
            ResourceLocation resourcelocation = block.getLootTable();
            if (resourcelocation != net.minecraft.world.storage.loot.LootTables.EMPTY && set.add(resourcelocation)) {
                LootTable.Builder builder = tables.remove(resourcelocation);
                if (builder == null) continue;
                b.accept(resourcelocation, builder);
            }
        }
    }

    @Override
    protected void registerLootTable(Block block, LootTable.Builder table) {
        this.tables.put(block.getLootTable(), table);
    }

    protected void dropSelf(Supplier<? extends Block> b) {
        registerDropSelfLootTable(b.get());
    }

    protected void dropSelf(RegistryObject<? extends Block> b) {
        registerDropSelfLootTable(b.get());
    }
}
