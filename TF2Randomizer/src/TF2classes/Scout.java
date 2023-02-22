package TF2classes;

import java.util.Random;

public class Scout {
	private String className = "Scout";
    private String[] scoutSlot1 = {"Scattergun", "Force-A-Nature", "Shortstop", "Soda Popper", "Baby Face's Blaster"};
    private String[] scoutSlot2 = {"Pistol", "Winger", "Pretty Boy's Pocket Pistol", "Flying Guillotine", "Mad Milk", "Crit-a-Cola", "Bonk! Atomic Punch"};
    private String[] scoutSlot3 = {"Bat", "Sandman", "Candy Cane", "Boston Basher", "Sun-on-a-Stick", "Fan O'War", "Atomizer", "Wrap Assassin"};
    private String[] scoutSlot4 = {"..."};

    public String getScoutName() {
    	return className;
    }
    
    public String[] getScoutSlot1() {
        return scoutSlot1;
    }

    public String[] getScoutSlot2() {
        return scoutSlot2;
    }

    public String[] getScoutSlot3() {
        return scoutSlot3;
    }
    
    public String[] getScoutSlot4() {
        return scoutSlot4;
    }

    public String[] generateRandomLoadout() {
    	String className = "Scout";
    	String slot1 = scoutSlot1[new Random().nextInt(scoutSlot1.length)];
        String slot2 = scoutSlot2[new Random().nextInt(scoutSlot2.length)];
        String slot3 = scoutSlot3[new Random().nextInt(scoutSlot3.length)];
        String slot4 = scoutSlot4[new Random().nextInt(scoutSlot4.length)];

        String[] loadout = {className, slot1, slot2, slot3, slot4};
        return loadout;
    }
}
