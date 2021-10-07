public class Gorilla extends Mammal {

    public Gorilla(int energyLevel){
        super(energyLevel);
}
//throw minus 5
public void throwSomething(){
    System.out.println("The gorilla is throwing rocks again!");
    this.energyLevel -= 5;
}
//eat plus 10
public void eatBanana(){
    System.out.println("Gorilla eat banana YUMMM!");
    this.energyLevel += 10;
}
//climb minus 10
public void climbTree(){
    System.out.println("Gorilla tired from workout!");
    this.energyLevel -= 10;
}
}