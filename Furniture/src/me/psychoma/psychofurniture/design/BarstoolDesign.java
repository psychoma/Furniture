package me.psychoma.psychofurniture.design;

import me.psychoma.psychofurniture.PsychoFurniture;

import org.getspout.spoutapi.block.design.GenericBlockDesign;
import org.getspout.spoutapi.block.design.Quad;
import org.getspout.spoutapi.block.design.SubTexture;

public class BarstoolDesign extends GenericBlockDesign 
{
	@SuppressWarnings("unused")
	public BarstoolDesign(PsychoFurniture plugin, int[] textureids) 
	{
		texture = plugin.chair;
		setBoundingBox(0.1875F, 0F, 0.1875F, 0.625F, 1F, 0.625F).setQuadNumber(16);
		setTexture(plugin, texture.getTexture()).setMinBrightness(1F).setMaxBrightness(1F);
		SubTexture subTex0 = texture.getSubTexture(textureids[0]);
		SubTexture subTex1 = texture.getSubTexture(textureids[1]);
		SubTexture subTex2 = texture.getSubTexture(textureids[2]);
		SubTexture subTex3 = texture.getSubTexture(textureids[3]);
		SubTexture subTex4 = texture.getSubTexture(textureids[4]);
		SubTexture subTex5 = texture.getSubTexture(textureids[5]);
	
	//boven en onderkanten blad
	Quad part1p1 = new Quad(0, subTex1);
	part1p1.addVertex(0, 0.8125F, 0.875F, 0.8125F);
	part1p1.addVertex(1, 0.1875F, 0.875F, 0.8125F);
	part1p1.addVertex(2, 0.1875F, 0.875F, 0.1875F);
	part1p1.addVertex(3, 0.8125F, 0.875F, 0.1875F);
	setLightSource(0, 0, 1, 0);

	
	Quad part1p2 = new Quad(1, subTex1);
	part1p2.addVertex(0, 0.1875F, 1F, 0.8125F);
	part1p2.addVertex(1, 0.8125F, 1F, 0.8125F);
	part1p2.addVertex(2, 0.8125F, 1F, 0.1875F);
	part1p2.addVertex(3, 0.1875F, 1F, 0.1875F);
	setLightSource(1, 0, 1, 0);

	
	//zijkanten blad
	Quad part2p1 = new Quad(2, subTex2);
	part2p1.addVertex(0, 0.1875F, 1F, 0.1875F);
	part2p1.addVertex(1, 0.8125F, 1F, 0.1875F);
	part2p1.addVertex(2, 0.8125F, 0.875F, 0.1875F);
	part2p1.addVertex(3, 0.1875F, 0.875F, 0.1875F);
	setLightSource(2, 0, 0, 1);

	
	Quad part2p2 = new Quad(3, subTex2);
	part2p2.addVertex(0, 0.1875F, 1F, 0.1875F);
	part2p2.addVertex(1, 0.1875F, 0.875F, 0.1875F);
	part2p2.addVertex(2, 0.1875F, 0.875F, 0.8125F);
	part2p2.addVertex(3, 0.1875F, 1F, 0.8125F);
	setLightSource(3, 1, 0, 0);

	
	Quad part2p3 = new Quad(4, subTex2);
	part2p3.addVertex(0, 0.8125F, 1F, 0.8125F);
	part2p3.addVertex(1, 0.8125F, 0.875F, 0.8125F);
	part2p3.addVertex(2, 0.8125F, 0.875F, 0.1875F);
	part2p3.addVertex(3, 0.8125F, 1F, 0.1875F);
	setLightSource(4, 1, 0, 0);

	
	Quad part2p4 = new Quad(5, subTex2);
	part2p4.addVertex(0, 0.8125F, 1F, 0.8125F);
	part2p4.addVertex(1, 0.1875F, 1F, 0.8125F);
	part2p4.addVertex(2, 0.1875F, 0.875F, 0.8125F);
	part2p4.addVertex(3, 0.8125F, 0.875F, 0.8125F);
	setLightSource(5, 0, 0, 1);

	
	//boven en onderkanten voet	
	Quad part3p1 = new Quad(6, subTex1);
	part3p1.addVertex(0, 0.3125F, 0.0625F, 0.6875F);
	part3p1.addVertex(1, 0.6875F, 0.0625F, 0.6875F);
	part3p1.addVertex(2, 0.6875F, 0.0625F, 0.3125F);
	part3p1.addVertex(3, 0.3125F, 0.0625F, 0.3125F);
	setLightSource(6, 0, 1, 0);

	
	Quad part3p2 = new Quad(7, subTex1);
	part3p2.addVertex(0, 0.6875F, 0F, 0.6875F);
	part3p2.addVertex(1, 0.3125F, 0F, 0.6875F);
	part3p2.addVertex(2, 0.3125F, 0F, 0.3125F);
	part3p2.addVertex(3, 0.6875F, 0F, 0.3125F);
	setLightSource(7, 0, -1, 0);

	
	//zijkanten voet
	Quad part4p1 = new Quad(8, subTex2);
	part4p1.addVertex(0, 0.3125F, 0.0625F, 0.3125F);
	part4p1.addVertex(1, 0.3125F, 0F, 0.3125F);
	part4p1.addVertex(2, 0.3125F, 0F, 0.6875F);
	part4p1.addVertex(3, 0.3125F, 0.0625F, 0.6875F);
	setLightSource(8, 1, 0, 0);

	
	Quad part4p2 = new Quad(9, subTex2);
	part4p2.addVertex(0, 0.3125F, 0.0625F, 0.3125F);
	part4p2.addVertex(1, 0.6875F, 0.0625F, 0.3125F);
	part4p2.addVertex(2, 0.6875F, 0F, 0.3125F);
	part4p2.addVertex(3, 0.3125F, 0F, 0.3125F);
	setLightSource(9, 0, 0, 1);

	
	Quad part4p3 = new Quad(10, subTex2);
	part4p3.addVertex(0, 0.6875F, 0.0625F, 0.6875F);
	part4p3.addVertex(1, 0.3125F, 0.0625F, 0.6875F);
	part4p3.addVertex(2, 0.3125F, 0F, 0.6875F);
	part4p3.addVertex(3, 0.6875F, 0F, 0.6875F);
	setLightSource(10, 0, 0, 1);

	
	Quad part4p4 = new Quad(11, subTex2);
	part4p4.addVertex(0, 0.6875F, 0.0625F, 0.6875F);
	part4p4.addVertex(1, 0.6875F, 0F, 0.6875F);
	part4p4.addVertex(2, 0.6875F, 0F, 0.3125F);
	part4p4.addVertex(3, 0.6875F, 0.0625F, 0.3125F);
	setLightSource(11, 1, 0, 0);

	
	//de poot
	Quad part5p1 = new Quad(12, subTex0);
	part5p1.addVertex(0, 0.4375F, 0.875F, 0.4375F);
	part5p1.addVertex(1, 0.5625F, 0.875F, 0.4375F);
	part5p1.addVertex(2, 0.5625F, 0.0625F, 0.4375F);
	part5p1.addVertex(3, 0.4375F, 0.0625F, 0.4375F);
	setLightSource(12, 0, 0, 1);

	
	Quad part5p2 = new Quad(13, subTex0);
	part5p2.addVertex(0, 0.4375F, 0.875F, 0.4375F);
	part5p2.addVertex(1, 0.4375F, 0.0625F, 0.4375F);
	part5p2.addVertex(2, 0.4375F, 0.0625F, 0.5625F);
	part5p2.addVertex(3, 0.4375F, 0.875F, 0.5625F);
	setLightSource(13, 1, 0, 0);

	
	Quad part5p3 = new Quad(14, subTex0);
	part5p3.addVertex(0, 0.5625F, 0.875F, 0.5625F);
	part5p3.addVertex(1, 0.4375F, 0.875F, 0.5625F);
	part5p3.addVertex(2, 0.4375F, 0.0625F, 0.5625F);
	part5p3.addVertex(3, 0.5625F, 0.0625F, 0.5625F);
	setLightSource(14, 0, 0, 1);

	
	Quad part5p4 = new Quad(15, subTex0);
	part5p4.addVertex(0, 0.5625F, 0.875F, 0.5625F);
	part5p4.addVertex(1, 0.5625F, 0.0625F, 0.5625F);
	part5p4.addVertex(2, 0.5625F, 0.0625F, 0.4375F);
	part5p4.addVertex(3, 0.5625F, 0.875F, 0.4375F);
	setLightSource(15, 1, 0, 0);
	setQuad(part5p4).setQuad(part5p3).setQuad(part5p2).setQuad(part5p1).setQuad(part4p4).setQuad(part4p3).setQuad(part4p2).setQuad(part4p1).setQuad(part3p1).setQuad(part3p2).setQuad(part2p1).setQuad(part2p2).setQuad(part2p3).setQuad(part2p4).setQuad(part2p1).setQuad(part2p2).setQuad(part2p3).setQuad(part2p4).setQuad(part1p2).setQuad(part1p1);
	}
}

