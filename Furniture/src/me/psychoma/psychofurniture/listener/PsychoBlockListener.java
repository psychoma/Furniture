package me.psychoma.psychofurniture.listener;

import me.psychoma.psychofurniture.PsychoFurniture;
import me.psychoma.psychofurniture.furniture.PsychoBlocks;
import me.psychoma.psychofurniture.utils.PsychoMethods;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.getspout.spoutapi.block.SpoutBlock;

public class PsychoBlockListener implements Listener
{
	@SuppressWarnings("unused")
	private PsychoFurniture plugin;
	public float yaw;
	public Player player;
	public SpoutBlock block;
	
	public PsychoBlockListener(PsychoFurniture plugin)
	{
		this.plugin = plugin;
	}
	
	@EventHandler(priority=org.bukkit.event.EventPriority.HIGH)
	public void onChairPlace(BlockPlaceEvent event)
	{
		player = event.getPlayer();
		block = (SpoutBlock)event.getBlock();
		yaw = player.getLocation().getYaw();
		if (yaw < 0) yaw = yaw+360;
		
		if (block.getCustomBlock() == null) return;
		if (block.getCustomBlock() == PsychoBlocks.woodchairN || block.getCustomBlock() == PsychoBlocks.woodchairE || block.getCustomBlock() == PsychoBlocks.woodchairS || block.getCustomBlock() == PsychoBlocks.woodchairW) 
		{
			if (yaw >= 225 && yaw < 315) {
				block.setCustomBlock(PsychoBlocks.woodchairE);
				return;
			}
			if (yaw >= 315 || yaw < 45) {				
				block.setCustomBlock(PsychoBlocks.woodchairN);
				return;
			}
			if (yaw >= 45 && yaw < 135) {				
				block.setCustomBlock(PsychoBlocks.woodchairW);
				return;
			}
			if (yaw >= 135 && yaw < 225) {				
				block.setCustomBlock(PsychoBlocks.woodchairS);
				return;
			}
			
		}
		if (block.getCustomBlock() == PsychoBlocks.ironchairN || block.getCustomBlock() == PsychoBlocks.ironchairE || block.getCustomBlock() == PsychoBlocks.ironchairS || block.getCustomBlock() == PsychoBlocks.ironchairW) 
		{
			if (yaw >= 225 && yaw < 315) {				
				block.setCustomBlock(PsychoBlocks.ironchairE);
				return;
			}
			if (yaw >= 315 || yaw < 45) {				
				block.setCustomBlock(PsychoBlocks.ironchairN);
				return;
			}
			if (yaw >= 45 && yaw < 135) {				
				block.setCustomBlock(PsychoBlocks.ironchairW);
				return;
			}
			if (yaw >= 135 && yaw < 225) {				
				block.setCustomBlock(PsychoBlocks.ironchairS);
				return;
			}
			
		}
		if (block.getCustomBlock() == PsychoBlocks.goldchairN || block.getCustomBlock() == PsychoBlocks.goldchairE || block.getCustomBlock() == PsychoBlocks.goldchairS || block.getCustomBlock() == PsychoBlocks.goldchairW) 
		{
			if (yaw >= 225 && yaw < 315) {				
				block.setCustomBlock(PsychoBlocks.goldchairE);
				return;
			}
			if (yaw >= 315 || yaw < 45) {				
				block.setCustomBlock(PsychoBlocks.goldchairN);
				return;
			}
			if (yaw >= 45 && yaw < 135) {				
				block.setCustomBlock(PsychoBlocks.goldchairW);
				return;
			}
			if (yaw >= 135 && yaw < 225) {				
				block.setCustomBlock(PsychoBlocks.goldchairS);
				return;
			}
			
		}
		
		if (block.getCustomBlock() == PsychoBlocks.woodthroneN || block.getCustomBlock() == PsychoBlocks.woodthroneE || block.getCustomBlock() == PsychoBlocks.woodthroneS || block.getCustomBlock() == PsychoBlocks.woodthroneW) 
		{
			if (yaw >= 225 && yaw < 315) {				
				block.setCustomBlock(PsychoBlocks.woodthroneE);
				return;
			}
			if (yaw >= 315 || yaw < 45) {				
				block.setCustomBlock(PsychoBlocks.woodthroneN);
				return;
			}
			if (yaw >= 45 && yaw < 135) {				
				block.setCustomBlock(PsychoBlocks.woodthroneW);
				return;
			}
			if (yaw >= 135 && yaw < 225) {				
				block.setCustomBlock(PsychoBlocks.woodthroneS);
				return;
			}
			
		}
		if (block.getCustomBlock() == PsychoBlocks.ironthroneN || block.getCustomBlock() == PsychoBlocks.ironthroneE || block.getCustomBlock() == PsychoBlocks.ironthroneS || block.getCustomBlock() == PsychoBlocks.ironthroneW) 
		{
			if (yaw >= 225 && yaw < 315) {				
				block.setCustomBlock(PsychoBlocks.ironthroneE);
				return;
			}
			if (yaw >= 315 || yaw < 45) {				
				block.setCustomBlock(PsychoBlocks.ironthroneN);
				return;
			}
			if (yaw >= 45 && yaw < 135) {				
				block.setCustomBlock(PsychoBlocks.ironthroneW);
				return;
			}
			if (yaw >= 135 && yaw < 225) {				
				block.setCustomBlock(PsychoBlocks.ironthroneS);
				return;
			}
			
		}
		if (block.getCustomBlock() == PsychoBlocks.goldthroneN || block.getCustomBlock() == PsychoBlocks.goldthroneE || block.getCustomBlock() == PsychoBlocks.goldthroneS || block.getCustomBlock() == PsychoBlocks.goldthroneW) 
		{
			if (yaw >= 225 && yaw < 315) {				
				block.setCustomBlock(PsychoBlocks.goldthroneE);
				return;
			}
			if (yaw >= 315 || yaw < 45) {				
				block.setCustomBlock(PsychoBlocks.goldthroneN);
				return;
			}
			if (yaw >= 45 && yaw < 135) {				
				block.setCustomBlock(PsychoBlocks.goldthroneW);
				return;
			}
			if (yaw >= 135 && yaw < 225) {			
				block.setCustomBlock(PsychoBlocks.goldthroneS);
				return;
			}
			
		}
		
	}

	@EventHandler(priority=org.bukkit.event.EventPriority.HIGH)
	public void onChairBreak(BlockBreakEvent event)
	{
		block = (SpoutBlock) event.getBlock();
		if(PsychoMethods.isWoodChair(block) || PsychoMethods.isIronChair(block) || PsychoMethods.isGoldChair(block) || PsychoMethods.isWoodThrone(block) || PsychoMethods.isIronThrone(block) || PsychoMethods.isGoldThrone(block))
		{
			Item drop = PsychoMethods.dropSeat((SpoutBlock) event.getBlock());
			
			for(Entity e : drop.getNearbyEntities(0.2, 0.2, 0.2)) {
				if(e != null && e instanceof Item && e.getPassenger() != null)
					e.remove();
			}
			
			drop.remove();
			return;
		}
		else return;
			
	}
}

