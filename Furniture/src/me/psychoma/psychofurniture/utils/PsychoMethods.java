package me.psychoma.psychofurniture.utils;

import java.util.ArrayList;
import java.util.List;

import me.psychoma.psychofurniture.furniture.PsychoBlocks;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;
import org.getspout.spoutapi.block.SpoutBlock;

public class PsychoMethods 
{
	
	public static Material item = Material.STONE_BUTTON;
	
	public PsychoMethods()
	{
		
	}

	public static boolean isSeat(SpoutBlock block)
	{
		if (isSimpleChair(block) || isBarStool(block) || isWoodChair(block) || isIronChair(block) || isGoldChair(block) || isWoodThrone(block) || isIronThrone(block) || isGoldThrone(block))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isSimpleChair(SpoutBlock block)
	{
		if (block.getCustomBlock() == PsychoBlocks.woodenbarstool) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isBarStool(SpoutBlock block)
	{
		if (block.getCustomBlock() == PsychoBlocks.woodenbarstool) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isWoodChair(SpoutBlock block)
	{
		if (block.getCustomBlock() == PsychoBlocks.woodchairN || block.getCustomBlock() == PsychoBlocks.woodchairE || block.getCustomBlock() == PsychoBlocks.woodchairS || block.getCustomBlock() == PsychoBlocks.woodchairW ) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isIronChair(SpoutBlock block)
	{
		if ( block.getCustomBlock() == PsychoBlocks.ironchairN || block.getCustomBlock() == PsychoBlocks.ironchairE || block.getCustomBlock() == PsychoBlocks.ironchairS || block.getCustomBlock() == PsychoBlocks.ironchairW)
		{
		return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isGoldChair(SpoutBlock block)
	{
		if (block.getCustomBlock() == PsychoBlocks.goldchairN || block.getCustomBlock() == PsychoBlocks.goldchairE || block.getCustomBlock() == PsychoBlocks.goldchairS || block.getCustomBlock() == PsychoBlocks.goldchairW)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isWoodThrone(SpoutBlock block)
	{
		if (block.getCustomBlock() == PsychoBlocks.woodthroneN || block.getCustomBlock() == PsychoBlocks.woodthroneE || block.getCustomBlock() == PsychoBlocks.woodthroneS || block.getCustomBlock() == PsychoBlocks.woodthroneW)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isIronThrone(SpoutBlock block)
	{
		if (block.getCustomBlock() == PsychoBlocks.ironthroneN || block.getCustomBlock() == PsychoBlocks.ironthroneE || block.getCustomBlock() == PsychoBlocks.ironthroneS || block.getCustomBlock() == PsychoBlocks.ironthroneW)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isGoldThrone(SpoutBlock block)
	{
		if (block.getCustomBlock() == PsychoBlocks.goldthroneN || block.getCustomBlock() == PsychoBlocks.goldthroneE || block.getCustomBlock() == PsychoBlocks.goldthroneS || block.getCustomBlock() == PsychoBlocks.goldthroneW)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static Item dropSeat(Block chair) {
		Location location = chair.getLocation().add(0.5, -1, 0.5);
		Item drop = location.getWorld().dropItemNaturally(location, new ItemStack(item));
		drop.setPickupDelay(Integer.MAX_VALUE);
		drop.teleport(location);
		drop.setVelocity(new Vector(0, 0, 0));
		return drop;
	}
	
	public static List<Item> checkChair(Item drop) {
		List<Item> drops = new ArrayList<Item>();
		for(Entity e : drop.getNearbyEntities(0.2, 0.2, 0.2)) {
			if(e != null && e instanceof Item && e.getPassenger() != null)
				drops.add(drop);
		}
		
		if(drops.isEmpty() == false)
			return drops;
		
		return null;
	}

}
