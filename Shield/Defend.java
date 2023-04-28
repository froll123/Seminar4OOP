package Seminar4OOP.Shield;

import Seminar4OOP.Defendable;

public abstract class Defend implements Defendable {
    protected int pointOfDefend;

    public Defend(int pointOfDefend) {
        this.pointOfDefend = pointOfDefend;
    }
    
}