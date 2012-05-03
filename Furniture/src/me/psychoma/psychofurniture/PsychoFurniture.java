package me.psychoma.psychofurniture;

import java.util.logging.Level;


import me.psychoma.psychofurniture.furniture.PsychoBlocks;
import me.psychoma.psychofurniture.listener.PsychoBlockListener;
import me.psychoma.psychofurniture.listener.PsychoSeatListener;
import me.psychoma.psychofurniture.recipes.PsychoRecipes;
import net.milkbowl.vault.permission.Permission;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;
import org.getspout.spoutapi.block.design.Texture;

public class PsychoFurniture extends JavaPlugin
{
	public Texture chair;
	public Texture table;
	public Texture throne;
	public static Permission permission = null;
	
	
	public PsychoFurniture()
	{
		
	}
	
	
	public void onDisable()
	{
		Bukkit.getLogger().log(Level.INFO, "[PsychoFurniture] Disabled!");
	}
	
	public void onEnable()
	{
		Bukkit.getLogger().log(Level.INFO, "[PsychoFurniture] Enabled!");
		Bukkit.getLogger().log(Level.INFO, "[PsychoFurniture] Hooking into Vault...");
        if(getServer().getPluginManager().getPlugin("Vault") != null)
        {
            if(!setupPermissions())
            {
            	Bukkit.getLogger().log(Level.WARNING, "[PsychoFurniture] Can't find an permissions plugin.");
            	getServer().getPluginManager().disablePlugin(this);
            }
            else
            	Bukkit.getLogger().log(Level.INFO, "[PsychoFurniture] Connected to permissions plugin via Vault!");
        } else
        {
        	Bukkit.getLogger().log(Level.WARNING, "[PsychoFurniture] Vault plugin not found.");
        }
		loadtextures();
		Bukkit.getLogger().log(Level.INFO, "[PsychoFurniture] Loading pieces of furniture");
		PsychoBlocks.registerBlocks(this);
		Bukkit.getLogger().log(Level.INFO, "[PsychoFurniture] Loading recipes!");
		PsychoRecipes.registerRecipes(this);
		//getServer().getPluginManager().registerEvents(new PsychoCraftListener(this), this);
		getServer().getPluginManager().registerEvents(new PsychoBlockListener(this), this);
		getServer().getPluginManager().registerEvents(new PsychoSeatListener(this), this);
	}

	private void loadtextures() 
	{
		table = new Texture(this, "http://dl.dropbox.com/u/50790929/Minecraft/Plugins/table.png", 256, 256, 16);
		chair = new Texture(this, "http://dl.dropbox.com/u/50790929/Minecraft/Plugins/chair.png", 256, 256, 16);
		throne = new Texture(this, "http://dl.dropbox.com/u/50790929/Minecraft/Plugins/throne.png", 256, 256, 16);
	}
	
    private boolean setupPermissions()
    {
		@SuppressWarnings("rawtypes")
		RegisteredServiceProvider permissionProvider = getServer().getServicesManager().getRegistration(net.milkbowl.vault.permission.Permission.class);
        if(permissionProvider != null)
            permission = (Permission)permissionProvider.getProvider();
        return (permission != null);
    }
      
    
    public static boolean hasPermission(Player player, String permissionNode)
    {
        if(permission != null)
            return permission.has(player, permissionNode);
        else
            return player.hasPermission(permissionNode);
    }

}
