public abstract class StatsAttacks {
    String name = null;
    int healthPoints = 0;
    int maxHealth = 0;
    int attack = 0;
    int speed = 0;
    public void hitPlayer(Player target) {

    }
    public void hitMonster(Monster target) {

    }

    public void heal(int amount) {
        healthPoints += amount;
        if(healthPoints > maxHealth) {
            healthPoints = maxHealth;
        }
    }



}
