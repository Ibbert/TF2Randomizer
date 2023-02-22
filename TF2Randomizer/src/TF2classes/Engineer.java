package TF2classes;

import java.util.Random;

public class Engineer {
	private String className = "Engineer";
    private String[] engiSlot1 = {"Shotgun", "Frontier Justice", "Widowmaker", "Pomson 6000", "Rescue Ranger", "Panic Attack"};
    private String[] engiSlot2 = {"Pistol", "Wrangler", "Short Circuit"};
    private String[] engiSlot3 = {"Wrench", "Jag", "Southern Hospitality", "Eureka Effect", "Gunslinger"};
    private String[] engiSlot4 = {"Construction and Destruction PDA"};

    public String getEngineerName() {
    	return className;
    }
    
    public String[] getEngineerSlot1() {
        return engiSlot1;
    }

    public String[] getEngineerSlot2() {
        return engiSlot2;
    }

    public String[] getEngineerSlot3() {
        return engiSlot3;
    }
    
    public String[] getEngineerSlot4() {
        return engiSlot4;
    }

    public String[] generateRandomLoadout() {
    	String className = "Engineer";
    	String slot1 = engiSlot1[new Random().nextInt(engiSlot1.length)];
        String slot2 = engiSlot2[new Random().nextInt(engiSlot2.length)];
        String slot3 = engiSlot3[new Random().nextInt(engiSlot3.length)];
        String slot4 = engiSlot4[new Random().nextInt(engiSlot4.length)];
        
        String[] loadout = {className, slot1, slot2, slot3, slot4};
        return loadout;
    }
}