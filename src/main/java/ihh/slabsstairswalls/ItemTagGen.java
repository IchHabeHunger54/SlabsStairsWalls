package ihh.slabsstairswalls;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;

public abstract class ItemTagGen extends ItemTagsProvider {
    public ItemTagGen(DataGenerator g) {
        super(g);
    }

    @Override
    protected void registerTags() {
    }
}
