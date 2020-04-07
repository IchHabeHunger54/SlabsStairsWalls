package ihh.slabsstairswalls;

import java.util.function.Consumer;
import java.util.function.Supplier;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.advancements.criterion.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.data.ShapelessRecipeBuilder;
import net.minecraft.data.SingleItemRecipeBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ForgeRecipeProvider;

public abstract class RecipeGen extends ForgeRecipeProvider {
    public RecipeGen(DataGenerator g) {
        super(g);
    }

    public static void slabRecipe(Supplier<Item> r, Supplier<Item> b, boolean s, Consumer<IFinishedRecipe> c) {
        ShapedRecipeBuilder.shapedRecipe(r.get(), 6).patternLine("###").key('#', b.get()).addCriterion("item", InventoryChangeTrigger.Instance.forItems(b.get())).build(c);
        ShapelessRecipeBuilder.shapelessRecipe(b.get()).addIngredient(r.get()).addIngredient(r.get()).addCriterion("item", InventoryChangeTrigger.Instance.forItems(r.get())).build(c, new ResourceLocation(SlabsStairsWalls.MODID, Registry.ITEM.getKey(r.get()).getPath() + "_uncrafting"));
        if (s) SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(b.get()), r.get(), 2);
    }

    public static void stairsRecipe(Supplier<Item> r, Supplier<Item> b, boolean s, Consumer<IFinishedRecipe> c) {
        ShapedRecipeBuilder.shapedRecipe(r.get(), 8).patternLine("#  ").patternLine("## ").patternLine("###").key('#', b.get()).addCriterion("item", InventoryChangeTrigger.Instance.forItems(b.get())).build(c);
        ShapelessRecipeBuilder.shapelessRecipe(b.get(), 3).addIngredient(r.get()).addIngredient(r.get()).addIngredient(r.get()).addIngredient(r.get()).addCriterion("item", InventoryChangeTrigger.Instance.forItems(r.get())).build(c, new ResourceLocation(SlabsStairsWalls.MODID, Registry.ITEM.getKey(r.get()).getPath() + "_uncrafting"));
        if (s) SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(b.get()), r.get());
    }

    public static void wallRecipe(Supplier<Item> r, Supplier<Item> b, boolean s, Consumer<IFinishedRecipe> c) {
        ShapedRecipeBuilder.shapedRecipe(r.get(), 8).patternLine("###").patternLine("###").key('#', b.get()).addCriterion("item", InventoryChangeTrigger.Instance.forItems(b.get())).build(c);
        ShapelessRecipeBuilder.shapelessRecipe(b.get(), 3).addIngredient(r.get()).addIngredient(r.get()).addIngredient(r.get()).addIngredient(r.get()).addCriterion("item", InventoryChangeTrigger.Instance.forItems(r.get())).build(c, new ResourceLocation(SlabsStairsWalls.MODID, Registry.ITEM.getKey(r.get()).getPath() + "_uncrafting"));
        if (s) SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(b.get()), r.get());
    }

    public static void fenceRecipe(Supplier<Item> r, Supplier<Item> b, Supplier<Item> s, Consumer<IFinishedRecipe> c) {
        ShapedRecipeBuilder.shapedRecipe(r.get(), 3).patternLine("#x#").patternLine("#x#").key('#', b.get()).key('x', s.get()).addCriterion("item", InventoryChangeTrigger.Instance.forItems(b.get())).build(c);
    }

    public static void fenceGateRecipe(Supplier<Item> r, Supplier<Item> b, Supplier<Item> s, Consumer<IFinishedRecipe> c) {
        ShapedRecipeBuilder.shapedRecipe(r.get()).patternLine("x#x").patternLine("x#x").key('#', b.get()).key('x', s.get()).addCriterion("item", InventoryChangeTrigger.Instance.forItems(b.get())).build(c);
    }

    public static void fenceRecipe(Supplier<Item> r, Tag<Item> b, Tag<Item> s, Consumer<IFinishedRecipe> c) {
        ShapedRecipeBuilder.shapedRecipe(r.get(), 3).patternLine("#x#").patternLine("#x#").key('#', b).key('x', s).addCriterion("item", InventoryChangeTrigger.Instance.forItems(ItemPredicate.Builder.create().tag(b).build())).build(c);
    }

    public static void fenceGateRecipe(Supplier<Item> r, Tag<Item> b, Tag<Item> s, Consumer<IFinishedRecipe> c) {
        ShapedRecipeBuilder.shapedRecipe(r.get()).patternLine("x#x").patternLine("x#x").key('#', b).key('x', s).addCriterion("item", InventoryChangeTrigger.Instance.forItems(ItemPredicate.Builder.create().tag(b).build())).build(c);
    }

    public static void fenceRecipe(Supplier<Item> r, Supplier<Item> b, Tag<Item> s, Consumer<IFinishedRecipe> c) {
        ShapedRecipeBuilder.shapedRecipe(r.get(), 3).patternLine("#x#").patternLine("#x#").key('#', b.get()).key('x', s).addCriterion("item", InventoryChangeTrigger.Instance.forItems(b.get())).build(c);
    }

    public static void fenceGateRecipe(Supplier<Item> r, Supplier<Item> b, Tag<Item> s, Consumer<IFinishedRecipe> c) {
        ShapedRecipeBuilder.shapedRecipe(r.get()).patternLine("x#x").patternLine("x#x").key('#', b.get()).key('x', s).addCriterion("item", InventoryChangeTrigger.Instance.forItems(b.get())).build(c);
    }

    public static void fenceRecipe(Supplier<Item> r, Tag<Item> b, Supplier<Item> s, Consumer<IFinishedRecipe> c) {
        ShapedRecipeBuilder.shapedRecipe(r.get(), 3).patternLine("#x#").patternLine("#x#").key('#', b).key('x', s.get()).addCriterion("item", InventoryChangeTrigger.Instance.forItems(ItemPredicate.Builder.create().tag(b).build())).build(c);
    }

    public static void fenceGateRecipe(Supplier<Item> r, Tag<Item> b, Supplier<Item> s, Consumer<IFinishedRecipe> c) {
        ShapedRecipeBuilder.shapedRecipe(r.get()).patternLine("x#x").patternLine("x#x").key('#', b).key('x', s.get()).addCriterion("item", InventoryChangeTrigger.Instance.forItems(ItemPredicate.Builder.create().tag(b).build())).build(c);
    }

    public static void fenceRecipe(Supplier<Item> r, Tag<Item> b, Consumer<IFinishedRecipe> c) {
        fenceRecipe(r, b, Tags.Items.RODS_WOODEN, c);
    }

    public static void fenceGateRecipe(Supplier<Item> r, Tag<Item> b, Consumer<IFinishedRecipe> c) {
        fenceGateRecipe(r, b, Tags.Items.RODS_WOODEN, c);
    }

    public static void fenceRecipe(Supplier<Item> r, Supplier<Item> b, Consumer<IFinishedRecipe> c) {
        fenceRecipe(r, b, Tags.Items.RODS_WOODEN, c);
    }

    public static void fenceGateRecipe(Supplier<Item> r, Supplier<Item> b, Consumer<IFinishedRecipe> c) {
        fenceGateRecipe(r, b, Tags.Items.RODS_WOODEN, c);
    }

    public static void buttonRecipe(Supplier<Item> r, Supplier<Item> b, boolean s, Consumer<IFinishedRecipe> c) {
        ShapelessRecipeBuilder.shapelessRecipe(r.get()).addIngredient(b.get()).addCriterion("item", InventoryChangeTrigger.Instance.forItems(b.get())).build(c);
        ShapelessRecipeBuilder.shapelessRecipe(b.get()).addIngredient(r.get()).addCriterion("item", InventoryChangeTrigger.Instance.forItems(r.get())).build(c, new ResourceLocation(SlabsStairsWalls.MODID, Registry.ITEM.getKey(r.get()).getPath() + "_uncrafting"));
        if (s) {
            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(b.get()), r.get());
            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(r.get()), b.get());
        }
    }

    public static void pressurePlateRecipe(Supplier<Item> r, Supplier<Item> b, boolean s, Consumer<IFinishedRecipe> c) {
        ShapedRecipeBuilder.shapedRecipe(r.get()).patternLine("##").key('#', b.get()).addCriterion("item", InventoryChangeTrigger.Instance.forItems(b.get())).build(c);
        ShapelessRecipeBuilder.shapelessRecipe(b.get(), 2).addIngredient(r.get()).addCriterion("item", InventoryChangeTrigger.Instance.forItems(r.get())).build(c, new ResourceLocation(SlabsStairsWalls.MODID, Registry.ITEM.getKey(r.get()).getPath() + "_uncrafting"));
        if (s) {
            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(b.get()), r.get());
            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(r.get()), b.get(), 2);
        }
    }
}