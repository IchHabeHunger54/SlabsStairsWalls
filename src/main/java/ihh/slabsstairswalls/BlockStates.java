package ihh.slabsstairswalls;

import java.util.function.Supplier;
import javax.annotation.Nonnull;
import net.minecraft.block.Block;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.client.model.generators.ModelProvider;

public abstract class BlockStates extends BlockStateProvider {
    public BlockStates(DataGenerator g, ExistingFileHelper e) {
        super(g, SlabsStairsWalls.MODID, e);
    }

    @Override
    protected void registerStatesAndModels() {
    }

    @Nonnull
    @Override
    public String getName() {
        return SlabsStairsWalls.MODNAME + ": Block State Provider";
    }

    public void slab(Supplier<SlabBlock> s, Block b) {
        slabBlock(s.get(), cubeAll(b).getLocation(), blockTexture(b));
    }

    public void stairs(Supplier<StairsBlock> s, Block b) {
        stairsBlock(s.get(), blockTexture(b));
    }

    public void wall(Supplier<WallBlock> s, Block b) {
        wallBlock(s.get(), blockTexture(b));
        models().withExistingParent(s.get().getRegistryName().getPath() + "_inventory", ModelProvider.BLOCK_FOLDER + "/wall_inventory").texture("wall", blockTexture(b));
    }

    public void fence(Supplier<FenceBlock> s, Block b) {
        fenceBlock(s.get(), blockTexture(b));
    }

    public void fenceGate(Supplier<FenceGateBlock> s, Block b) {
        fenceGateBlock(s.get(), blockTexture(b));
    }

    public void slab(Supplier<SlabBlock> s, String b, Block d) {
        slabBlock(s.get(), cubeAll(d).getLocation(), new ResourceLocation(b));
    }

    public void stairs(Supplier<StairsBlock> s, String b) {
        stairsBlock(s.get(), new ResourceLocation(b));
    }

    public void wall(Supplier<WallBlock> s, String b) {
        wallBlock(s.get(), new ResourceLocation(b));
        models().withExistingParent(s.get().getRegistryName().getPath() + "_inventory", ModelProvider.BLOCK_FOLDER + "/wall_inventory").texture("wall", b);
    }
}
