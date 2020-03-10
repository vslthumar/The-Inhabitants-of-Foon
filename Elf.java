/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *This class declared to design elves with their clan and inherited super class of humanoid with all the attributes
 * @author Vishal Thumar
 */
public class Elf extends Humanoid {

    /**
     *declaration of clan of the elf
     */
    private boolean clan;

    /**
     *declaration of the hobbit best friend of the elf by creating an object of Hobbit class
     */
    private Hobbit bestFriend;

    /**
     *declaration of an object of Abilities class for the elf
     */
    private Abilities abilities;

    /**
     *declaration of damage which the elf makes during attack
     */
    private double damage;

    /**
     *declaration of defence of the elf by calling defence method from Abilities class
     */
    private double defence=abilities.defense();

    /**
     *declaration of clan name of the elf
     */
    private String clanName;

    /**
     *this method checks the boolean of the elf's clan
     * @return
     */
    public boolean isClan() {
        return clan;
    }

    /**
     *method declaration to get the elf's best friend hobbit
     * @return
     */
    public Hobbit getBestFriend() {
        return bestFriend;
    }

    /**
     *method declaration to set the elf's best friend hobbit
     * @param bestFriend
     */
    public void setBestFriend(Hobbit bestFriend) {
        this.bestFriend = bestFriend;
    }

    /**
     *
     * the constructor for the Elf class to determine all the abilities and attributes
     * 
     * @param name
     * @param strength
     * @param dexterity
     * @param armour
     * @param moxie
     * @param coins
     * @param health
     * @param clan
     * @param bestFriend
     * 
     * 
     */
    public Elf(String name, double strength, double dexterity, double armour, double moxie, int coins, double health,boolean clan,Hobbit bestFriend) {
        super(name, strength, dexterity, armour, moxie, coins, health);
        this.clan=clan;
        this.bestFriend=bestFriend;
        if(clan==true)
            clanName="Forest";
        else
            clanName="City";
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
     * tostring method of Elf class to get the output
     * @return
     */
    @Override
    public String toString() {
        return "Class:Elf , Name:"+name + ", Clan:" + clanName + ", Stats:"+stats+", Health:"+health+", Strength:"+strength+", Dexterity:"+ dexterity+", Armour:"+ armour+", Moxie:"+ moxie;
    }
}
