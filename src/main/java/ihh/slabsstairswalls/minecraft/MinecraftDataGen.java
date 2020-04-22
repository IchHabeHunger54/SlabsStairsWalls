package ihh.slabsstairswalls.minecraft;

import ihh.slabsstairswalls.DataGen;
import ihh.slabsstairswalls.SlabsStairsWalls;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = SlabsStairsWalls.MODID)
@SuppressWarnings("unused")
public final class MinecraftDataGen extends DataGen {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent e) {
        DataGenerator g = e.getGenerator();
        ExistingFileHelper h = e.getExistingFileHelper();
        if (e.includeServer()) {
            g.addProvider(new MinecraftRecipes(g));
            g.addProvider(new MinecraftLootTableGen(g));
            g.addProvider(new MinecraftBlockTags(g));
            g.addProvider(new MinecraftItemTags(g));
        }
        if (e.includeClient()) {
            g.addProvider(new MinecraftLangGenENUS(g));
            g.addProvider(new MinecraftLangGenDEDE(g));
            g.addProvider(new MinecraftBlockStates(g, h));
            g.addProvider(new MinecraftItemModels(g, h));
        }
    }
}
