public class Samurai extends Human {

    static int numberOfPeople = 0;

    public Samurai() {
        this.health = 200;
        numberOfPeople++;
    }

    public void deathBlow(Human player){
        player.health = 0;
        this.health = (this.health/2);
        System.out.println("You got ONESHOT!");
    }
    public void meditate() {
        this.health += (this.health/2);
    }

    public static void howMany(){
        System.out.println(numberOfPeople);
    }

}
