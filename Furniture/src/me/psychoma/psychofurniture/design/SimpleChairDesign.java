package me.psychoma.psychofurniture.design;


import me.psychoma.psychofurniture.PsychoFurniture;

import org.getspout.spoutapi.block.design.GenericBlockDesign;
import org.getspout.spoutapi.block.design.Quad;
import org.getspout.spoutapi.block.design.SubTexture;

public class SimpleChairDesign extends GenericBlockDesign 
{
	@SuppressWarnings("unused")
	public SimpleChairDesign(PsychoFurniture plugin, int[] textureids) {
		
		texture = plugin.chair;
		setBoundingBox(0,0,0,1.0F,0.5F,1.0F).setQuadNumber(21);
		setTexture(plugin, texture.getTexture()).setMinBrightness(1F).setMaxBrightness(1F);
		SubTexture subTex0 = texture.getSubTexture(textureids[0]);
		SubTexture subTex1 = texture.getSubTexture(textureids[1]);
		SubTexture subTex2 = texture.getSubTexture(textureids[2]);
		SubTexture subTex3 = texture.getSubTexture(textureids[3]);
		SubTexture subTex4 = texture.getSubTexture(textureids[4]);
		SubTexture subTex5 = texture.getSubTexture(textureids[5]);
		
		// texture 1 (boven en onderkant blad)
		Quad part1p1 = new Quad(0, subTex1);
		part1p1.addVertex(0, 0.125F, 0.6875F, 0.875F);
		part1p1.addVertex(1, 0.875F, 0.6875F, 0.875F);
		part1p1.addVertex(2, 0.875F, 0.6875F, 0.125F);
		part1p1.addVertex(3, 0.125F, 0.6875F, 0.125F);
		setLightSource(1, 0, 1, 0);
		this.setQuad(part1p1);
		
		Quad part1p2 = new Quad(1, subTex1);
		part1p2.addVertex(0, 0.875F, 0.5625F, 0.875F);
		part1p2.addVertex(1, 0.125F, 0.5625F, 0.875F);
		part1p2.addVertex(2, 0.125F, 0.5625F, 0.125F);
		part1p2.addVertex(3, 0.875F, 0.5625F, 0.125F);
		setLightSource(1, 0, 1, 0);
		this.setQuad(part1p2);
		
		// texture 2 (zijkanten blad)
		Quad part2p1 = new Quad(2, subTex2);
		part2p1.addVertex(0, 0.125F, 0.6875F, 0.125F);
		part2p1.addVertex(1, 0.125F, 0.5625F, 0.125F);
		part2p1.addVertex(2, 0.125F, 0.5625F, 0.875F);
		part2p1.addVertex(3, 0.125F, 0.6875F, 0.875F);
		setLightSource(2, 1, 0, 0);
		this.setQuad(part2p1);
		
		Quad part2p2 = new Quad(3, subTex2);
		part2p2.addVertex(0, 0.875F, 0.6875F, 0.875F);
		part2p2.addVertex(1, 0.125F, 0.6875F, 0.875F);
		part2p2.addVertex(2, 0.125F, 0.5625F, 0.875F);
		part2p2.addVertex(3, 0.875F, 0.5625F, 0.875F);
		setLightSource(3, 0, 0, 1);
		this.setQuad(part2p2);
		
		Quad part2p3 = new Quad(4, subTex2);
		part2p3.addVertex(0, 0.875F, 0.6875F, 0.875F);
		part2p3.addVertex(1, 0.875F, 0.5625F, 0.875F);
		part2p3.addVertex(2, 0.875F, 0.5625F, 0.125F);
		part2p3.addVertex(3, 0.875F, 0.6875F, 0.125F);
		setLightSource(4, 1, 0, 0);
		this.setQuad(part2p3);
		
		Quad part2p4 = new Quad(5, subTex2);
		part2p4.addVertex(0, 0.125F, 0.6875F, 0.125F);
		part2p4.addVertex(1, 0.875F, 0.6875F, 0.125F);
		part2p4.addVertex(2, 0.875F, 0.5625F, 0.125F);
		part2p4.addVertex(3, 0.125F, 0.5625F, 0.125F);
		setLightSource(5, 0, 0, 1);
		this.setQuad(part2p4);
		
		// texture 3 (de poot)
		Quad part3p1 = new Quad(6, subTex0);
		part3p1.addVertex(0, 0.4375F, 0.5625F, 0.25F);
		part3p1.addVertex(1, 0.4375F, 0F, 0F);
		part3p1.addVertex(2, 0.4375F, 0F, 0.125F);
		part3p1.addVertex(3, 0.4375F, 0.5625F, 0.375F);
		setLightSource(6, 1, 0, 0);
		this.setQuad(part3p1);
		
		Quad part3p2 = new Quad(7, subTex0);
		part3p2.addVertex(0, 0.5625F, 0.5625F, 0.375F);
		part3p2.addVertex(1, 0.4375F, 0.5625F, 0.375F);
		part3p2.addVertex(2, 0.4375F, 0F, 0.125F);
		part3p2.addVertex(3, 0.5625F, 0F, 0.125F);
		setLightSource(7, 1, 0, 0);
		this.setQuad(part3p2);
		
		Quad part3p3 = new Quad(8, subTex0);
		part3p3.addVertex(0, 0.5625F, 0.5625F, 0.375F);
		part3p3.addVertex(1, 0.5625F, 0F, 0.125F);
		part3p3.addVertex(2, 0.5625F, 0F, 0F);
		part3p3.addVertex(3, 0.5625F, 0.5625F, 0.25F);
		setLightSource(8, 1, 0, 0);
		this.setQuad(part3p3);
		
		Quad part3p4 = new Quad(9, subTex0);
		part3p4.addVertex(0, 0.4375F, 0.5625F, 0.25F);
		part3p4.addVertex(1, 0.5625F, 0.5625F, 0.25F);
		part3p4.addVertex(2, 0.5625F, 0F, 0F);
		part3p4.addVertex(3, 0.4375F, 0F, 0F);
		setLightSource(9, 1, 0, 0);
		this.setQuad(part3p4);
		
		//----------
		Quad part3p5 = new Quad(10, subTex0);
		part3p5.addVertex(0, 0.25F, 0.5625F, 0.625F);
		part3p5.addVertex(1, 0F, 0F, 0.875F);
		part3p5.addVertex(2, 0F, 0F, 1F);
		part3p5.addVertex(3, 0.25F, 0.5625F, 0.75F);
		setLightSource(10, 0, 0, 1);
		this.setQuad(part3p5);
		
		Quad part3p6 = new Quad(11, subTex0);
		part3p6.addVertex(0, 0.375F, 0.5625F, 0.75F);
		part3p6.addVertex(1, 0.25F, 0.5625F, 0.75F);
		part3p6.addVertex(2, 0F, 0F, 1F);
		part3p6.addVertex(3, 0.125F, 0F, 1F);
		setLightSource(11, 0, 0, 1);
		this.setQuad(part3p6);
		
		Quad part3p7 = new Quad(12, subTex0);
		part3p7.addVertex(0, 0.375F, 0.5625F, 0.75F);
		part3p7.addVertex(1, 0.125F, 0F, 1F);
		part3p7.addVertex(2, 0.125F, 0F, 0.875F);
		part3p7.addVertex(3, 0.375F, 0.5625F, 0.625F);
		setLightSource(12, 1, 0, 0);
		this.setQuad(part3p7);
		
		Quad part3p8 = new Quad(13, subTex0);
		part3p8.addVertex(0, 0.25F, 0.5625F, 0.625F);
		part3p8.addVertex(1, 0.375F, 0.5625F, 0.625F);
		part3p8.addVertex(2, 0.125F, 0F, 0.875F);
		part3p8.addVertex(3, 0F, 0F, 0.875F);
		setLightSource(13, 0, 0, 1);
		this.setQuad(part3p8);
		
		//----------
		
		Quad part3p9 = new Quad(14, subTex0);
		part3p9.addVertex(0, 0.75F, 0.5625F, 0.75F);
		part3p9.addVertex(1, 1F, 0F, 1F);
		part3p9.addVertex(2, 1F, 0F, 0.875F);
		part3p9.addVertex(3, 0.75F, 0.5625F, 0.625F);
		setLightSource(14, 0, 0, 1);
		this.setQuad(part3p9);
		
		Quad part3p10 = new Quad(15, subTex0);
		part3p10.addVertex(0, 0.625F, 0.5625F, 0.625F);
		part3p10.addVertex(1, 0.75F, 0.5625F, 0.625F);
		part3p10.addVertex(2, 1F, 0F, 0.875F);
		part3p10.addVertex(3, 0.875F, 0F, 0.875F);
		setLightSource(15, 0, 0, 1);
		this.setQuad(part3p10);
		
		Quad part3p11 = new Quad(16, subTex0);
		part3p11.addVertex(0, 0.75F, 0.5625F, 0.75F);
		part3p11.addVertex(1, 0.625F, 0.5625F, 0.75F);
		part3p11.addVertex(2, 0.875F, 0F, 1F);
		part3p11.addVertex(3, 1F, 0F, 1F);
		setLightSource(16, 1, 0, 0);
		this.setQuad(part3p11);
		
		Quad part3p12 = new Quad(17, subTex0);
		part3p12.addVertex(0, 0.625F, 0.5625F, 0.625F);
		part3p12.addVertex(1, 0.875F, 0F, 0.875F);
		part3p12.addVertex(2, 0.875F, 0F, 1F);
		part3p12.addVertex(3, 0.625F, 0.5625F, 0.75F);
		setLightSource(17, 1, 0, 0);
		this.setQuad(part3p12);
		
		// texture 4 (onderkant)
		Quad part4p1 = new Quad(18, subTex1);
		part4p1.addVertex(0, 0.5625F, 0F, 0.125F);
		part4p1.addVertex(1, 0.4375F, 0F, 0.125F);
		part4p1.addVertex(2, 0.4375F, 0F, 0F);
		part4p1.addVertex(3, 0.5625F, 0F, 0F);
		setLightSource(18, 0, -1, 0);
		this.setQuad(part4p1);
		
		Quad part4p2 = new Quad(19, subTex1);
		part4p2.addVertex(0, 0.125F, 0F, 1F);
		part4p2.addVertex(1, 0F, 0F, 1F);
		part4p2.addVertex(2, 0F, 0F, 0.875F);
		part4p2.addVertex(3, 0.125F, 0F, 0.875F);
		setLightSource(19, 0, -1, 0);
		this.setQuad(part4p2);
		
		Quad part4p3 = new Quad(20, subTex1);
		part4p3.addVertex(0, 1F, 0F, 1F);
		part4p3.addVertex(1, 0.875F, 0F, 1F);
		part4p3.addVertex(2, 0.875F, 0F, 0.875F);
		part4p3.addVertex(3, 1F, 0F, 0.875F);
		setLightSource(20, 0, -1, 0);
		this.setQuad(part4p3);
	}
}