
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vishal Thumar
 * 
 * This class is a model class to design humanoids with their attributes and abilities 
 */
public class Humanoid {

    /**
     *declaration of variable for name of humanoid
     */
    String name;

    /**
     *declaration of variable for strength of humanoid
     */
    double strength,

    /**
     *declaration of variable for dexterity of humanoid
     */
    dexterity,

    /**
     *declaration of variable for armour of humanoid
     */
    armour,

    /**
     *declaration of variable for moxie of humanoid
     */
    moxie,

    /**
     *declaration of variable for health of humanoid
     */
    health;

    /**
     *declaration of variable for coins of humanoid
     */
    private int coins;

    /**
     *declaration of variable for dead or alive for humanoid
     */
    private boolean deadOrAlive;

    /**
     *declaration of variable of stats of humanoid 
     */
    String stats;

    /**
     *
     * @param name
     * @param strength
     * @param dexterity
     * @param armour
     * @param moxie
     * @param coins
     * @param health
     * 
     * declaration of constructor of humanoid with the range of it's abilities and health
     */
    public Humanoid(String name, double strength, double dexterity, double armour, double moxie, int coins, double health) {

        this.name = name;
        if (strength >= 0 && strength <= 20) {
            this.strength = strength;
        } else if (strength > 20) {
            this.strength = 20;
        } else {
            this.strength = 0;
        }
        if (dexterity >= 0 && dexterity <= 20) {
            this.dexterity = dexterity;
        } else if (dexterity > 20) {
            this.dexterity = 20;
        } else {
            this.dexterity = 0;
        }
        if (armour >= 0 && armour <= 20) {
            this.armour = armour;
        } else if (armour > 20) {
            this.armour = 20;
        } else {
            this.armour = 0;
        }
        if (moxie >= 0 && moxie <= 20) {
            this.moxie = moxie;
        } else if (moxie > 20) {
            this.moxie = 20;
        } else {
            this.moxie = 0;
        }
        if (coins >= 0 && coins <= 20) {
            this.coins = coins;
        } else if (coins > 20) {
            this.coins = 20;
        } else {
            this.coins = 0;
        }
        if (health > 0 && health <= 20) {
            this.health = health;
            deadOrAlive = true;
        } else if (health > 20) {
            this.health = 20;
        } else {
            this.health = 0;
            deadOrAlive = false;
        }     
    }

    /**
     *this method is declared to get name of humanoid
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *this method is declared to get strength rating of humanoid
     * @return
     */
    public double getStrength() {
        return strength;
    }

    /**
     *this method is declared to get dexterity rating of humanoid
     * @return
     */
    public double getDexterity() {
        return dexterity;
    }

    /**
     *this method is declared to get armour rating of humanoid
     * @return
     */
    public double getArmour() {
        return armour;
    }

    /**
     *this method is declared to get moxie rating of humanoid
     * @return
     */
    public double getMoxie() {
        return moxie;
    }

    /**
     *this method is declared to get coins of humanoid
     * @return
     */
    public double getCoins() {
        return coins;
    }

    /**
     *this method is declared to get health rating of humanoid
     * @return
     */
    public double getHealth() {
        return health;
    }

    /**
     *this method is declared to get boolean of dead or alive humanoid
     * @return
     */
    public boolean isDeadOrAlive() {
        return deadOrAlive;
    }
    
    /**
     *this method is declared to raise strength of humanoid
     */
    public void raiseStrength(){
        strength++;
    }

    /**
     *this method is declared to lower the strength of humanoid
     */
    public void lowerStrength(){
        strength--;
    }

    /**
     *this method is declared to raise dexterity of humanoid
     */
    public void raiseDexterity(){
        dexterity++;
    }

    /**
     *this method is declared to lower the dexterity of humanoid
     */
    public void lowerDexterity(){
        dexterity--;
    }

    /**
     *this method is declared to raise armour of humanoid
     */
    public void raiseArmour(){
        armour++;
    }

    /**
     *this method is declared to lower the armour of humanoid
     */
    public void lowerArmour(){
        armour--;
    }

    /**
     *this method is declared to raise moxie of humanoid
     */
    public void raiseMoxie(){
        moxie++;
    }

    /**
     *this method is declared to lower the moxie of humanoid
     */
    public void lowerMoxie(){
        moxie--;
    }

    /**
     *this method is declared to check if humanoid is alive or dead strength of humanoid
     */
    public void aliveOrDead(){
        if(isDeadOrAlive())
            stats="Alive";
        else
            stats="Dead";
    }

}
