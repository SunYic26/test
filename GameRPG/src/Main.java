import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isPlaying = true;
        System.out.println("WELCOME TO THE GAME! WHAT IS YOUR NAME?");
        Character player = new Character(scanner.nextLine(), 50, 100, 100, 50, 1);
        System.out.println("Enter: (1) to check stats, (2) to find enemies to fight, (3) to use item, (4) to exit game");
        while(isPlaying) {
            switch (scanner.nextInt()) {
                case 1: {
                    player.stats();
                    scanner.nextLine();
                    break;
                }
                case 2: {
                    scanner.nextLine();
                    System.out.println("You wandered into tall grass.");
                    Character monster = new Character("The monster", 30, 80, 100, 20, 1);
                    switch (player.gameLevel) {
                        case 1:
                            break;
                        case 2:
                            monster.updateStats("The zombie", 60, 130, 130, 80, 10);
                            break;
                        case 3:
                            monster.updateStats("The ghost", 80, 180, 180, 140, 20);
                            break;
                        case 4:
                            monster.updateStats("The demon", 100, 250, 250, 200, 30);
                            break;
                    }
                    System.out.println("You were ambushed by " + monster.getName() + ": Level " + monster.getLevel() + "!");
                    player.fight(player, monster);
                    break;
                }
                case 3: {
                    player.heal(50);
                    scanner.nextLine();
                    break;
                }
                case 4: {
                    isPlaying = false;
                    break;
                }
            }
        }
    }
}
