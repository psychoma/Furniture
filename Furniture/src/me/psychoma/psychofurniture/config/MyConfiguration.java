package me.psychoma.psychofurniture.config;

import java.io.*;
import java.util.logging.Level;
import org.bukkit.Bukkit;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.YamlConfiguration;
import org.yaml.snakeyaml.error.YAMLException;

public class MyConfiguration extends YamlConfiguration
{

    public MyConfiguration()
    {
    }

    public String getFilename()
    {
        if(file == null)
        {
            throw new UnsupportedOperationException("You didn't use a File to create this object.");
        } else
        {
            String f[] = file.getAbsolutePath().split("/");
            return f[f.length - 1];
        }
    }

    public void load(String file)
        throws FileNotFoundException, IOException, InvalidConfigurationException
    {
        load(new File(file));
    }

    public void load(File file)
        throws FileNotFoundException, IOException, InvalidConfigurationException
    {
        super.load(file);
        this.file = file;
    }

    public void reload()
        throws FileNotFoundException, IOException, InvalidConfigurationException
    {
        load(file);
    }

   public static MyConfiguration loadConfiguration(String file)
    {
        return loadConfiguration(new File(file));
    }

    public static MyConfiguration loadConfiguration(File file)
    {
        if(file == null)
            throw new IllegalArgumentException("File cannot be null");
        MyConfiguration config = new MyConfiguration();
        try
        {
            config.load(file);
        }
        catch(FileNotFoundException filenotfoundexception) { }
        catch(IOException ex)
        {
            Bukkit.getLogger().log(Level.SEVERE, (new StringBuilder("Cannot load ")).append(file).toString(), ex);
        }
        catch(InvalidConfigurationException ex)
        {
            if(ex.getCause() instanceof YAMLException)
                Bukkit.getLogger().severe((new StringBuilder("Config file ")).append(file).append(" isn't valid! ").append(ex.getCause()).toString());
            else
            if(ex.getCause() == null || (ex.getCause() instanceof ClassCastException))
                Bukkit.getLogger().severe((new StringBuilder("Config file ")).append(file).append(" isn't valid!").toString());
            else
                Bukkit.getLogger().log(Level.SEVERE, (new StringBuilder("Cannot load ")).append(file).append(": ").append(ex.getCause().getClass()).toString(), ex);
        }
        config.file = file;
        return config;
    }

    public void save()
        throws IOException
    {
        if(file == null)
        {
            throw new UnsupportedOperationException("You didn't use a File to create this object.");
        } else
        {
            super.save(file);
            return;
        }
    }

    public static YamlConfiguration loadYConfiguration(File file1)
    {
        return loadConfiguration(file1);
    }

    private File file;
}
