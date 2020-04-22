package ihh.slabsstairswalls;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = SlabsStairsWalls.MODID)
@SuppressWarnings("unused")
public abstract class DataGen {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent e) {
//        DataGenerator g = e.getGenerator();
//        ExistingFileHelper h = e.getExistingFileHelper();
//        if(e.includeServer()) {
//            g.addProvider(new RecipeGen(g));
//            g.addProvider(new BlockTagGen(g));
//            g.addProvider(new ItemTagGen(g));
//            g.addProvider(new LootTableGen(g));
//        }
//        if(e.includeClient()) {
//            g.addProvider(new LangGenENUS(g));
//            g.addProvider(new LangGenDEDE(g));
//            g.addProvider(new BlockStates(g, h));
//            g.addProvider(new ItemModels(g, h));
//        }
    }
}
