package ihh.slabsstairswalls;

import java.util.function.Supplier;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraftforge.common.data.LanguageProvider;

abstract class LangGen extends LanguageProvider {
    public LangGen(DataGenerator g, String l) {
        super(g, SlabsStairsWalls.MODID, l);
    }

    @Override
    protected abstract void addTranslations();

    public abstract void slab(Supplier<Item> i, String k);

    public abstract void stairs(Supplier<Item> i, String k);

    public abstract void wall(Supplier<Item> i, String k);

    public abstract void vertSlab(Supplier<Item> i, String k);

    public abstract void vertStairs(Supplier<Item> i, String k);

    public abstract void fence(Supplier<Item> i, String k);

    public abstract void fenceGate(Supplier<Item> i, String k);

    public abstract void button(Supplier<Item> i, String k);

    public abstract void pressurePlate(Supplier<Item> i, String k);

    public abstract String white(String s);
    public abstract String orange(String s);
    public abstract String magenta(String s);
    public abstract String lightBlue(String s);
    public abstract String yellow(String s);
    public abstract String lime(String s);
    public abstract String pink(String s);
    public abstract String gray(String s);
    public abstract String lightGray(String s);
    public abstract String cyan(String s);
    public abstract String purple(String s);
    public abstract String blue(String s);
    public abstract String brown(String s);
    public abstract String green(String s);
    public abstract String red(String s);
    public abstract String black(String s);

    public void rainbow(String s, Supplier<Item> white, Supplier<Item> orange, Supplier<Item> magenta, Supplier<Item> lightBlue, Supplier<Item> yellow, Supplier<Item> lime, Supplier<Item> pink, Supplier<Item> gray, Supplier<Item> lightGray, Supplier<Item> cyan, Supplier<Item> purple, Supplier<Item> blue, Supplier<Item> brown, Supplier<Item> green, Supplier<Item> red, Supplier<Item> black) {
        add(white.get(), white(s));
        add(orange.get(), orange(s));
        add(magenta.get(), magenta(s));
        add(lightBlue.get(), lightBlue(s));
        add(yellow.get(), yellow(s));
        add(lime.get(), lime(s));
        add(pink.get(), pink(s));
        add(gray.get(), gray(s));
        add(lightGray.get(), lightGray(s));
        add(cyan.get(), cyan(s));
        add(purple.get(), purple(s));
        add(blue.get(), blue(s));
        add(brown.get(), brown(s));
        add(green.get(), green(s));
        add(red.get(), red(s));
        add(black.get(), black(s));
    }

    public void rainbowSlab(String s, Supplier<Item> white, Supplier<Item> orange, Supplier<Item> magenta, Supplier<Item> lightBlue, Supplier<Item> yellow, Supplier<Item> lime, Supplier<Item> pink, Supplier<Item> gray, Supplier<Item> lightGray, Supplier<Item> cyan, Supplier<Item> purple, Supplier<Item> blue, Supplier<Item> brown, Supplier<Item> green, Supplier<Item> red, Supplier<Item> black) {
        slab(white, white(s));
        slab(orange, orange(s));
        slab(magenta, magenta(s));
        slab(lightBlue, lightBlue(s));
        slab(yellow, yellow(s));
        slab(lime, lime(s));
        slab(pink, pink(s));
        slab(gray, gray(s));
        slab(lightGray, lightGray(s));
        slab(cyan, cyan(s));
        slab(purple, purple(s));
        slab(blue, blue(s));
        slab(brown, brown(s));
        slab(green, green(s));
        slab(red, red(s));
        slab(black, black(s));
    }

