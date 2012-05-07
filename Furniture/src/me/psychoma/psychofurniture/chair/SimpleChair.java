package me.psychoma.psychofurniture.chair;

import me.psychoma.psychofurniture.PsychoFurniture;
import me.psychoma.psychofurniture.design.SimpleChairDesign;

import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class SimpleChair extends GenericCubeCustomBlock 
{
	@SuppressWarnings("unused")
	private PsychoFurniture plugin;
	
	public SimpleChair(PsychoFurniture plugin,String name, int[] textureids) {
		super(plugin, name, false, new GenericCubeBlockDesign(plugin, plugin.chair,textureids));
		this.setBlockDesign(new SimpleChairDesign(plugin, textureids));
		this.plugin = plugin;
	}
}

