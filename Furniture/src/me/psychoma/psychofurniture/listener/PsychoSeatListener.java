package me.psychoma.psychofurniture.listener;

import java.util.List;

import me.psychoma.psychofurniture.PsychoFurniture;
import me.psychoma.psychofurniture.utils.PsychoMethods;

import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;
import org.getspout.spoutapi.block.SpoutBlock;

public class PsychoSeatListener implements Listener
{
	public Player player;
	public SpoutBlock block;
	public Material item;
	
	public PsychoSeatListener(PsychoFurniture plugin) 
	{
	}
	
	@EventHandler
	public void onSeatClicked(PlayerInteractEvent event)
	{
		player = event.getPlayer();
		block = (SpoutBlock) event.getClickedBlock();
		item = Material.STONE_BUTTON;
		
		if(PsychoMethods.isSeat(block) && event.getAction() == Action.RIGHT_CLICK_BLOCK && event.getPlayer().isSneaking()) {
			if(player.getVehicle() != null)
			{
				player.getVehicle().remove();
				return;
			}
			else
			{
				if(block.getRelative(BlockFace.DOWN).getTypeId() == 0 || net.minecraft.server.Block.byId[block.getRelative(BlockFace.DOWN).getTypeId()].a() != true)
					return;
				Item drop = PsychoMethods.dropSeat(block);				
				List<Item> drops = PsychoMethods.checkChair(drop);
				if (drops != null) {
					drop.remove();
					return;
				}
				drop.setItemStack(new ItemStack(item));
				drop.setPassenger(player);
				return;
			}
		}
	}
		@EventHandler
		public void onPlayerQuit(PlayerQuitEvent event) {
			Entity vehicle = event.getPlayer().getVehicle();
			
			// Let players stand up when leaving the server.
			if(vehicle != null && vehicle instanceof Item)
				vehicle.remove();
	}
	

	

}
