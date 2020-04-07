package ihh.slabsstairswalls;

import java.util.function.Supplier;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraftforge.common.data.LanguageProvider;

abstract class LangGen extends LanguageProvider {
    public LangGen(DataGenerator g, String l) {
        super(g, SlabsStairsWalls.MODID, l);
    }

    public abstract void slab(Supplier<Item> i, String k);

    public abstract void stairs(Supplier<Item> i, String k);

    public abstract void wall(Supplier<Item> i, String k);

    public abstract void fence(Supplier<Item> i, String k);

    public abstract void fenceGate(Supplier<Item> i, String k);

    public abstract void button(Supplier<Item> i, String k);

    public abstract void pressurePlate(Supplier<Item> i, String k);

    public abstract void hedge(String b, String k);
}
