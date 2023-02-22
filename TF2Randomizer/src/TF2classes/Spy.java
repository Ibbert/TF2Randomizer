package TF2classes;

import java.util.Random;

public class Spy {
	private String className = "Spy";
	private String[] spySlot1 = {"Knife", "Your Eternal Reward", "Conniver's Kunai", "Big Earner", "Spy-cicle"};
    private String[] spySlot2 = {"Revolver", "Ambassador", "L'Etranger", "Enforcer", "Diamondback"};
    private String[] spySlot3 = {"Invis Watch", "Clock and Dagger", "Dead Ringer"};
    private String[] spySlot4 = {"Sapper", "Red-Tape Recorder"};

    public String getSpyName() {
        return className;
    }
    
    public String[] getSpySlot1() {
        return spySlot1;
    }

    public String[] getSpySlot2() {
        return spySlot2;
    }

    public String[] getSpySlot3() {
        return spySlot3;
    }
    
    public String[] getSpySlot4() {
        return spySlot4;
    }

    public String[] generateRandomLoadout() {
    	String className = "Spy";
    	String slot1 = spySlot1[new Random().nextInt(spySlot1.length)];
        String slot2 = spySlot2[new Random().nextInt(spySlot2.length)];
        String slot3 = spySlot3[new Random().nextInt(spySlot3.length)];
        String slot4 = spySlot4[new Random().nextInt(spySlot4.length)];

        String[] loadout = {className, slot1, slot2, slot3, slot4};
        return loadout;
    }
}
