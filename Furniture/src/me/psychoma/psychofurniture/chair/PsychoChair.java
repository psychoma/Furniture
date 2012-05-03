package me.psychoma.psychofurniture.chair;

import me.psychoma.psychofurniture.PsychoFurniture;
import me.psychoma.psychofurniture.design.PsychoChairDesign;

import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class PsychoChair extends GenericCubeCustomBlock 
{
	@SuppressWarnings("unused")
	private PsychoFurniture plugin;
	
	public PsychoChair(PsychoFurniture plugin,String name, int[] textureids, String dir) {
		super(plugin, name, false, new GenericCubeBlockDesign(plugin, plugin.chair,textureids));
		this.setBlockDesign(new PsychoChairDesign(plugin, textureids, dir));
		this.plugin = plugin;
	}
}

