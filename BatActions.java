class BatActions extends Mammal{

    public void fly(int flyCost){
        this.batEnergyLevel = batEnergyLevel - flyCost; //this. is basically a reference to the var
        System.out.println("Giant Bat has begun to fly, it has " + this.batEnergyLevel + " energy");
    }
    public void eatHumans(int eatGain){
        this.batEnergyLevel = batEnergyLevel + eatGain;
        System.out.println("Giant bat has begun eating humans, it has " + this.batEnergyLevel + " energy");
    }
    public void attackTown(int attackCost){
        this.batEnergyLevel = batEnergyLevel - attackCost;
        System.out.println("Giant bat has begun attacking a town, and has " + this.batEnergyLevel + " energy");
    }
    
}