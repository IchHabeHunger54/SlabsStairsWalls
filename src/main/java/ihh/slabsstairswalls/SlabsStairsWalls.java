package ihh.slabsstairswalls;

import ihh.slabsstairswalls.minecraft.MinecraftBlocks;
import ihh.slabsstairswalls.minecraft.MinecraftItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(SlabsStairsWalls.MODID)
public class SlabsStairsWalls {
    public static final String MODID = "slabsstairswalls";
    public static final String MODNAME = "Slabs, Stairs, Walls";
    public static final ItemGroup ITEM_GROUP = new ItemGroup(MODID) {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(MinecraftItems.STONE_WALL.get());
        }
    };

    public SlabsStairsWalls() {
        IInit.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MinecraftBlocks.register();
        IInit.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MinecraftItems.register();
    }
}
