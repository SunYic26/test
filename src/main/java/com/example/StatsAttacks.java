package com.example;

public abstract class StatsAttacks {
    public String name = null;
    public int healthPoints = 0;
    public int maxHealth = 0;
    public int attack = 0;
    public int speed = 0;
    /** Changes made to hitPlayer according to old Character class, might have bugs **/
    public boolean hitPlayer(Player target) {
        target.healthPoints-= this.attack;
        System.out.println(this.name + " attacked " + target.name + " for " + this.attack + " hp.");
        if(target.healthPoints<= 0) {
            target.healthPoints = 0;
            System.out.println(this.name + " defeated " + target.name + "!");
            return false;
        } else {
            System.out.println(target.name + "'s hp is now " + target.healthPoints);
            return true;
        }
    }
    public boolean hitMonster(Monster target) {
        target.healthPoints-= this.attack;
        System.out.println(this.name + " attacked " + target.name + " for " + this.attack + " hp.");
        if(target.healthPoints<= 0) {
            target.healthPoints = 0;
            System.out.println(this.name + " defeated " + target.name + "!");
            return false;
        } else {
            System.out.println(target.name + "'s hp is now " + target.healthPoints);
            return true;
        }
    }

    public void heal(int amount) {
        this.healthPoints += amount;
        if(healthPoints > maxHealth) {
            healthPoints = maxHealth;
        }
        System.out.println(this.name + " healed for " + amount + " hp.");
        System.out.println(this.name + "'s hp is now " + this.healthPoints);
    }

    public void stats() {
        System.out.println("Player name: " + this.name + "          Level: FILLER " + "           Exp until next level: FILLER");
        System.out.println("Attack: " + this.attack + "           Health: " + this.healthPoints + " out of " + this.maxHealth + "           Speed: " + this.speed);
    }


}
