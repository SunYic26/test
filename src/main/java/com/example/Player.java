package com.example;

public class Player extends StatsAttacks{

    public Player(String name) {
        this.name = name;
        this.healthPoints = 50;
        this.attack = 20;
        this.speed = 15;
        this.maxHealth = 50;
        this.isMonster = false;
    }
    public boolean hitMonster(Monster target) {
        System.out.println("Player " + this.name  + " attacked monster " + target.name);
        return hitMonster(target);
    }


    public void getStats() {
        System.out.println("HP: " + this.healthPoints + "/" + this.maxHealth + "\nAttack: " + this.attack + "\nSpeed: " + this.speed);
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }

    @Override
    public int getHealthPoints() {
        return super.getHealthPoints();
    }

    @Override
    public int getAttack() {
        return super.getAttack();
    }

    @Override
    public int getMaxHealth() {
        return super.getMaxHealth();
    }
}
