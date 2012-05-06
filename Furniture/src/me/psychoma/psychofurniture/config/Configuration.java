package me.psychoma.psychofurniture.config;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;

import org.bukkit.Bukkit;

public class Configuration
{

    public Configuration()
    {
    }

    public static void start()
    {
    	Bukkit.getLogger().log(Level.INFO, "[PsychoFurniture] Configuration loading...");
    }

    private static void exclaim(String filename)
    {
    	Bukkit.getLogger().log(Level.INFO, "[PsychoFurniture] Saved file ");
    }

    private static void complain(String filename)
    {
    	Bukkit.getLogger().log(Level.SEVERE, "[PsychoFurniture] On file ");
    	Bukkit.getLogger().log(Level.SEVERE, "[PsychoFurniture] Invalid configuration!");
    }

    private static void complainFileCreation(String filename)
    {
    	Bukkit.getLogger().log(Level.SEVERE, "[PsychoFurniture] On file ");
    	Bukkit.getLogger().log(Level.SEVERE, "[PsychoFurniture] Could NOT create default files!");
    }

    private static boolean load(MyConfiguration y, String name)
    {
        try
        {
            y.load((new StringBuilder("plugins/Furniture/")).append(name).toString());
        }
        catch(FileNotFoundException e)
        {
            return true;
        }
        catch(Exception e)
        {
            complain(name);
        }
        return false;
    }

    private static void save(MyConfiguration y)
    {
        try
        {
            y.save();
            try
            {
                y.load((new StringBuilder("plugins/Furniture/")).append(y.getFilename()).toString());
            }
            catch(Exception exception) { }
            exclaim(y.getFilename());
        }
        catch(IOException e)
        {
            complainFileCreation(y.getFilename());
        }
    }

    public static MyConfiguration texture;

    static 
    {
        texture = new MyConfiguration();
        if(load(texture, "textures.yml"))
        {
            texture = MyConfiguration.loadConfiguration("plugins/Furniture/textures.yml");
            TextureConfig.set();
            save(texture);
        }
        TextureConfig.set();
        try
        {
            texture.save();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
