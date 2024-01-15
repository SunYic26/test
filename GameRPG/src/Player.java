public class Player extends StatsAttacks{

    public Player(String name) {
        this.name = name;
        this.healthPoints = 50;
        this.attack = 20;
        this.speed = 15;
        this.maxHealth = 50;
    }
    public void hitMonster(Monster target) {
        System.out.println("Player " + this.name  + " attacked monster " + target.name);
        target.healthPoints -= this.attack;
    }

    public void getStats() {
        System.out.println("HP: " + this.healthPoints + "\nAttack: " + this.attack + "\nSpeed: " + this.speed);
    }

}
