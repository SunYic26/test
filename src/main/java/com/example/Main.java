package com.example;

public class Main {
    public static void main(String[] args) {
        boolean quit = false;
        Game game = new Game();
        game.startGame();

        while(Game.quit != true) {
            game.command();
        }


    }
}
