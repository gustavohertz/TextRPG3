package com.mycompany.textrpg3;

public class Player extends Character{
     
    
    //Integers to store numbers of upgrades/skills in each path
    public int numAtkUpgrades, numDefUpgrades;
    
    //Array to store skill names
    public String[] atkUpgrades = {"Strength", "Power", "Might", "Godlike Strength"};
    public String[] defUpgrades = {"Heavy bones", "Stoneskin", "Scale Armor", "Holy Aura"};
    
    //Player specific constrructor
    public Player(String name){
        //calling constructor of superClass
        super(name, 100, 0);
        //setting # of upgrades to 0 
        this.numAtkUpgrades = 0;
        this.numDefUpgrades = 0;
        //let a player to chose a trait when creating a new character
        chooseTrait();
    }
    
    //player specific methods (more in the next part)
    @Override
    public int attack() {
        return 0;
    }

    @Override
    public int defend() {
        return 0;
    }
    
    //let the player choose a rait from each skill path
    public void chooseTrait(){
        GameLogic.clearConsole();
        GameLogic.printHeading("Escolha uma habilidade:");
        System.out.println("(1)" + atkUpgrades[numAtkUpgrades]);
        System.out.println("(2)" + defUpgrades[numDefUpgrades]);
        //get the player choice
        int input = GameLogic.readInt("->", 2);
        GameLogic.clearConsole();
        //deal whith both cases
        if(input == 1){
            GameLogic.printHeading("Voce escolheu " + atkUpgrades[numAtkUpgrades] + "!");
            numAtkUpgrades++;
        }else{
            GameLogic.printHeading("Voce escolheu " + defUpgrades[numDefUpgrades] + "!");
            numDefUpgrades++;
        }
            GameLogic.anythigToContinue();
    }
}
