public class Monster extends StatsAttacks{

    public Monster(String name) {
        this.name = name;
        this.healthPoints = 30;
        this.attack = 10;
        this.speed = 10;
        this.maxHealth = 30;
    }

    public void hitPlayer(Player target) {
        System.out.println("Monster " + this.name  + " attacked player " + target.name);
        target.healthPoints -= this.attack;
    }

    public void getStats() {
        System.out.println("HP: " + this.healthPoints + "\nAttack: " + this.attack + "\nSpeed: " + this.speed);
    }

    public String getName() {
        return this.name;
    }
}
