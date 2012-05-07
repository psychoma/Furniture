package me.psychoma.psychofurniture.recipes;

import me.psychoma.psychofurniture.PsychoFurniture;
import me.psychoma.psychofurniture.furniture.PsychoBlocks;

import org.bukkit.inventory.ItemStack;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.inventory.SpoutShapedRecipe;
import org.getspout.spoutapi.material.MaterialData;

public class PsychoRecipes {
    public static ItemStack res_woodtable1;
    public static ItemStack res_woodtable2;
    public static ItemStack res_irontable1;
    public static ItemStack res_irontable2;
    public static ItemStack res_goldtable1;
    public static ItemStack res_goldtable2;
    public static ItemStack res_woodchair;
    public static ItemStack res_ironchair;
    public static ItemStack res_goldchair;
    public static ItemStack res_woodthrone;
    public static ItemStack res_ironthrone;
    public static ItemStack res_goldthrone;
    public static ItemStack res_woodenbarstool;
	private static SpoutShapedRecipe recipe;

	public static void registerRecipes(PsychoFurniture psychoFurniture) 
	{
		res_woodtable1 = new SpoutItemStack(PsychoBlocks.woodtable, 1);
		recipe = new SpoutShapedRecipe(res_woodtable1);
		recipe.shape("AAA", "B B", "   ");
		recipe.setIngredient('A', MaterialData.wood);
		recipe.setIngredient('B', MaterialData.stick);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		res_woodtable2 = new SpoutItemStack(PsychoBlocks.woodtable, 1);
		recipe = new SpoutShapedRecipe(res_woodtable2);
		recipe.shape("   ", "AAA", "B B");
		recipe.setIngredient('A', MaterialData.wood);
		recipe.setIngredient('B', MaterialData.stick);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		res_irontable1 = new SpoutItemStack(PsychoBlocks.irontable, 1);
		recipe = new SpoutShapedRecipe(res_irontable1);
		recipe.shape("AAA", "B B", "   ");
		recipe.setIngredient('A', MaterialData.ironBlock);
		recipe.setIngredient('B', MaterialData.stick);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		res_irontable2 = new SpoutItemStack(PsychoBlocks.irontable, 1);
		recipe = new SpoutShapedRecipe(res_irontable2);
		recipe.shape("   ", "AAA", "B B");
		recipe.setIngredient('A', MaterialData.ironBlock);
		recipe.setIngredient('B', MaterialData.stick);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		res_goldtable1 = new SpoutItemStack(PsychoBlocks.goldtable, 1);
		recipe = new SpoutShapedRecipe(res_goldtable1);
		recipe.shape("AAA", "B B", "   ");
		recipe.setIngredient('A', MaterialData.goldBlock);
		recipe.setIngredient('B', MaterialData.stick);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		res_goldtable2 = new SpoutItemStack(PsychoBlocks.goldtable, 1);
		recipe = new SpoutShapedRecipe(res_goldtable2);
		recipe.shape("   ", "AAA", "B B");
		recipe.setIngredient('A', MaterialData.goldBlock);
		recipe.setIngredient('B', MaterialData.stick);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		res_woodchair = new SpoutItemStack(PsychoBlocks.woodchairN, 1);
		recipe = new SpoutShapedRecipe(res_woodchair);
		recipe.shape(" A ", "AAA", "B B");
		recipe.setIngredient('A', MaterialData.wood);
		recipe.setIngredient('B', MaterialData.stick);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		res_ironchair = new SpoutItemStack(PsychoBlocks.ironchairN, 1);
		recipe = new SpoutShapedRecipe(res_ironchair);
		recipe.shape(" A ", "AAA", "B B");
		recipe.setIngredient('A', MaterialData.ironBlock);
		recipe.setIngredient('B', MaterialData.stick);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		res_goldchair = new SpoutItemStack(PsychoBlocks.goldchairN, 1);
		recipe = new SpoutShapedRecipe(res_goldchair);
		recipe.shape(" A ", "AAA", "B B");
		recipe.setIngredient('A', MaterialData.goldBlock);
		recipe.setIngredient('B', MaterialData.stick);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		res_woodthrone = new SpoutItemStack(PsychoBlocks.woodthroneN, 1);
		recipe = new SpoutShapedRecipe(res_woodthrone);
		recipe.shape("BAB", "AAA", "B B");
		recipe.setIngredient('A', MaterialData.wood);
		recipe.setIngredient('B', MaterialData.stick);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		res_ironthrone = new SpoutItemStack(PsychoBlocks.ironthroneN, 1);
		recipe = new SpoutShapedRecipe(res_ironthrone);
		recipe.shape("CAC", "AAA", "B B");
		recipe.setIngredient('A', MaterialData.ironBlock);
		recipe.setIngredient('B', MaterialData.stick);
		recipe.setIngredient('C', MaterialData.ironIngot);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		res_goldthrone = new SpoutItemStack(PsychoBlocks.goldthroneN, 1);
		recipe = new SpoutShapedRecipe(res_goldthrone);
		recipe.shape("CAC", "AAA", "B B");
		recipe.setIngredient('A', MaterialData.goldBlock);
		recipe.setIngredient('B', MaterialData.stick);
		recipe.setIngredient('C', MaterialData.goldIngot);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		res_woodenbarstool = new SpoutItemStack(PsychoBlocks.woodenbarstool, 1);
		recipe = new SpoutShapedRecipe(res_woodenbarstool);
		recipe.shape("AAA", " B ", " B ");
		recipe.setIngredient('A', MaterialData.wood);
		recipe.setIngredient('B', MaterialData.stick);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
	
	}

}
