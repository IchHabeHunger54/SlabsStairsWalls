package ihh.slabsstairswalls;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import net.minecraft.advancements.criterion.StatePropertiesPredicate;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraft.state.properties.SlabType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.ConstantRange;
import net.minecraft.world.storage.loot.ItemLootEntry;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraft.world.storage.loot.conditions.BlockStateProperty;
import net.minecraft.world.storage.loot.functions.SetCount;

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
        tables.put(block.getLootTable(), table);
    }

    protected void dropSelf(Supplier<? extends Block> b) {
        registerDropSelfLootTable(b.get());
    }

    protected void dropSlab(Supplier<? extends Block> b) {
        registerLootTable(b.get(), LootTable.builder().addLootPool(LootPool.builder().rolls(ConstantRange.of(1)).addEntry(withExplosionDecay(b.get(), ItemLootEntry.builder(b.get()).acceptFunction(SetCount.builder(ConstantRange.of(2)).acceptCondition(BlockStateProperty.builder(b.get()).fromProperties(StatePropertiesPredicate.Builder.newBuilder().withProp(SlabBlock.TYPE, SlabType.DOUBLE))))))));
    }
}
