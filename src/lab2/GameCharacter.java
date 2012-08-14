/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author vmware_xp
 */
public class GameCharacter {
    
    private String name;
    private int tankSpeed = 2;
    private int tankArmor = 0;
    private int tankHealth = 100;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //no validation is necessary.
        this.name = name;
    }

    public int getSpeed() {
        return tankSpeed;
    }

    public void setSpeed(int speed) {
        //validate speed is between 0 and x.
        //tank speed could vary based on powerups, etc.
        this.tankSpeed = speed;
    }

    public int getArmor() {
        return tankArmor;
    }

    public void setArmor(int armor) {
        //validate armor value is between 0 and 100.
        this.tankArmor = armor;
    }

    public int getHealth() {
        return tankHealth;
    }

    public void setHealth(int health) {
        //validate health value is between 0 and 100.
        this.tankHealth = health;
    }
    
    
}
