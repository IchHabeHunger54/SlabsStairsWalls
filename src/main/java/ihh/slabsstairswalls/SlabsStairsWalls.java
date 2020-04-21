package ihh.slabsstairswalls;

import ihh.slabsstairswalls.minecraft.MinecraftBlocks;
import ihh.slabsstairswalls.minecraft.MinecraftItems;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
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
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        IInit.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MinecraftBlocks.register();
        IInit.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MinecraftItems.register();
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(MinecraftBlocks.GLASS_SLAB.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(MinecraftBlocks.GLASS_STAIRS.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(MinecraftBlocks.GLASS_WALL.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(MinecraftBlocks.WHITE_STAINED_GLASS_SLAB.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(MinecraftBlocks.WHITE_STAINED_GLASS_STAIRS.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(MinecraftBlocks.WHITE_STAINED_GLASS_WALL.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(MinecraftBlocks.ORANGE_STAINED_GLASS_SLAB.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(MinecraftBlocks.ORANGE_STAINED_GLASS_STAIRS.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(MinecraftBlocks.ORANGE_STAINED_GLASS_WALL.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(MinecraftBlocks.MAGENTA_STAINED_GLASS_SLAB.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(MinecraftBlocks.MAGENTA_STAINED_GLASS_STAIRS.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(MinecraftBlocks.MAGENTA_STAINED_GLASS_WALL.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(MinecraftBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(MinecraftBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(MinecraftBlocks.LIGHT_BLUE_STAINED_GLASS_WALL.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(MinecraftBlocks.YELLOW_STAINED_GLASS_SLAB.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(MinecraftBlocks.YELLOW_STAINED_GLASS_STAIRS.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(MinecraftBlocks.YELLOW_STAINED_GLASS_WALL.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(MinecraftBlocks.LIME_STAINED_GLASS_SLAB.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(MinecraftBlocks.LIME_STAINED_GLASS_STAIRS.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(MinecraftBlocks.LIME_STAINED_GLASS_WALL.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(MinecraftBlocks.GRAY_STAINED_GLASS_SLAB.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(MinecraftBlocks.GRAY_STAINED_GLASS_STAIRS.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(MinecraftBlocks.GRAY_STAINED_GLASS_WALL.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(MinecraftBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(MinecraftBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(MinecraftBlocks.LIGHT_GRAY_STAINED_GLASS_WALL.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(MinecraftBlocks.CYAN_STAINED_GLASS_SLAB.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(MinecraftBlocks.CYAN_STAINED_GLASS_STAIRS.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(MinecraftBlocks.CYAN_STAINED_GLASS_WALL.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(MinecraftBlocks.PURPLE_STAINED_GLASS_SLAB.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(MinecraftBlocks.PURPLE_STAINED_GLASS_STAIRS.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(MinecraftBlocks.PURPLE_STAINED_GLASS_WALL.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(MinecraftBlocks.BLUE_STAINED_GLASS_SLAB.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(MinecraftBlocks.BLUE_STAINED_GLASS_STAIRS.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(MinecraftBlocks.BLUE_STAINED_GLASS_WALL.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(MinecraftBlocks.BROWN_STAINED_GLASS_SLAB.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(MinecraftBlocks.BROWN_STAINED_GLASS_STAIRS.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(MinecraftBlocks.BROWN_STAINED_GLASS_WALL.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(MinecraftBlocks.GREEN_STAINED_GLASS_SLAB.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(MinecraftBlocks.GREEN_STAINED_GLASS_STAIRS.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(MinecraftBlocks.GREEN_STAINED_GLASS_WALL.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(MinecraftBlocks.RED_STAINED_GLASS_SLAB.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(MinecraftBlocks.RED_STAINED_GLASS_STAIRS.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(MinecraftBlocks.RED_STAINED_GLASS_WALL.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(MinecraftBlocks.BLACK_STAINED_GLASS_SLAB.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(MinecraftBlocks.BLACK_STAINED_GLASS_STAIRS.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(MinecraftBlocks.BLACK_STAINED_GLASS_WALL.get(), RenderType.getTranslucent());
    }
}
