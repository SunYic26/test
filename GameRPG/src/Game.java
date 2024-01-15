import java.util.Scanner;

public class Game {
    Scanner scanner = new Scanner(System.in);

    public static boolean quit;
    public void startGame() {
        System.out.println("New game started!\nWhat is your name?");
        String name = scanner.nextLine();
        Player player = new Player(name);
        System.out.println("New player: Name: " + player.name);
        player.getStats();
    }

    public void command() {
        String input = scanner.nextLine();
        switch (input) {
            case "quit":
                this.quit = true;
                break;
            case "spawn":
                spawnMonster();
                break;
            case "stats":

            default:
                this.quit = true;
                break;
        }
    }

    public void spawnMonster() {

        Monster monster = new Monster("monster");
    }



}
