package ihh.slabsstairswalls;

import java.util.function.Supplier;
import javax.annotation.Nonnull;
import net.minecraft.block.Block;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.block.WoodButtonBlock;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;

public abstract class ItemModels extends ItemModelProvider {
    public ItemModels(DataGenerator g, ExistingFileHelper e) {
        super(g, SlabsStairsWalls.MODID, e);
    }

    @Override
    protected abstract void registerModels();

    @Nonnull
    @Override
    public String getName() {
        return SlabsStairsWalls.MODNAME + ": Item Model Provider";
    }

    public void parentBlock(Supplier<Block> b, String m) {
        getBuilder(b.get().getRegistryName().getPath()).parent(new ModelFile.UncheckedModelFile(m));
    }

    public void parentWall(Supplier<WallBlock> b, String m) {
        getBuilder(b.get().getRegistryName().getPath()).parent(new ModelFile.UncheckedModelFile(SlabsStairsWalls.MODID + ":block/" + m + "_wall_inventory"));
    }

    public void parentSlab(Supplier<SlabBlock> b, String m) {
        getBuilder(b.get().getRegistryName().getPath()).parent(new ModelFile.UncheckedModelFile(SlabsStairsWalls.MODID + ":block/" + m + "_slab"));
    }

    public void parentStairs(Supplier<StairsBlock> b, String m) {
        getBuilder(b.get().getRegistryName().getPath()).parent(new ModelFile.UncheckedModelFile(SlabsStairsWalls.MODID + ":block/" + m + "_stairs"));
    }

    public void parentVSlab(Supplier<VerticalSlabBlock> b, String m) {
        getBuilder(b.get().getRegistryName().getPath()).parent(new ModelFile.UncheckedModelFile(SlabsStairsWalls.MODID + ":block/" + m + "_vertical_slab"));
    }

    public void parentVStairs(Supplier<VerticalStairsBlock> b, String m) {
        getBuilder(b.get().getRegistryName().getPath()).parent(new ModelFile.UncheckedModelFile(SlabsStairsWalls.MODID + ":block/" + m + "_vertical_stairs"));
    }

    public void parentFence(Supplier<FenceBlock> b, String m) {
        getBuilder(b.get().getRegistryName().getPath()).parent(new ModelFile.UncheckedModelFile(SlabsStairsWalls.MODID + ":block/" + m + "_fence"));
    }

    public void parentFenceGate(Supplier<FenceGateBlock> b, String m) {
        getBuilder(b.get().getRegistryName().getPath()).parent(new ModelFile.UncheckedModelFile(SlabsStairsWalls.MODID + ":block/" + m + "_fence_gate"));
    }

    public void parentButton(Supplier<WoodButtonBlock> b, String m) {
        getBuilder(b.get().getRegistryName().getPath()).parent(new ModelFile.UncheckedModelFile(SlabsStairsWalls.MODID + ":block/" + m + "_button_inventory"));
    }

    public void parentPressurePlate(Supplier<PressurePlateBlock> b, String m) {
        getBuilder(b.get().getRegistryName().getPath()).parent(new ModelFile.UncheckedModelFile(SlabsStairsWalls.MODID + ":block/" + m + "_pressure_plate"));
    }
}
