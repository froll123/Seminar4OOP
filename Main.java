package Seminar4OOP;

import Seminar4OOP.Shield.BigShield;
import Seminar4OOP.Shield.SmallShield;
import Seminar4OOP.Weapons.Bow;
import Seminar4OOP.Weapons.Sword;

public class Main {

    public static void main(String[] args) {
    
        Team<Swordman> team1 = new Team<>();
        team1.addWarriorToTeam(new Swordman("Fina", 250, new Sword(25), new SmallShield(30,30)))
        .addWarriorToTeam(new Swordman("Elrond", 200, new Sword(30), new SmallShield(50, 30)));
        for (Swordman swordmen : team1) {
            System.out.println(swordmen);
        }

        Team<Archer> team2 = new Team<>();
        team2.addWarriorToTeam(new Archer("Fiona", 150, new Bow (30,200), new BigShield(100)))
        .addWarriorToTeam(new Archer("Lanselot", 130, new Bow (20,250),new BigShield(150)));
        for (Archer archer : team2) {
            System.out.println(archer);
        }

        System.out.println(team1.maxTeamRange());
        System.out.println(team2.maxTeamRange());

        System.out.println(team1.minTeamArmor());
        System.out.println(team2.minTeamArmor());
    }
    
}