package TF2classes;

import java.util.Random;

public class Soldier {
	private String className = "Soldier";
    private String[] soldierSlot1 = {"Rocket Launcher", "Original", "Direct Hit", "Black Box", "Liberty Launcher", "Rocket Jumper", "Cow Mangler 5000", "Begger's Bazooka", "Air Strike"};
    private String[] soldierSlot2 = {"Shotgun", "Buff Banner", "Gunboats", "Mantreads", "Righteous Bison", "Battalion's Backup", "Concheror", "B.A.S.E. Jumper", "Panic Attack"};
    private String[] soldierSlot3 = {"Shovel", "Equalizer", "Escape Plan", "Disciplinary Action", "Market Gardener", "Half-Zatochi"};
    private String[] soldierSlot4 = {"..."};

    public String getSoldierName() {
    	return className;
    }
    
    public String[] getSoldierSlot1() {
        return soldierSlot1;
    }

    public String[] getSoldierSlot2() {
        return soldierSlot2;
    }

    public String[] getSoldierSlot3() {
        return soldierSlot3;
    }
    
    public String[] getSoldierSlot4() {
        return soldierSlot4;
    }

    public String[] generateRandomLoadout() {
    	String className = "Soldier";
    	String slot1 = soldierSlot1[new Random().nextInt(soldierSlot1.length)];
        String slot2 = soldierSlot2[new Random().nextInt(soldierSlot2.length)];
        String slot3 = soldierSlot3[new Random().nextInt(soldierSlot3.length)];
        String slot4 = soldierSlot4[new Random().nextInt(soldierSlot4.length)];

        String[] loadout = {className, slot1, slot2, slot3, slot4};
        return loadout;
    }
}
