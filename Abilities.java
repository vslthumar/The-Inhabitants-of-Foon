/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *This class defines abilities and calculations of abilities by creating objects of particular classes.
 * @author Raj Kothari
 */
public class Abilities {

    /**
     *an object of Humanoid class
     */
    Humanoid humanoid;

    /**
     *an object of Wizard class
     */
    Wizard wizard;

    /**
     *set magic rating by crating a variable and calling getMagic method from Wizard class
     */
    double magic=wizard.getMagic();

    /**
     *variable declaration for damage
     */
    double damage;

    /**
     *variable declaration of strength and set the value by calling getStrength method from humanoid class
     */
    double strength=humanoid.getStrength();

    /**
     *variable declaration of dexterity and set the value by calling getDexterity method from humanoid class
     */
    double dexterity=humanoid.getDexterity();

    /**
     *variable declaration of health and set the value by calling getHealth method from humanoid class
     */
    double health=humanoid.getHealth();

    /**
     *variable declaration of armour and set the value by calling getArmour method from humanoid class
     */
    double armour=humanoid.getArmour();

    /**
     *method declaration for attack by counting the and returning the damage
     * @return
     */
    public double attack(){
        return (strength+dexterity+health)/3;
    }

    /**
     *method declaration for defense by counting and returning the damage while defending
     * @return
     */
    public double defense(){
        return health-(((strength+dexterity+health)/3)/armour);
    }

    /**
     *method declaration for stealing by counting and returning stolen money
     * @return
     */
    public double stealing(){
        return dexterity/2;
    }

    /**
     *method declaration for healing by counting and returning damaged health
     * @return
     */
    public double healing(){
        magic=magic-3;
        return magic/2;
    }



    
}
