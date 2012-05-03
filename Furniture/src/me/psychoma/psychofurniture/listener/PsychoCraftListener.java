package me.psychoma.psychofurniture.listener;

import java.util.Iterator;
import java.util.List;

import me.psychoma.psychofurniture.PsychoFurniture;
import me.psychoma.psychofurniture.furniture.PsychoBlocks;
import org.bukkit.ChatColor;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.inventory.CraftingInventory;
import org.bukkit.inventory.Inventory;

public class PsychoCraftListener implements Listener
{
	@SuppressWarnings("unused")
	private PsychoFurniture plugin;
	public PsychoCraftListener(PsychoFurniture plugin)
	{
		this.plugin = plugin;
	}
	
	@EventHandler(priority=org.bukkit.event.EventPriority.HIGH)
	public void CraftItem(CraftItemEvent event)
	{
		if(event.isCancelled())
            return;
		Inventory inv = event.getInventory();
		@SuppressWarnings("rawtypes")
		List viewers = event.getViewers();
        Player player = null;
        int craftedItemID = event.getRecipe().getResult().getDurability();
        
		if(!(inv instanceof CraftingInventory) || !event.getSlotType().equals(org.bukkit.event.inventory.InventoryType.SlotType.RESULT))
            return;
        if(viewers.size() == 0)
            return; 

        for(@SuppressWarnings("rawtypes")
		Iterator iterator = event.getViewers().iterator(); iterator.hasNext();)
        {
            HumanEntity viewer = (HumanEntity)iterator.next();
            if(viewer instanceof Player)
            {
                player = (Player)viewer;
                break;
            }
        }
        
        if(player == null)
            return;
        
        if (craftedItemID == PsychoBlocks.woodtable.getCustomId() || craftedItemID == PsychoBlocks.irontable.getCustomId() || craftedItemID == PsychoBlocks.goldtable.getCustomId())
        {
        	if (!player.hasPermission("PF.craft.table"))
        	{
        		player.sendMessage(ChatColor.RED + "You are not allowed to craft this item");
                event.setCancelled(true);
        	}
        	else
        	{
        		return;
        	}
        }
        else
        {
        	return;
        }
		
	}
}
