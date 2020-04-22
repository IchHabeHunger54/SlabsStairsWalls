package ihh.slabsstairswalls;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;

public abstract class BlockTagGen extends BlockTagsProvider {
    public BlockTagGen(DataGenerator g) {
        super(g);
    }

    @Override
    protected abstract void registerTags();
}
