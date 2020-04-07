package ihh.slabsstairswalls;

import java.util.function.Supplier;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;

public abstract class LangGenDEDE extends LangGen {
    public LangGenDEDE(DataGenerator g) {
        super(g, "de_de");
    }

    @Override
    public void slab(Supplier<Item> i, String k) {
        add(i.get(), k + "stufe");
    }

    @Override
    public void stairs(Supplier<Item> i, String k) {
        add(i.get(), k + "treppe");
    }

    @Override
    public void wall(Supplier<Item> i, String k) {
        add(i.get(), k + "mauer");
    }

    @Override
    public void fence(Supplier<Item> i, String k) {
        add(i.get(), k + "zaun");
    }

    @Override
    public void fenceGate(Supplier<Item> i, String k) {
        add(i.get(), k + "zauntor");
    }

    @Override
    public void button(Supplier<Item> i, String k) {
        add(i.get(), k + "knopf");
    }

    @Override
    public void pressurePlate(Supplier<Item> i, String k) {
        add(i.get(), k + "druckplatte");
    }

    @Override
    public void hedge(String b, String k) {
        add("item." + b, k + "hecke");
    }
}
