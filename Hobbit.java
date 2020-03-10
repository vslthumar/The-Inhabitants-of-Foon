/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *This class declared to design hobbits  and inherited super class of humanoid with all the attributes
 * @author Vishal Thumar
 */
public class Hobbit extends Humanoid {
    
    /**
     *declaration of an object of Abilities class for the Hobbit
     */
    private Abilities abilities;

    /**
     *declaration of variable for damage 
     */
    private double damage;

    /**
     *declaration of variable for defence and setting values by calling defense method of Abilities class
     */
    private double defence=abilities.defense();

    /**
     *declaration of coins and set the value by calling getCoins() method
     */
    private double coins=getCoins();
    
    /**
     *
     * the constructor for the Hobbit class to determine all the abilities and attributes
     * 
     * @param name
     * @param strength
     * @param dexterity
     * @param armour
     * @param moxie
     * @param coins
     * @param health
     */
    public Hobbit(String name, double strength, double dexterity, double armour, double moxie, int coins, double health) {
        super(name, strength, dexterity, armour, moxie, coins, health);
    }

    /**
     *method declaration for the attack which elf makes
     */
    public void attack(){
        if(super.isDeadOrAlive())
       damage=abilities.attack();
    }

    /**
     *method declaration for the defense of the elf
     */
    public void defence(){
        if(super.isDeadOrAlive())
        health=health-defence;
    }

    /**
     *method declaration for the stealing money by the elf
     */
    public void stealing(){
        if(super.isDeadOrAlive())
        coins=(int) (coins+abilities.stealing());
    }

    /**
     *tostring method of Hobbit class to get the output
     * @return
     */
    @Override
    public String toString() {
        return "Class:Elf , Name:"+name +  ", Stats:"+stats+", Health:"+health+", Strength:"+strength+", Dexterity:"+ dexterity+", Armour:"+ armour+", Moxie:"+ moxie;
    }
    
}
