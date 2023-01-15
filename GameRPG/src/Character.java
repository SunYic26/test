public class Character {
    private int damage;
    private int health;
    private int maxHealth;
    private int speed;
    private int level;
    private int exp;
    private int maxExp;
    public String name;
    public int gameLevel;

    public Character(String name, int damage, int health, int maxHealth, int speed, int level) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.maxHealth = maxHealth;
        this.speed = speed;
        this.level = level;
        this.exp = 0;
        this.maxExp = 80;
        this.gameLevel = 1;
    }

    public boolean attack(Character target) {
        target.health-= this.damage;
        System.out.println(this.name + " attacked " + target.getName() + " for " + this.damage + " hp.");
        if(target.health <= 0) {
            target.health = 0;
            System.out.println(this.name + " defeated " + target.name + "!");
            return false;
        } else {
            System.out.println(target.getName() + "'s hp is now " + target.getHealth());
            return true;
        }
    }

    public void heal(int amount) {
        this.health += amount;
        if(this.health > this.maxHealth) {
            this.health = this.maxHealth;
        }
        System.out.println(this.name + " healed for " + amount + " hp.");
        System.out.println(this.name + "'s hp is now " + this.health);
    }

    public void stats() {
        System.out.println("Player name: " + this.name + "           Level: " + this.level + "           Exp until next level: " + (this.maxExp - this.exp));
        System.out.println("Attack: " + this.damage + "           Health: " + this.health + " out of " + this.maxHealth + "           Speed: " + this.speed);
    }

    public void fight(Character one, Character two) {
        boolean isFighting = true;
        while(isFighting) {
            if(one.getSpeed() > two.getSpeed()) {
                if(!one.attack(two)) {
                    one.increaseExp(50);
                    isFighting = false;
                    continue;
                }
                two.attack(one);
            } else if(two.getSpeed() > one.getSpeed()) {
                if(!two.attack(one)) {
                    isFighting = false;
                    continue;
                }
                one.attack(two);
            } else {
                if(!one.attack(two)) {
                    isFighting = false;
                    one.increaseExp(50);
                    continue;
                }
                two.attack(one);
            }
        }
    }

    public void increaseExp(int amount) {
        System.out.println(this.name + " gained " + amount + " exp!");
        if(amount > this.maxExp-this.exp) {
            int remaining = amount - (this.maxExp-this.exp);
            this.exp += this.maxExp-this.exp;
            levelUp();
            this.exp += remaining;
        } else {
            this.exp += amount;
        }
    }

    public void levelUp() {
        System.out.println(this.name + " leveled up to level " + (this.level + 1));
        this.level++;
        this.damage += 7;
        this.maxHealth += 5;
        heal(this.maxHealth / 5);
        this.speed += 5;
        this.maxExp += 20;
        this.exp = 0;
        System.out.println("New stats: "); {
            stats();
        }
        switch (this.level) {
            case 10: {
                this.gameLevel = 2;
                break;
            }
            case 20: {
                this.gameLevel = 3;
                break;
            }
            case 30: {
                this.gameLevel = 4;
            }
        }
    }


    public void updateStats(String name, int damage, int health, int maxHealth, int speed, int level) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.maxHealth = maxHealth;
        this.speed = speed;
        this.level = level;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getSpeed() {
        return speed;
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    public int getExp() {
        return exp;
    }

    public int getMaxExp() {
        return maxExp;
    }


}
