/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *This class declared to design fighters  and inherited super class of Human with all the attributes
 * @author Vishal Thumar
 */
public class Wizard extends Human{

    /**
     *declaration of magic variable
     */
    private double magic;

    /**
     *declaration of damage variable by calling getDamage method from super class
     */
    private double damage=super.getDamage();
    
    /**
     *
     *  the constructor for the Wizard class to determine all the abilities and attributes 
     * 
     * @param name
     * @param strength
     * @param dexterity
     * @param armour
     * @param moxie
     * @param coins
     * @param health
     * @param enemy
     * @param magic
     */
    public Wizard(String name, double strength, double dexterity, double armour, double moxie, int coins, double health, Elf enemy,double magic) {
        super(name, strength, dexterity, armour, moxie, coins, health, enemy);
        if (magic >= 0 && magic <= 20) {
            this.magic = magic;
        } else if (magic > 20) {
            this.magic = 20;
        } else {
            this.magic = 0;
        }
    }

    /**
     *method declaration to get magic rating
     * @return
     */
    public double getMagic() {
        return magic;
    }

    /**
     *method declaration for attack
     */
    public void attack(){
        if(super.isDeadOrAlive())
       damage=abilities.attack();
    }

    /**
     *method declaration for healing
     */
    public void healing(){
        if(super.isDeadOrAlive())
        health=health+abilities.healing();
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
