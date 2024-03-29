package com.example;

public class Monster extends StatsAttacks{

    public Monster(String name) {
        this.name = name;
        this.healthPoints = 30;
        this.attack = 10;
        this.speed = 10;
        this.maxHealth = 30;
        this.isMonster = true;
    }

    public boolean hitPlayer(Player target) {
        System.out.println("Monster " + this.name  + " attacked player " + target.name);
        return hitPlayer(target);
    }

    public void getStats() {
        System.out.println("HP: " + this.healthPoints + "\nAttack: " + this.attack + "\nSpeed: " + this.speed);
    }

    public String getName() {
        return this.name;
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
