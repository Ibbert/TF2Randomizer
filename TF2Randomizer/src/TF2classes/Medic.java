package TF2classes;

import java.util.Random;

public class Medic {
	private String className = "Medic";
    private String[] medicSlot1 = {"Syringe Gun", "Blutsauger", "Crusader's Crossbow", "Overdose"};
    private String[] medicSlot2 = {"Medigun", "Kritzkrig", "Quick-Fix", "Vaccinator"};
    private String[] medicSlot3 = {"Bonesaw", "Übersaw", "Vita-Saw", "Amputator", "Solemn Vow"};
    private String[] medicSlot4 = {"..."};

    public String getMedicName() {
    	return className;
    }
    
    public String[] getMedicSlot1() {
        return medicSlot1;
    }

    public String[] getMedicSlot2() {
        return medicSlot2;
    }

    public String[] getMedicSlot3() {
        return medicSlot3;
    }
    
    public String[] getMedicSlot4() {
        return medicSlot4;
    }

    public String[] generateRandomLoadout() {
    	String className = "Medic";
    	String slot1 = medicSlot1[new Random().nextInt(medicSlot1.length)];
        String slot2 = medicSlot2[new Random().nextInt(medicSlot2.length)];
        String slot3 = medicSlot3[new Random().nextInt(medicSlot3.length)];
        String slot4 = medicSlot4[new Random().nextInt(medicSlot4.length)];

        String[] loadout = {className, slot1, slot2, slot3, slot4};
        return loadout;
    }
}