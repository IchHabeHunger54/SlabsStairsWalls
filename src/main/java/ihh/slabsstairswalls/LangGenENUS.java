package ihh.slabsstairswalls;

import java.util.function.Supplier;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;

public abstract class LangGenENUS extends LangGen {
    public LangGenENUS(DataGenerator g) {
        super(g, "en_us");
    }

    @Override
    public void slab(Supplier<Item> i, String k) {
        add(i.get(), k + " Slab");
    }

    @Override
    public void stairs(Supplier<Item> i, String k) {
        add(i.get(), k + " Stairs");
    }

    @Override
    public void wall(Supplier<Item> i, String k) {
        add(i.get(), k + " Wall");
    }

    @Override
    public void fence(Supplier<Item> i, String k) {
        add(i.get(), k + " Fence");
    }

    @Override
    public void fenceGate(Supplier<Item> i, String k) {
        add(i.get(), k + " Fence Gate");
    }

    @Override
    public void button(Supplier<Item> i, String k) {
        add(i.get(), k + " Button");
    }

    @Override
    public void pressurePlate(Supplier<Item> i, String k) {
        add(i.get(), k + " Pressure Plate");
    }

    @Override
    public void hedge(String b, String k) {
        add("item." + b, k + " Hedge");
    }
}
