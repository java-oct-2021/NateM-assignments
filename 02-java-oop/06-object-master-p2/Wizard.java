public class Wizard extends Human {

    public Wizard(){
        this.health = 50;
        this.intelligence = 8;
    }
    public void heal(Human player){
        player.health += this.intelligence;
    }

    public void fireball(Human player){
        player.health -= (this.intelligence * 3);
        System.out.println("Player now has health of: " + player.health);
    }
}