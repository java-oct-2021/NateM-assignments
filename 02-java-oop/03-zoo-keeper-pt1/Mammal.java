class Mammal {
    
    public int energyLevel;

    public Mammal(int energyLevel){
        this.energyLevel = energyLevel;
    }
    public int displayEnergy(){
        System.out.println("Current energy level is: " + this.energyLevel);
            return this.energyLevel;
    }

}