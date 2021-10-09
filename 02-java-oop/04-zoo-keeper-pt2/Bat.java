public class Bat extends Mammal {

    public Bat(int energyLevel){
        super(energyLevel);
    }

    //flying -50 energy
    public void fly(){
        System.out.println("3,2,1... Takeoff!");
        this.energyLevel -= 50;
    }
    //eat +25 energy
    public void eatHumans(){
        System.out.println("Yum!");
        this.energyLevel += 25;
    }
    //attack town -100 energy
    public void attackTown(){
        System.out.println("CARNAGE!");
        this.energyLevel -= 100;
    }
}