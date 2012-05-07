package me.psychoma.psychofurniture.design;

import me.psychoma.psychofurniture.PsychoFurniture;
import org.getspout.spoutapi.block.design.GenericBlockDesign;
import org.getspout.spoutapi.block.design.Quad;
import org.getspout.spoutapi.block.design.SubTexture;

public class SimpleTableDesign extends GenericBlockDesign
{
	
	public SimpleTableDesign(PsychoFurniture plugin, int[] textureids) {
		texture = plugin.table;
		setBoundingBox(0,0,0,1,1,1).setQuadNumber(11);
		setTexture(plugin, texture.getTexture()).setMinBrightness(1F).setMaxBrightness(1F);
		SubTexture subTex0 = texture.getSubTexture(textureids[0]);
		SubTexture subTex1 = texture.getSubTexture(textureids[1]);
		SubTexture subTex2 = texture.getSubTexture(textureids[2]);

		// texture 1 (boven en onderkant blad)
		Quad part1p1 = new Quad(0, subTex1);
		part1p1.addVertex(0, 0F, 1F, 1F);
		part1p1.addVertex(1, 1F, 1F, 1F);
		part1p1.addVertex(2, 1F, 1F, 0F);
		part1p1.addVertex(3, 0F, 1F, 0F);
		setLightSource(0, 0, 1, 0);
		
		Quad part1p2 = new Quad(1, subTex1);
		part1p2.addVertex(0, 1F, 0.875F, 1F);
		part1p2.addVertex(1, 0F, 0.875F, 1F);
		part1p2.addVertex(2, 0F, 0.875F, 0F);
		part1p2.addVertex(3, 1F, 0.875F, 0F);
		setLightSource(1, 0, 1, 0);
		
		// texture 2 (zijkanten blad)
		Quad part2p1 = new Quad(2, subTex2);
		part2p1.addVertex(0, 1F, 1F, 1F);
		part2p1.addVertex(1, 1F, 0.875F, 1F);
		part2p1.addVertex(2, 1F, 0.875F, 0F);
		part2p1.addVertex(3, 1F, 1F, 0F);
		setLightSource(2, 1, 0, 0);
		this.setQuad(part2p1);
		
		Quad part2p2 = new Quad(3, subTex2);
		part2p2.addVertex(0, 1F, 1F, 1F);
		part2p2.addVertex(1, 0F, 1F, 1F);
		part2p2.addVertex(2, 0F, 0.875F, 1F);
		part2p2.addVertex(3, 1F, 0.875F, 1F);
		setLightSource(3, 0, 0, 1);
		
		Quad part2p3 = new Quad(4, subTex2);
		part2p3.addVertex(0, 0F, 1F, 0F);
		part2p3.addVertex(1, 0F, 0.875F, 0F);
		part2p3.addVertex(2, 0F, 0.875F, 1F);
		part2p3.addVertex(3, 0F, 1F, 1F);
		setLightSource(4, -1, 0, 0);
		
		Quad part2p4 = new Quad(5, subTex2);
		part2p4.addVertex(0, 0F, 1F, 0F);
		part2p4.addVertex(1, 1F, 1F, 0F);
		part2p4.addVertex(2, 1F, 0.875F, 0F);
		part2p4.addVertex(3, 0F, 0.875F, 0F);
		setLightSource(5, 0, 0, -1);
		
		// texture 3 (de poot)
		Quad part3p1 = new Quad(6, subTex0);
		part3p1.addVertex(0, 0.375F, 0.875F, 0.375F);
		part3p1.addVertex(1, 0.625F, 0.875F, 0.375F);
		part3p1.addVertex(2, 0.625F, 0F, 0.375F);
		part3p1.addVertex(3, 0.375F, 0F, 0.375F);
		setLightSource(6, 0, 0, 1);
		
		Quad part3p2 = new Quad(7, subTex0);
		part3p2.addVertex(0, 0.625F, 0.875F, 0.625F);
		part3p2.addVertex(1, 0.625F, 0F, 0.625F);
		part3p2.addVertex(2, 0.625F, 0F, 0.375F);
		part3p2.addVertex(3, 0.625F, 0.875F, 0.375F);
		setLightSource(7, 1, 0, 0);
		
		Quad part3p3 = new Quad(8, subTex0);
		part3p3.addVertex(0, 0.625F, 0.875F, 0.625F);
		part3p3.addVertex(1, 0.375F, 0.875F, 0.625F);
		part3p3.addVertex(2, 0.375F, 0F, 0.625F);
		part3p3.addVertex(3, 0.625F, 0F, 0.625F);
		setLightSource(8, 0, 0, 1);
	
		Quad part3p4 = new Quad(9, subTex0);
		part3p4.addVertex(0, 0.375F, 0.875F, 0.375F);
		part3p4.addVertex(1, 0.375F, 0F, 0.375F);
		part3p4.addVertex(2, 0.375F, 0F, 0.625F);
		part3p4.addVertex(3, 0.375F, 0.875F, 0.625F);
		setLightSource(9, 1, 0, 0);
		
		// texture 4 (onderkant)
		Quad part4 = new Quad(10, subTex1);
		part4.addVertex(0, 0.625F, 0F, 0.625F);
		part4.addVertex(1, 0.375F, 0F, 0.625F);
		part4.addVertex(2, 0.375F, 0F, 0.375F);
		part4.addVertex(3, 0.625F, 0F, 0.375F);
		setLightSource(10, 0, -1, 0);
		this.setQuad(part1p1).setQuad(part1p2).setQuad(part2p2).setQuad(part2p3).setQuad(part2p4).setQuad(part3p1).setQuad(part3p2).setQuad(part3p3).setQuad(part3p4).setQuad(part4);
	}
}
	
