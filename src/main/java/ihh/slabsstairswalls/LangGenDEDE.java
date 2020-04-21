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
    public void vertSlab(Supplier<Item> i, String k) {
        add(i.get(), "Vertikale " + k + "stufe");
    }

    @Override
    public void vertStairs(Supplier<Item> i, String k) {
        add(i.get(), "Vertikale " + k + "treppe");
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
    public String white(String s) {
        return "Weiße " + s;
    }

    @Override
    public String orange(String s) {
        return "Orange " + s;
    }

    @Override
    public String magenta(String s) {
        return "Magenta " + s;
    }

    @Override
    public String lightBlue(String s) {
        return "Hellblaue " + s;
    }

    @Override
    public String yellow(String s) {
        return "Gelbe " + s;
    }

    @Override
    public String lime(String s) {
        return "Hellgrüne " + s;
    }

    @Override
    public String pink(String s) {
        return "Pinke " + s;
    }

    @Override
    public String gray(String s) {
        return "Graue " + s;
    }

    @Override
    public String lightGray(String s) {
        return "Hellgraue " + s;
    }

    @Override
    public String cyan(String s) {
        return "Türkise " + s;
    }

    @Override
    public String purple(String s) {
        return "Violette " + s;
    }

    @Override
    public String blue(String s) {
        return "Blaue " + s;
    }

    @Override
    public String brown(String s) {
        return "Braune " + s;
    }

    @Override
    public String green(String s) {
        return "Grüne " + s;
    }

    @Override
    public String red(String s) {
        return "Rote " + s;
    }

    @Override
    public String black(String s) {
        return "Schwarze " + s;
    }
}
