package com.foodcraft.support.nei;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.foodcraft.gui.recipes.RecipeBrewBarrel;
import com.foodcraft.init.FoodcraftItems;
import com.foodcraft.itemstack.FoodcraftItemStack;

import net.minecraft.block.Block;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import codechicken.nei.ItemList;
import codechicken.nei.NEIClientUtils;
import codechicken.nei.NEIServerUtils;
import codechicken.nei.PositionedStack;
import codechicken.nei.recipe.TemplateRecipeHandler;
import codechicken.nei.recipe.TemplateRecipeHandler.CachedRecipe;
import codechicken.nei.recipe.TemplateRecipeHandler.RecipeTransferRect;

public class BrewBarrelRecipeHandler extends TemplateRecipeHandler {
	//*********************************************************************************************************************************************************************
	public class SmeltingPair extends CachedRecipe
    {
        public SmeltingPair(FoodcraftItemStack foodcraftItemStack, ItemStack result) {
           ItemStack[] is = new ItemStack[foodcraftItemStack.getItems().length];
        int w = 0;
           for(Item item : foodcraftItemStack.getItems()){
        		is[w] = new ItemStack(item);
                w += 1;
           }
           ingred = new PositionedStack[foodcraftItemStack.getItems().length];
        	this.ingred[0] = new PositionedStack(is[0], 51 - 5, 28 - 11);
        	this.ingred[1] = new PositionedStack(is[1], 75 - 5, 28 - 11);
        	this.ingred[2] = new PositionedStack(is[2], 98 - 5, 28 - 11);
        	
            this.result = new PositionedStack(result, 135 - 5, 55 - 11);
            
            water =  new PositionedStack(new ItemStack(FoodcraftItems.Itemwater), 34 - 5, 55 - 11);
        }

        public List<PositionedStack> getIngredients() {
            return getCycledIngredients(cycleticks / 48, Arrays.asList(ingred));
        }

        public PositionedStack getResult() {
            return result;
        }

        public List<PositionedStack> getOtherStacks() {
            ArrayList<PositionedStack> stacks = new ArrayList<PositionedStack>();
            PositionedStack stack = getOtherStack();
            if (stack != null)
                stacks.add(stack);
            stacks.add(water);
            return stacks;
        }
        
        PositionedStack ingred[];
        PositionedStack result;
        PositionedStack water;
    }
	//*********************************************************************************************************************************************************************
  //*********************************************************************************************************************************************************************
    public static HashSet<Block> efuels;

    @Override
    public void loadTransferRects() {
    	transferRects.add(new RecipeTransferRect(new Rectangle(118 - 5, 30 - 11, 22, 17), "NtBrewing"));
    }

    @Override
    public Class<? extends GuiContainer> getGuiClass() {
        return com.foodcraft.gui.guis.GuiBrewBarrel.class;
    }

    @Override
    public String getRecipeName() {
        return NEIClientUtils.translate("tile.Nt.name");
    }

    @Override
    public TemplateRecipeHandler newInstance() {
        return super.newInstance();
    }

    @Override
    public void loadCraftingRecipes(String outputId, Object... results) {
        if (outputId.equals("NtBrewing") && getClass() == BrewBarrelRecipeHandler.class) {//don't want subclasses getting a hold of this
            Map<FoodcraftItemStack, ItemStack> recipes = (Map<FoodcraftItemStack, ItemStack>) RecipeBrewBarrel.brewing().getSmeltingList();
            for (Entry<FoodcraftItemStack, ItemStack> recipe : recipes.entrySet())
                arecipes.add(new SmeltingPair(recipe.getKey(), recipe.getValue()));
        } else
            super.loadCraftingRecipes(outputId, results);
    }

    @Override
    public void loadCraftingRecipes(ItemStack result) {
        Map<FoodcraftItemStack, ItemStack> recipes = (Map<FoodcraftItemStack, ItemStack>) RecipeBrewBarrel.brewing().getSmeltingList();
        for (Entry<FoodcraftItemStack, ItemStack> recipe : recipes.entrySet())
            if (NEIServerUtils.areStacksSameType(recipe.getValue(), result))
                arecipes.add(new SmeltingPair(recipe.getKey(), recipe.getValue()));
    }

    @Override
    public void loadUsageRecipes(String inputId, Object... ingredients) {
        if (inputId.equals("fuel") && getClass() == BrewBarrelRecipeHandler.class)//don't want subclasses getting a hold of this
            loadCraftingRecipes("NtBrewing");
        else
            super.loadUsageRecipes(inputId, ingredients);
    }

    @Override
    public void loadUsageRecipes(ItemStack ingredient) {
        Map<FoodcraftItemStack, ItemStack> recipes = (Map<FoodcraftItemStack, ItemStack>) RecipeBrewBarrel.brewing().getSmeltingList();
        for (Entry<FoodcraftItemStack, ItemStack> recipe : recipes.entrySet())
            if (NEIServerUtils.areStacksSameTypeCrafting(new ItemStack(recipe.getKey().getItems()[0]), ingredient) &&
            		NEIServerUtils.areStacksSameTypeCrafting(new ItemStack(recipe.getKey().getItems()[1]), ingredient) &&
            		NEIServerUtils.areStacksSameTypeCrafting(new ItemStack(recipe.getKey().getItems()[2]), ingredient)) {
                SmeltingPair arecipe = new SmeltingPair(recipe.getKey(), recipe.getValue());
                arecipe.setIngredientPermutation(Arrays.asList(arecipe.ingred), ingredient);
                arecipes.add(arecipe);
            }
    }

    @Override
    public String getGuiTexture() {
        return "foodcraft:textures/gui/nei/nt.png";
    }

    @Override
    public void drawExtras(int recipe) {
        drawProgressBar(15 - 5, 0, 176, 31, 11, 58, 48, 3);
    }

    private static Set<Item> excludedFuels() {
        Set<Item> efuels = new HashSet<Item>();
        efuels.add(Item.getItemFromBlock(Blocks.brown_mushroom));
        efuels.add(Item.getItemFromBlock(Blocks.red_mushroom));
        efuels.add(Item.getItemFromBlock(Blocks.standing_sign));
        efuels.add(Item.getItemFromBlock(Blocks.wall_sign));
        efuels.add(Item.getItemFromBlock(Blocks.trapped_chest));
        return efuels;
    }



    @Override
    public String getOverlayIdentifier() {
        return "NtBrewing";
    }

}
