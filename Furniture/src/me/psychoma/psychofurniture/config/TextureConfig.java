package me.psychoma.psychofurniture.config;

public class TextureConfig
{

    public TextureConfig()
    {
    }

    public static void set()
    {
        if(!Configuration.texture.contains("Table Texture"))
            Configuration.texture.set("Table Texture", "http://dl.dropbox.com/u/50790929/Minecraft/Plugins/text_table.png");
        if(!Configuration.texture.contains("Chair Texture"))
            Configuration.texture.set("Chair Texture", "http://dl.dropbox.com/u/50790929/Minecraft/Plugins/text_chair.png");
        if(!Configuration.texture.contains("Throne Texture"))
            Configuration.texture.set("Throne Texture", "http://dl.dropbox.com/u/50790929/Minecraft/Plugins/text_throne.png");
    }
}
