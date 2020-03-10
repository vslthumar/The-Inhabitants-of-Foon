/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *This class declared to design humans and inherited super class of humanoid with all the attributes
 * @author Vishal Thumar
 */
public class Human extends Humanoid {

    /**
     * declaration of an object of Elf class to declared an enemy
     */
    private Elf enemy;

    /**
     * declaration of an object of Abilities class for the Human
     */
    Abilities abilities;

    /**
     *declaration of variable for damage and set the value by calling attack method from Abilities class
     */
    private double damage=abilities.attack();

    /**
     *declaration of variable for defence and setting values by calling defense method of Abilities class
     */
    private double defence=abilities.defense();

    /**
     *
     * the constructor for the Human class to determine all the abilities and attributes
     * 
     * @param name
     * @param strength
     * @param dexterity
     * @param armour
     * @param moxie
     * @param coins
     * @param health
     * @param enemy
     */
    public Human(String name, double strength, double dexterity, double armour, double moxie, int coins, double health, Elf enemy) {
        super(name, strength, dexterity, armour, moxie, coins, health);
        this.enemy=enemy;
    }

    /**
     *method declaration to get the human's enemy elf
     * @return
     */
    public Elf getEnemy() {
        return enemy;
    }

    /**
     *method declaration for defence
     */
    public void defence(){
        if(super.isDeadOrAlive())
        health=health-defence;
    } 

    /**
     *method declaration to get damage count
     * @return
     */
    public double getDamage() {
        return damage;
    }
    
    
    
}
