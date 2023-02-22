package TF2classes;

import java.util.Random;

public class Sniper {
	private String className = "Sniper";
    private String[] sniperSlot1 = {"Sniper Rifle", "Huntsman", "Sydney Sleeper", "Bazzar Bargain", "Machina", "Hitman's Heatmaker", "Classic"};
    private String[] sniperSlot2 = {"SMG", "Cleaner's Carbine", "Jarate", "Razorback", "Darwin's Danger Shield", "Cozy Camper"};
    private String[] sniperSlot3 = {"Kukri", "Tribalman's Shiv", "Bushwacka", "Shahanshah"};
    private String[] sniperSlot4 = {"..."};

    public String getSniperName() {
    	return className;
    }
    
    public String[] getSniperSlot1() {
        return sniperSlot1;
    }

    public String[] getSniperSlot2() {
        return sniperSlot2;
    }

    public String[] getSniperSlot3() {
        return sniperSlot3;
    }
    
    public String[] getSniperSlot4() {
        return sniperSlot4;
    }

    public String[] generateRandomLoadout() {
    	String className = "Sniper";
    	String slot1 = sniperSlot1[new Random().nextInt(sniperSlot1.length)];
        String slot2 = sniperSlot2[new Random().nextInt(sniperSlot2.length)];
        String slot3 = sniperSlot3[new Random().nextInt(sniperSlot3.length)];
        String slot4 = sniperSlot4[new Random().nextInt(sniperSlot4.length)];

        String[] loadout = {className, slot1, slot2, slot3, slot4};
        return loadout;
    }
}