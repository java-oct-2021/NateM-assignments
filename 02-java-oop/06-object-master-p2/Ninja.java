public class Ninja extends Human {

    public Ninja(){
        this.stealth = 10;
    }

    public void steal(Human player) {
        player.health -= this.stealth;
        this.health += this.stealth;
    }

    public void runAway(Human player){
        this.health -= 10;
    }
}