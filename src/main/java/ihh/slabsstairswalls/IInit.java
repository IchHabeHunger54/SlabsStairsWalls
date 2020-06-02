package ihh.slabsstairswalls;

import java.util.function.Supplier;
import net.minecraft.block.Block;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.block.WoodButtonBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public interface IInit {
    DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, SlabsStairsWalls.MODID);
    DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, SlabsStairsWalls.MODID);

    static RegistryObject<Item> registerItem(RegistryObject<? extends Block> b) {
        return ITEMS.register(b.getId().getPath(), b.lazyMap(block -> new BlockItem(block, new Item.Properties().group(SlabsStairsWalls.ITEM_GROUP))));
    }

    static RegistryObject<SlabBlock> registerSlab(Supplier<? extends Block> b) {
        return BLOCKS.register(b.get().getRegistryName().getPath() + "_slab", () -> new SlabBlock(Block.Properties.from(b.get())));
    }

    static RegistryObject<StairsBlock> registerStairs(Supplier<? extends Block> b) {
        return BLOCKS.register(b.get().getRegistryName().getPath() + "_stairs", () -> new StairsBlock(() -> b.get().getDefaultState(), Block.Properties.from(b.get())));
    }

    static RegistryObject<WallBlock> registerWall(Supplier<? extends Block> b) {
        return BLOCKS.register(b.get().getRegistryName().getPath() + "_wall", () -> new WallBlock(Block.Properties.from(b.get())));
    }

    static RegistryObject<VerticalSlabBlock> registerVSlab(Supplier<? extends Block> b) {
        return BLOCKS.register(b.get().getRegistryName().getPath() + "_vertical_slab", () -> new VerticalSlabBlock(b));
    }

    static RegistryObject<VerticalStairsBlock> registerVStairs(Supplier<? extends Block> b) {
        return BLOCKS.register(b.get().getRegistryName().getPath() + "_vertical_stairs", () -> new VerticalStairsBlock(b));
    }

    static RegistryObject<SlabBlock> registerSlab(String n, Supplier<? extends Block> b) {
        return BLOCKS.register(n + "_slab", () -> new SlabBlock(Block.Properties.from(b.get())));
    }

    static RegistryObject<StairsBlock> registerStairs(String n, Supplier<? extends Block> b) {
        return BLOCKS.register(n + "_stairs", () -> new StairsBlock(() -> b.get().getDefaultState(), Block.Properties.from(b.get())));
    }

    static RegistryObject<WallBlock> registerWall(String n, Supplier<? extends Block> b) {
        return BLOCKS.register(n + "_wall", () -> new WallBlock(Block.Properties.from(b.get())));
    }

    static RegistryObject<VerticalSlabBlock> registerVSlab(String n, Supplier<? extends Block> b) {
        return BLOCKS.register(n + "_vertical_slab", () -> new VerticalSlabBlock(b));
    }

    static RegistryObject<VerticalStairsBlock> registerVStairs(String n, Supplier<? extends Block> b) {
        return BLOCKS.register(n + "_vertical_stairs", () -> new VerticalStairsBlock(b));
    }

    static RegistryObject<FenceBlock> registerFence(String n, Supplier<Block> b) {
        return BLOCKS.register(n + "_fence", () -> new FenceBlock(Block.Properties.from(b.get())));
    }

    static RegistryObject<FenceGateBlock> registerFenceGate(String n, Supplier<Block> b) {
        return BLOCKS.register(n + "_fence_gate", () -> new FenceGateBlock(Block.Properties.from(b.get())));
    }

    static RegistryObject<WoodButtonBlock> registerButton(String n, Supplier<Block> b) {
        return BLOCKS.register(n + "_button", () -> new WoodButtonBlock(Block.Properties.from(b.get())) {
        });
    }

    static RegistryObject<PressurePlateBlock> registerPressurePlate(String n, Supplier<Block> b) {
        return BLOCKS.register(n + "_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.from(b.get())) {
        });
    }
}
