package Seminar4OOP;

import Seminar4OOP.Shield.SmallShield;
import Seminar4OOP.Weapons.Sword;

public class Swordman extends Warrior {

    public Swordman(String name, int healthPoint, Sword sword, SmallShield smallShield ) {
        super(name, healthPoint, sword, smallShield);
    }

    @Override
    public String toString() {
        return "Swordmen" + super.toString();
    }
    
    public int shotArmor(){
        return ((SmallShield)getDefend()).getArmor();
    }
    
}