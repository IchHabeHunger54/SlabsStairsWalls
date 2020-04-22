package ihh.slabsstairswalls;

import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nonnull;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.LootTableProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootParameterSet;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraft.world.storage.loot.ValidationTracker;

/**
 * @author Minecraftschurli
 * @version 2020-01-15
 */
public abstract class LootTableGen extends LootTableProvider {
    public LootTableGen(DataGenerator g) {
        super(g);
    }

    @Nonnull
    @Override
    protected abstract List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootParameterSet>> getTables();
//        return ImmutableList.of(new Pair<>(LootTables::new, LootParameterSets.BLOCK));

    @Override
    protected void validate(Map<ResourceLocation, LootTable> map, ValidationTracker validationtracker) {
//        super.validate(map, validationtracker);
    }
}
