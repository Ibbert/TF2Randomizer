package TF2classes;

import java.util.Random;

public class Pyro {
	private String className = "Pyro";
    private String[] pyroSlot1 = {"Flamethrower", "Backburner", "Degreaser", "Phlogistinator", "Rainblower", "Dragon's Fury"};
    private String[] pyroSlot2 = {"Shotgun", "Flare Gun", "Detonator", "Reserve Shooter", "Manmelter", "Panic Attack", "Thermal Thruster", "Gas Passer"};
    private String[] pyroSlot3 = {"Fire Axe", "Axtinguisher", "Homewrecker", "Powerjack", "Back Scratcher", "Neon Annihilator", "Hot Hand"};
    private String[] pyroSlot4 = {"..."};

    public String getPyroName() {
    	return className;
    }
    
    public String[] getPyroSlot1() {
        return pyroSlot1;
    }

    public String[] getPyroSlot2() {
        return pyroSlot2;
    }

    public String[] getPyroSlot3() {
        return pyroSlot3;
    }
    
    public String[] getPyroSlot4() {
        return pyroSlot4;
    }

    public String[] generateRandomLoadout() {
    	String className = "Pyro";
    	String slot1 = pyroSlot1[new Random().nextInt(pyroSlot1.length)];
        String slot2 = pyroSlot2[new Random().nextInt(pyroSlot2.length)];
        String slot3 = pyroSlot3[new Random().nextInt(pyroSlot3.length)];
        String slot4 = pyroSlot4[new Random().nextInt(pyroSlot4.length)];

        String[] loadout = {className, slot1, slot2, slot3, slot4};
        return loadout;
    }
}