    public void rainbowStairs(String s, Supplier<Item> white, Supplier<Item> orange, Supplier<Item> magenta, Supplier<Item> lightBlue, Supplier<Item> yellow, Supplier<Item> lime, Supplier<Item> pink, Supplier<Item> gray, Supplier<Item> lightGray, Supplier<Item> cyan, Supplier<Item> purple, Supplier<Item> blue, Supplier<Item> brown, Supplier<Item> green, Supplier<Item> red, Supplier<Item> black) {
        stairs(white, white(s));
        stairs(orange, orange(s));
        stairs(magenta, magenta(s));
        stairs(lightBlue, lightBlue(s));
        stairs(yellow, yellow(s));
        stairs(lime, lime(s));
        stairs(pink, pink(s));
        stairs(gray, gray(s));
        stairs(lightGray, lightGray(s));
        stairs(cyan, cyan(s));
        stairs(purple, purple(s));
        stairs(blue, blue(s));
        stairs(brown, brown(s));
        stairs(green, green(s));
        stairs(red, red(s));
        stairs(black, black(s));
    }

    public void rainbowWall(String s, Supplier<Item> white, Supplier<Item> orange, Supplier<Item> magenta, Supplier<Item> lightBlue, Supplier<Item> yellow, Supplier<Item> lime, Supplier<Item> pink, Supplier<Item> gray, Supplier<Item> lightGray, Supplier<Item> cyan, Supplier<Item> purple, Supplier<Item> blue, Supplier<Item> brown, Supplier<Item> green, Supplier<Item> red, Supplier<Item> black) {
        wall(white, white(s));
        wall(orange, orange(s));
        wall(magenta, magenta(s));
        wall(lightBlue, lightBlue(s));
        wall(yellow, yellow(s));
        wall(lime, lime(s));
        wall(pink, pink(s));
        wall(gray, gray(s));
        wall(lightGray, lightGray(s));
        wall(cyan, cyan(s));
        wall(purple, purple(s));
        wall(blue, blue(s));
        wall(brown, brown(s));
        wall(green, green(s));
        wall(red, red(s));
        wall(black, black(s));
    }

    public void rainbowVertSlab(String s, Supplier<Item> white, Supplier<Item> orange, Supplier<Item> magenta, Supplier<Item> lightBlue, Supplier<Item> yellow, Supplier<Item> lime, Supplier<Item> pink, Supplier<Item> gray, Supplier<Item> lightGray, Supplier<Item> cyan, Supplier<Item> purple, Supplier<Item> blue, Supplier<Item> brown, Supplier<Item> green, Supplier<Item> red, Supplier<Item> black) {
        vertSlab(white, white(s));
        vertSlab(orange, orange(s));
        vertSlab(magenta, magenta(s));
        vertSlab(lightBlue, lightBlue(s));
        vertSlab(yellow, yellow(s));
        vertSlab(lime, lime(s));
        vertSlab(pink, pink(s));
        vertSlab(gray, gray(s));
        vertSlab(lightGray, lightGray(s));
        vertSlab(cyan, cyan(s));
        vertSlab(purple, purple(s));
        vertSlab(blue, blue(s));
        vertSlab(brown, brown(s));
        vertSlab(green, green(s));
        vertSlab(red, red(s));
        vertSlab(black, black(s));
    }

    public void rainbowVertStairs(String s, Supplier<Item> white, Supplier<Item> orange, Supplier<Item> magenta, Supplier<Item> lightBlue, Supplier<Item> yellow, Supplier<Item> lime, Supplier<Item> pink, Supplier<Item> gray, Supplier<Item> lightGray, Supplier<Item> cyan, Supplier<Item> purple, Supplier<Item> blue, Supplier<Item> brown, Supplier<Item> green, Supplier<Item> red, Supplier<Item> black) {
        vertStairs(white, white(s));
        vertStairs(orange, orange(s));
        vertStairs(magenta, magenta(s));
        vertStairs(lightBlue, lightBlue(s));
        vertStairs(yellow, yellow(s));
        vertStairs(lime, lime(s));
        vertStairs(pink, pink(s));
        vertStairs(gray, gray(s));
        vertStairs(lightGray, lightGray(s));
        vertStairs(cyan, cyan(s));
        vertStairs(purple, purple(s));
        vertStairs(blue, blue(s));
        vertStairs(brown, brown(s));
        vertStairs(green, green(s));
        vertStairs(red, red(s));
        vertStairs(black, black(s));
    }
}
