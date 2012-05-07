package me.psychoma.psychofurniture.chair;

import me.psychoma.psychofurniture.PsychoFurniture;
import me.psychoma.psychofurniture.design.BarstoolDesign;

import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;


public class Barstool extends GenericCubeCustomBlock {
	@SuppressWarnings("unused")
	private PsychoFurniture plugin;
	
	public Barstool(PsychoFurniture plugin,String name, int[] textureids) 
	{
		super(plugin, name, false, new GenericCubeBlockDesign(plugin, plugin.chair,textureids));
		this.setBlockDesign(new BarstoolDesign(plugin, textureids));
		this.plugin = plugin;
	}
	
}

