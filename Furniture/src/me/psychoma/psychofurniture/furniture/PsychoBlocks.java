package me.psychoma.psychofurniture.furniture;

import me.psychoma.psychofurniture.PsychoFurniture;
import me.psychoma.psychofurniture.chair.Barstool;
import me.psychoma.psychofurniture.chair.PsychoChair;
import me.psychoma.psychofurniture.chair.SimpleChair;
import me.psychoma.psychofurniture.table.PsychoTable;
import me.psychoma.psychofurniture.table.SimpleTable;
import me.psychoma.psychofurniture.throne.PsychoThrone;

public class PsychoBlocks {
	
	public static Barstool woodenbarstool;
	public static Barstool stonebarstool;
	public static SimpleChair woodsimplechair;
	public static SimpleChair stonesimplechair;
	public static SimpleTable woodsimpletable;
	public static SimpleTable stonesimpletable;
	public static PsychoTable woodtable;
	public static PsychoTable irontable;
	public static PsychoTable goldtable;
	public static PsychoChair woodchairN;
	public static PsychoChair woodchairS;
	public static PsychoChair woodchairW;
	public static PsychoChair woodchairE;
	public static PsychoChair ironchairN;
	public static PsychoChair ironchairS;
	public static PsychoChair ironchairW;
	public static PsychoChair ironchairE;
	public static PsychoChair goldchairN;
	public static PsychoChair goldchairS;
	public static PsychoChair goldchairW;
	public static PsychoChair goldchairE;
	public static PsychoThrone woodthroneN;
	public static PsychoThrone woodthroneS;
	public static PsychoThrone woodthroneW;
	public static PsychoThrone woodthroneE;
	public static PsychoThrone ironthroneN;
	public static PsychoThrone ironthroneS;
	public static PsychoThrone ironthroneW;
	public static PsychoThrone ironthroneE;
	public static PsychoThrone goldthroneN;
	public static PsychoThrone goldthroneS;
	public static PsychoThrone goldthroneW;
	public static PsychoThrone goldthroneE;
	
	public static void registerBlocks(PsychoFurniture plugin) 
	{
		woodtable = new PsychoTable(plugin, "woodtable", new int[]{0,1,2,0,0,0});
		irontable = new PsychoTable(plugin, "irontable", new int[]{16,17,18,0,0,0});
		goldtable = new PsychoTable(plugin, "goldtable", new int[]{32,33,34,0,0,0});
		woodchairN = new PsychoChair(plugin, "woodchairS", new int[]{0,1,2,3,4,5}, "N");
		woodchairS = new PsychoChair(plugin, "woodchairN", new int[]{0,1,2,3,4,5}, "S");
		woodchairW = new PsychoChair(plugin, "woodchairW", new int[]{0,1,2,3,4,5}, "W");
		woodchairE = new PsychoChair(plugin, "woodchairE", new int[]{0,1,2,3,4,5}, "E");
		ironchairN = new PsychoChair(plugin, "ironchairS", new int[]{16,17,18,19,20,21}, "N");
		ironchairS = new PsychoChair(plugin, "ironchairN", new int[]{16,17,18,19,20,21}, "S");
		ironchairW = new PsychoChair(plugin, "ironchairW", new int[]{16,17,18,19,20,21}, "W");
		ironchairE = new PsychoChair(plugin, "ironchairE", new int[]{16,17,18,19,20,21}, "E");
		goldchairN = new PsychoChair(plugin, "goldchairS", new int[]{32,33,34,35,36,37}, "N");
		goldchairS = new PsychoChair(plugin, "goldchairN", new int[]{32,33,34,35,36,37}, "S");
		goldchairW = new PsychoChair(plugin, "goldchairW", new int[]{32,33,34,35,36,37}, "W");
		goldchairE = new PsychoChair(plugin, "goldchairE", new int[]{32,33,34,35,36,37}, "E");
		woodthroneN = new PsychoThrone(plugin, "woodthroneS", new int[]{0,1,2,3,4,5}, "N");
		woodthroneS = new PsychoThrone(plugin, "woodthroneN", new int[]{0,1,2,3,4,5}, "S");
		woodthroneW = new PsychoThrone(plugin, "woodthroneW", new int[]{0,1,2,3,4,5}, "W");
		woodthroneE = new PsychoThrone(plugin, "woodthroneE", new int[]{0,1,2,3,4,5}, "E");
		ironthroneN = new PsychoThrone(plugin, "ironthroneS", new int[]{16,17,18,19,20,21}, "N");
		ironthroneS = new PsychoThrone(plugin, "ironthroneN", new int[]{16,17,18,19,20,21}, "S");
		ironthroneW = new PsychoThrone(plugin, "ironthroneW", new int[]{16,17,18,19,20,21}, "W");
		ironthroneE = new PsychoThrone(plugin, "ironthroneE", new int[]{16,17,18,19,20,21}, "E");
		goldthroneN = new PsychoThrone(plugin, "goldthroneS", new int[]{32,33,34,35,36,37}, "N");
		goldthroneS = new PsychoThrone(plugin, "goldthroneN", new int[]{32,33,34,35,36,37}, "S");
		goldthroneW = new PsychoThrone(plugin, "goldthroneW", new int[]{32,33,34,35,36,37}, "W");
		goldthroneE = new PsychoThrone(plugin, "goldthroneE", new int[]{32,33,34,35,36,37}, "E");
		woodsimplechair = new SimpleChair(plugin, "simple woodchair", new int[] {0,1,2,0,0,0});
		woodsimpletable = new SimpleTable(plugin, "simple woodtable", new int[] {0,1,2,0,0,0});
		woodenbarstool = new Barstool(plugin, "woodenbarstool", new int[]{0,1,2,0,0,0});
		stonesimplechair = new SimpleChair(plugin, "simple stonechair", new int[] {48,49,50,0,0,0});
		stonesimpletable = new SimpleTable(plugin, "simple stonetable", new int[] {48,49,50,0,0,0});
		stonebarstool = new Barstool(plugin, "stonbarstool", new int[]{48,49,50,0,0,0});
	}

}



