package com.foodcraft.gui.recipes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.foodcraft.init.FoodcraftItems;
import com.foodcraft.itemstack.CookingOutput;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


public class RecipePan {
	
	private static final RecipePan smeltingBase = new RecipePan();
    private Map<ItemStack,CookingOutput> smeltingList = new HashMap();
    private Map experienceList = new HashMap();
    
    public static RecipePan smelting() {
        return smeltingBase;
    }
    
    private RecipePan() {
    	this.itemregister(Items.egg, new ItemStack(FoodcraftItems.ItemPoachedEgg), 0.5F, 250, 400);
        this.itemregister(FoodcraftItems.ItemFlour, new ItemStack(FoodcraftItems.ItemPancakes), 0.5F, 250, 350);
        this.itemregister(FoodcraftItems.ItemDumpling, new ItemStack(FoodcraftItems.ItemFriedDumpling), 0.5F, 350, 400);
        this.itemregister(FoodcraftItems.ItemPotatoChips, new ItemStack(FoodcraftItems.ItemFriedPotatoChips), 0.5F, 225, 325);
        this.itemregister(FoodcraftItems.ItemFlourSilk, new ItemStack(FoodcraftItems.ItemDoughTwist), 0.5F, 300, 380);
        this.itemregister(FoodcraftItems.ItemYumi, new ItemStack(FoodcraftItems.ItemBaoyumihua), 0.5F, 250, 330);
    }
   
    public void blockregister(Block Block, ItemStack ItemStack, float xp, int min, int max) {
        this.itemregister(Item.getItemFromBlock(Block), ItemStack, xp, min, max);
    }
	  
	public void itemregister(Item Item, ItemStack ItemStack, float xp, int min, int max) {
	        this.register(new ItemStack(Item, 1, 32767), ItemStack, xp, min, max);
	}

	public void register(ItemStack ItemStack, ItemStack ItemStack2, float xp ,int min, int max) {
	        this.smeltingList.put(ItemStack, new CookingOutput(ItemStack2,min,max));
	        this.experienceList.put(ItemStack2, Float.valueOf(xp));
	}

 
 	private boolean func_151397_a(ItemStack p_151397_1_, ItemStack p_151397_2_) {
     return p_151397_2_.getItem() == p_151397_1_.getItem() && (p_151397_2_.getItemDamage() == 32767 || p_151397_2_.getItemDamage() == p_151397_1_.getItemDamage());
 	}

	public CookingOutput getSmeltingResult(ItemStack itemStack) {
	    Iterator iterator = this.smeltingList.entrySet().iterator();
	    Entry entry;
	    do {
	        if (!iterator.hasNext()) {
	            return null;
	        }
	        entry = (Entry)iterator.next();
	    }
	    while (!this.func_151397_a(itemStack, (ItemStack)entry.getKey()));
	    return (CookingOutput)entry.getValue();
	}

	public Map<ItemStack, CookingOutput> getSmeltingList() {
		return this.smeltingList;
	}
}
