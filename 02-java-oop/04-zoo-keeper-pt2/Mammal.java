class Mammal {

    public int energyLevel;

    public Mammal(int energyLevel) {
        this.energyLevel = energyLevel; 
    }
    public int displayEnergy(){
        System.out.println("Current energy level is: " + energyLevel);
        return this. energyLevel;
    }
}