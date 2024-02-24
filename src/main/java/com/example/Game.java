package com.example;

import java.util.Scanner;

public class Game {
    public static Scanner scanner = new Scanner(System.in);

    public String nameCopy = null;
    public int healthPointsCopy = 0;
    public int maxHealthCopy = 0;
    public int attackCopy = 0;
    public int speedCopy = 0;

    //-------------------------------------------//

    public String monsterName = null;
    public int monsterHealthPoints = 0;
    public int monsterMaxHealth = 0;
    public int monsterAttack = 0;
    public int monsterSpeed = 0;

    //-------------------------------------------//

    public static boolean quit;

    public static void run() {
        

    }
    public void startGame() {
        System.out.println("New game started!\nWhat is your name?");
        String name = scanner.nextLine();
        Player player = new Player(name);
        System.out.println("New player: Name: " + player.name);
        player.getStats();
        System.out.println("*-------------------*");
        printInstructions();
        System.out.println("help: show instructions");
        this.nameCopy = player.name;
        this.healthPointsCopy = player.healthPoints;
        this.attackCopy = player.attack;
        this.speedCopy = player.speed;
        while (!quit) {
            if(command() == 1 ) {
                continue;
            } else {
                continue;
            }
        }
    }

    public int command() {
        String input = scanner.nextLine();
        switch (input) {
            case "quit":
                this.quit = true;
                break;
            case "spawn":
                if(spawnMonster() == 1) {
                    fight();
                    return 1;
                }

                break;
            case "stats":
                printStats();
                break;
            case "help":
                printInstructions();
                break;
            default:
                this.quit = true;
                break;
        }
        return 0;
    }

    public int spawnMonster() {
        boolean contextAction = true;
        Monster monster = new Monster("basic monster");
        switch (monster.getName()) {
            case "basic monster":
                this.monsterName = monster.getName();
                this.monsterAttack = monster.getAttack();
        }
        System.out.println("A new monster appeared! Name: " + monster.getName());
        while(contextAction) {
            System.out.println("*----*");
            System.out.println("Fight monster? (Y/N)");
            System.out.println("*----*");
            if (scanner.nextLine().compareTo("Y") == 0) {
                contextAction = false;
                System.out.println("Fight began");
                return 1;
            } else if (scanner.nextLine().compareTo("N") == 0) {
                System.out.println("Ambush avoided.");
                contextAction = false;
            } else {
                continue;
            }
        }
        return 0;
    }

    public void printInstructions() {
        System.out.println("quit: end game");
        System.out.println("spawn: fight monster");
        System.out.println("stats: show player stats");
    }

    public void printStats() {
        System.out.println("HP: " + this.healthPointsCopy + "/" + this.maxHealthCopy + "\nAttack: " + this.attackCopy + "\nSpeed: " + this.speedCopy);
    }

    public void fight() {
        Monster temporaryMonster = new Monster("basic monster");
        assembleCharacter(temporaryMonster);
        Player temporaryPlayer = new Player("PLACEHOLDER");
        assembleCharacter(temporaryPlayer);
        int speedCheck = Integer.compare(temporaryPlayer.getSpeed(), temporaryMonster.getSpeed());
        if(speedCheck == 1) {
            System.out.println("You were quicker than the monster!");
            temporaryPlayer.hitMonster(temporaryMonster);
        } else if(speedCheck == -1) {
            System.out.println("The monster was quicker than you!");
            temporaryMonster.hitPlayer(temporaryPlayer);
        } else {
            if(Math.random() >= 0.5) {
                System.out.println("The monster was quicker than you!");
                temporaryMonster.hitPlayer(temporaryPlayer);
            } else {
                System.out.println("You were quicker than the monster!");
                temporaryPlayer.hitMonster(temporaryMonster);
            }
        }
    }

    public void assembleCharacter(StatsAttacks character) {
        if(character.isMonster) {
            character.maxHealth = this.monsterMaxHealth;
            character.attack = this.monsterAttack;
            character.healthPoints = this.monsterHealthPoints;
            character.speed = this.monsterSpeed;
        } else {
            character.maxHealth = this.maxHealthCopy;
            character.attack = this.attackCopy;
            character.healthPoints = this.healthPointsCopy;
            character.speed = this.speedCopy;
        }
    }
}
