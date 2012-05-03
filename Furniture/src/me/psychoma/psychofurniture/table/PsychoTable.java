package me.psychoma.psychofurniture.table;

import me.psychoma.psychofurniture.PsychoFurniture;
import me.psychoma.psychofurniture.design.PsychoTableDesign;

import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class PsychoTable extends GenericCubeCustomBlock 
{
	public PsychoTable(PsychoFurniture plugin, String name, int[] textureids)
	{
		super(plugin, name, false, new GenericCubeBlockDesign(plugin, plugin.table,textureids));
		this.setBlockDesign(new PsychoTableDesign(plugin, textureids));
	}
}









