package TF2classes;

import java.util.Random;

public class Heavy {
	private String className = "Heavy";
    private String[] heavySlot1 = {"Minigun", "Natascha", "Brass Beast", "Tomislav", "Huo-Long Heater"};
    private String[] heavySlot2 = {"Shotgun", "Family Business", "Panic Attack", "Sandvich", "Dalokohs Bar", "Buffalo Steak Sandvich", "Second Banana"};
    private String[] heavySlot3 = {"Fist", "Killing Gloves of Boxing", "Gloves of Running Urgently", "Warrior's Spirit", "Fist of Steel", "Eviction Notice", "Holiday Punch"};
    private String[] heavySlot4 = {"..."};

    public String getHeavyName() {
    	return className;
    }
    
    public String[] getHeavySlot1() {
        return heavySlot1;
    }

    public String[] getHeavySlot2() {
        return heavySlot2;
    }

    public String[] getHeavySlot3() {
        return heavySlot3;
    }
    

    public String[] getHeavySlot4() {
        return heavySlot4;
    }

    public String[] generateRandomLoadout() {
    	String className = "Heavy";
    	String slot1 = heavySlot1[new Random().nextInt(heavySlot1.length)];
        String slot2 = heavySlot2[new Random().nextInt(heavySlot2.length)];
        String slot3 = heavySlot3[new Random().nextInt(heavySlot3.length)];
        String slot4 = heavySlot4[new Random().nextInt(heavySlot4.length)];

        String[] loadout = {className, slot1, slot2, slot3, slot4};
        return loadout;
    }
}