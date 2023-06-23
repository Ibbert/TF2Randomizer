package GUI;

// Stored element to be randomized
import TF2classes.Scout;
import TF2classes.Soldier;
import TF2classes.Pyro;
import TF2classes.Heavy;
import TF2classes.Demoman;
import TF2classes.Engineer;
import TF2classes.Sniper;
import TF2classes.Medic;
import TF2classes.Spy;

//GUI swings
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

// Randomizer
import java.util.Random;

public class MainView {
    // GUI elements
    private JFrame frame;
    private JPanel buttonPanel;
    private JPanel displayPanel;
    private JLabel classLabel;
    private JLabel primaryLabel;
    private JLabel secondaryLabel;
    private JLabel thirdLabel;
    private JLabel specialLabel;

    // Get classes
    private Scout scout = new Scout();
    private Soldier soldier = new Soldier();
    private Pyro pyro = new Pyro();
    private Heavy heavy = new Heavy();
    private Demoman demoman = new Demoman();
    private Engineer engineer = new Engineer();
    private Sniper sniper = new Sniper();
    private Medic medic = new Medic();
    private Spy spy = new Spy();

    public class CustomColors {
        public static Color getCustomColor(int r, int g, int b) {
            return new Color(r, g, b);
        }
    }

    public MainView() {
        frame = new JFrame("Loadout Generator");

        // Create button panel with buttons for each class
        buttonPanel = new JPanel(new GridLayout(2, 3));
        JButton infoButton = new JButton("Info");
        JButton scoutButton = new JButton("Scout");
        JButton soldierButton = new JButton("Soldier");
        JButton pyroButton = new JButton("Pyro");
        JButton demoButton = new JButton("Demoman");
        JButton heavyButton = new JButton("Heavy");
        JButton engineerButton = new JButton("Engineer");
        JButton sniperButton = new JButton("Sniper");
        JButton medicButton = new JButton("Medic");
        JButton spyButton = new JButton("Spy");

        // Add action listeners to buttons for button panel
        // Info
        buttonPanel.add(infoButton);
        infoButton.setBackground(CustomColors.getCustomColor(216, 113, 50));
        infoButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(null,
                    "This program will generate a loadout based on a class you selected. \nWeapon reskins that does not bring any gameplay significance will not be included. \n1/2",
                    "Information", 3);

            JOptionPane.showMessageDialog(frame,
                    "This Java application is developed by Zaid Ibrahim. \nUSN, Campus Vestfold - 2022 \n2/2",
                    "Information", 3);
        });

        // Scout
        buttonPanel.add(scoutButton);
        scoutButton.setBackground(CustomColors.getCustomColor(245, 152, 59));
        scoutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                generateLoadout(scout.getScoutName(), scout.getScoutSlot1(), scout.getScoutSlot2(),
                        scout.getScoutSlot3(), scout.getScoutSlot4());
            }
        });

        // Soldier
        buttonPanel.add(soldierButton);
        soldierButton.setBackground(CustomColors.getCustomColor(245, 152, 59));
        soldierButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                generateLoadout(soldier.getSoldierName(), soldier.getSoldierSlot1(), soldier.getSoldierSlot2(),
                        soldier.getSoldierSlot3(), soldier.getSoldierSlot4());
            }
        });

        // Pyro
        buttonPanel.add(pyroButton);
        pyroButton.setBackground(CustomColors.getCustomColor(245, 152, 59));
        pyroButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                generateLoadout(pyro.getPyroName(), pyro.getPyroSlot1(), pyro.getPyroSlot2(), pyro.getPyroSlot3(),
                        pyro.getPyroSlot4());
            }
        });

        // Demoman
        buttonPanel.add(demoButton);
        demoButton.setBackground(CustomColors.getCustomColor(245, 152, 59));
        demoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                generateLoadout(demoman.getDemomanName(), demoman.getDemomanSlot1(), demoman.getDemomanSlot2(),
                        demoman.getDemomanSlot3(), demoman.getDemomanSlot4());
            }
        });

        // Heavy Weapons Guy
        buttonPanel.add(heavyButton);
        heavyButton.setBackground(CustomColors.getCustomColor(245, 152, 59));
        heavyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                generateLoadout(heavy.getHeavyName(), heavy.getHeavySlot1(), heavy.getHeavySlot2(),
                        heavy.getHeavySlot3(), heavy.getHeavySlot4());
            }
        });

        // Engineer
        buttonPanel.add(engineerButton);
        engineerButton.setBackground(CustomColors.getCustomColor(245, 152, 59));
        engineerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                generateLoadout(engineer.getEngineerName(), engineer.getEngineerSlot1(), engineer.getEngineerSlot2(),
                        engineer.getEngineerSlot3(), engineer.getEngineerSlot4());
            }
        });

        // Sniper
        buttonPanel.add(sniperButton);
        sniperButton.setBackground(CustomColors.getCustomColor(245, 152, 59));
        sniperButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                generateLoadout(sniper.getSniperName(), sniper.getSniperSlot1(), sniper.getSniperSlot2(),
                        sniper.getSniperSlot3(), sniper.getSniperSlot4());
            }
        });

        // Medic
        buttonPanel.add(medicButton);
        medicButton.setBackground(CustomColors.getCustomColor(245, 152, 59));
        medicButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                generateLoadout(medic.getMedicName(), medic.getMedicSlot1(), medic.getMedicSlot2(),
                        medic.getMedicSlot3(), medic.getMedicSlot4());
            }

        });

        // Spy
        buttonPanel.add(spyButton);
        spyButton.setBackground(CustomColors.getCustomColor(245, 152, 59));
        spyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                generateLoadout(spy.getSpyName(), spy.getSpySlot1(), spy.getSpySlot2(), spy.getSpySlot3(),
                        spy.getSpySlot4());
            }
        });

        // Create GUI layout for loadout
        JLabel headerLabel = new JLabel("TF2 Loadout Generator (Now in Java!)", SwingConstants.CENTER);
        Font headerFont = new Font("Arial", Font.ITALIC, 32);
        headerLabel.setFont(headerFont);

        displayPanel = new JPanel(new GridLayout(5, 1));
        displayPanel.setBackground(Color.GRAY);
        classLabel = new JLabel("Selected Class: ...", SwingConstants.CENTER);
        primaryLabel = new JLabel("...", SwingConstants.CENTER);
        secondaryLabel = new JLabel("...", SwingConstants.CENTER);
        thirdLabel = new JLabel("...", SwingConstants.CENTER);
        specialLabel = new JLabel("", SwingConstants.CENTER);

        Font boldDisplayFont = new Font("Arial", Font.BOLD, 16);
        classLabel.setFont(boldDisplayFont);
        primaryLabel.setFont(boldDisplayFont);
        secondaryLabel.setFont(boldDisplayFont);
        thirdLabel.setFont(boldDisplayFont);
        specialLabel.setFont(boldDisplayFont);

        displayPanel.add(classLabel);
        displayPanel.add(primaryLabel);
        displayPanel.add(secondaryLabel);
        displayPanel.add(thirdLabel);
        displayPanel.add(specialLabel);

        // Add panels to frame
        frame.add(headerLabel, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        frame.add(displayPanel, BorderLayout.CENTER);

        // Set frame properties and display it
        frame.setSize(750, 350);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void generateLoadout(
            String className,
            String[] spot1,
            String[] spot2,
            String[] spot3,
            String[] spot4) {

        Random rand = new Random();

        String primarySlot = spot1[rand.nextInt(spot1.length)];
        String secondarySlot = spot2[rand.nextInt(spot2.length)];
        String thirdSlot = spot3[rand.nextInt(spot3.length)];
        String specialSlot = spot4[rand.nextInt(spot4.length)];

        Font boldDisplayFont = new Font("Arial", Font.BOLD, 16);
        classLabel.setFont(boldDisplayFont);
        primaryLabel.setFont(boldDisplayFont);
        secondaryLabel.setFont(boldDisplayFont);
        thirdLabel.setFont(boldDisplayFont);
        specialLabel.setFont(boldDisplayFont);

        switch (className) {

            // Change labels for Spy
            case "Spy":
                classLabel.setText("Selected Class: " + className);
                primaryLabel.setText("Melee: " + primarySlot);
                secondaryLabel.setText("Secondary: " + secondarySlot);
                thirdLabel.setText("Cloak: " + thirdSlot);
                specialLabel.setText("Sapper: " + specialSlot);
                break;

            // Include PDA
            case "Engineer":
                classLabel.setText("Selected Class: " + className);
                primaryLabel.setText("Primary: " + primarySlot);
                secondaryLabel.setText("Secondary: " + secondarySlot);
                thirdLabel.setText("Melee: " + thirdSlot);
                specialLabel.setText("PDA: " + specialSlot);
                break;

            // Replace secondary with medigun for label
            case "Medic":
                classLabel.setText("Selected Class: " + className);
                primaryLabel.setText("Primary: " + primarySlot);
                secondaryLabel.setText("Medigun: " + secondarySlot);
                thirdLabel.setText("Melee: " + thirdSlot);
                specialLabel.setText("");
                break;

            default:
                classLabel.setText("Selected Class: " + className);
                primaryLabel.setText("Primary: " + primarySlot);
                secondaryLabel.setText("Secondary: " + secondarySlot);
                thirdLabel.setText("Melee: " + thirdSlot);
                specialLabel.setText("");
                break;
        }

        /*
         * Subclasses or some change of gameplay if certain conditions are met.
         */

        // Change Demoman to Demoknight when boots and shield is equipped.
        if (className.equals("Demoman") &&
                primarySlot.equals("Ali Baba's Wee Booties") &&
                (secondarySlot.equals("Chargin' Targe") ||
                        secondarySlot.equals("Splendid Screen") ||
                        secondarySlot.equals("Tide Turner"))) {

            classLabel.setText("Selected Class: Demoknight");
            primaryLabel.setText("Boots: " + primarySlot);
            secondaryLabel.setText("Shield: " + secondarySlot);
        }

        // Change to Demoman to Hybridknight when equipped with any shield
        if (className.equals("Demoman") &&
                (secondarySlot.equals("Chargin' Targe") ||
                        secondarySlot.equals("Splendid Screen") ||
                        secondarySlot.equals("Tide Turner"))) {

            classLabel.setText("Selected Class: Hybrid Demoknight");
            secondaryLabel.setText("Shield: " + secondarySlot);
        }

        // Change to Demoman to Demoflight when equipped with the BASE Jumper
        if (className.equals("Demoman") && primarySlot.equals("B.A.S.E. Jumper")) {

            classLabel.setText("Selected Class: Demoflight");
        }

        // Change to Engineer to Battle Engineer when equipped with the Gunslinger
        if (className.equals("Engineer") && thirdSlot.equals("Gunslinger")) {

            classLabel.setText("Selected Class: Battle Engineer");
        }

        // Change to Sniper to Huntsman Sniper when equipped with the Huntsman
        if (className.equals("Sniper") && primarySlot.equals("Huntsman")) {

            classLabel.setText("Selected Class: Huntsman Sniper");
        }

        // Change to Soldier to Trolldier when equipped with the Rocket Jumper,
        // BASE Jumper or Mantreads and Market Gardener
        if (className.equals("Soldier") &&
                primarySlot.equals("Rocket Jumper") &&
                (secondarySlot.equals("Mantreads") ||
                        secondarySlot.equals("B.A.S.E. Jumper"))
                &&
                thirdSlot.equals("Market Gardener")) {

            classLabel.setText("Selected Class: Trolldier");
        }

        // Replace secondary with lunch item when Heavy equips a lunchbox item
        if (className.equals("Heavy") &&
                (secondarySlot.equals("Sandvich") ||
                        secondarySlot.equals("Dalokohs Bar") ||
                        secondarySlot.equals("Buffalo Steak Sandvich") ||
                        secondarySlot.equals("Second Banana"))) {

            secondaryLabel.setText("Lunch: " + secondarySlot);
        }

        // Replace secondary with backpack item when Soldier equips a backpack item
        if (className.equals("Soldier") &&
                (secondarySlot.equals("Buff Banner") ||
                        secondarySlot.equals("Battalion's Backup") ||
                        secondarySlot.equals("Concheror"))) {
            secondaryLabel.setText("Backpack: " + secondarySlot);
        }
    }
}
