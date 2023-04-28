package Seminar4OOP.Weapons;

import Seminar4OOP.Weaponable;

public abstract class Weapon implements Weaponable  {
    protected int pointOfDamage;

    public Weapon(int pointOfDamage) {
        this.pointOfDamage = pointOfDamage;
    }
    
}