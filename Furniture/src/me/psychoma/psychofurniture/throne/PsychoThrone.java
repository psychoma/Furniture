package me.psychoma.psychofurniture.throne;

import me.psychoma.psychofurniture.PsychoFurniture;
import me.psychoma.psychofurniture.design.PsychoThroneDesign;

import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class PsychoThrone extends GenericCubeCustomBlock 
{
	@SuppressWarnings("unused")
	private PsychoFurniture plugin;
	
	public PsychoThrone(PsychoFurniture plugin,String name, int[] textureids, String dir) {
		super(plugin, name, false, new GenericCubeBlockDesign(plugin, plugin.throne, textureids));
		this.setBlockDesign(new PsychoThroneDesign(plugin, textureids, dir));
		this.plugin = plugin;
	}
}

