/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *This class declared to design fighters  and inherited super class of Human with all the attributes
 * @author Vishal Thumar
 */
public class Fighter extends Human{

    /**
     *declaration of variable for damage and set the value by calling getDamage() method from super class
     */
    private double damage=super.getDamage();

    /**
     *
     *  the constructor for the Fighter class to determine all the abilities and attributes
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
    public Fighter(String name, double strength, double dexterity, double armour, double moxie, int coins, double health, Elf enemy) {
        super(name, strength, dexterity, armour, moxie, coins, health, enemy);
    }

    /**
     *method declaration for attack
     */
    public void attack(){
        if(super.isDeadOrAlive())
       damage=2*damage;
    }

    /**
     *toString method to get output
     * @return
     */
    @Override
    public String toString() {
        return "Class:Elf , Name:"+name +  ", Stats:"+stats+", Health:"+health+", Strength:"+strength+", Dexterity:"+ dexterity+", Armour:"+ armour+", Moxie:"+ moxie;
    }
    
}
