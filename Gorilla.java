class Gorilla extends Mammal{

    public void throwSomething(){
        this.energyLevel = energyLevel - 5;
        System.out.println("The gorilla has thrown something, its energy level is now " + this.energyLevel + " energy");
    }
    public void eatBananas(){ 
        this.energyLevel = energyLevel + 10; 
        System.out.println("The gorilla has eaten a tasty banana and has " + this.energyLevel + " energy");
    }
    public void climb(){
        this.energyLevel = energyLevel - 10;
        System.out.println("The gorilla has climbed, it has " + this.energyLevel + " energy");
    }
}