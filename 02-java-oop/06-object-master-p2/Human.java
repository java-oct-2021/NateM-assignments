public class Human {
    protected int health;
    protected int strength;
    protected int stealth;
    protected int intelligence;

    public Human() {
        this.health = 100;
        this.strength = 3;
        this.stealth = 3;
        this.intelligence = 3;
    }

    public void attack(Human player) {
        player.health -= this.strength;
        System.out.println("This player attacked another dealing: " + this.strength + ". The other players health is now: " + player.health);
    }
}