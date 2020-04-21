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
    public void vertSlab(Supplier<Item> i, String k) {
        add(i.get(), "Vertical " + k + " Slab");
    }

    @Override
    public void vertStairs(Supplier<Item> i, String k) {
        add(i.get(), "Vertical " + k + " Stairs");
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
    public String white(String s) {
        return "White " + s;
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
        return "Light Blue " + s;
    }

    @Override
    public String yellow(String s) {
        return "Yellow " + s;
    }

    @Override
    public String lime(String s) {
        return "Lime " + s;
    }

    @Override
    public String pink(String s) {
        return "Pink " + s;
    }

    @Override
    public String gray(String s) {
        return "Gray " + s;
    }

    @Override
    public String lightGray(String s) {
        return "Light Gray " + s;
    }

    @Override
    public String cyan(String s) {
        return "Cyan " + s;
    }

    @Override
    public String purple(String s) {
        return "Purple " + s;
    }

    @Override
    public String blue(String s) {
        return "Blue " + s;
    }

    @Override
    public String brown(String s) {
        return "Brown " + s;
    }

    @Override
    public String green(String s) {
        return "Green " + s;
    }

    @Override
    public String red(String s) {
        return "Red " + s;
    }

    @Override
    public String black(String s) {
        return "Black " + s;
    }
}
