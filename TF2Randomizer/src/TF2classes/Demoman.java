package TF2classes;

import java.util.Random;

public class Demoman {
	private String className = "Demoman";
    private String[] demoSlot1 = {"Grenade Launcher", "Loch-n-Load", "Loose Cannon", "Iron Bomber", "Ali Baba's Wee Booties", "B.A.S.E. Jumper"};
    private String[] demoSlot2 = {"Stickybomb Launcher", "Scottish Resistance", "Sticky Jumper", "Chargin' Targe", "Splendid Screen", "Tide Turner", "Quickiebomb Launcher"};
    private String[] demoSlot3 = {"Bottle", "Eyelander", "Pain Train", "Scotsman's Skullcutter", "Claidheamh Mòr", "Ullapool Caber", "Half-Zatoichi", "Persian Persuader"};
    private String[] demoSlot4 = {"..."};

    public String getDemomanName() {
    	return className;
    }
    
    public String[] getDemomanSlot1() {
        return demoSlot1;
    }

    public String[] getDemomanSlot2() {
        return demoSlot2;
    }

    public String[] getDemomanSlot3() {
        return demoSlot3;
    }
    
    public String[] getDemomanSlot4() {
        return demoSlot4;
    }

    public String[] generateRandomLoadout() {
    	String className = "Demoman";
    	String slot1 = demoSlot1[new Random().nextInt(demoSlot1.length)];
        String slot2 = demoSlot2[new Random().nextInt(demoSlot2.length)];
        String slot3 = demoSlot3[new Random().nextInt(demoSlot3.length)];
        String slot4 = demoSlot4[new Random().nextInt(demoSlot4.length)];

        String[] loadout = {className, slot1, slot2, slot3, slot4};
        return loadout;
    }
}

