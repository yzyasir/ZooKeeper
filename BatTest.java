class BatTest {
    public static void main(String[] args) {
        int flyCost = 50;
        int eatGain = 25;
        int attackCost = 100;

        BatActions b = new BatActions(); //instantiated batactions right here
        b.attackTown(attackCost);
        b.attackTown(attackCost);
        b.attackTown(attackCost);
        b.eatHumans(eatGain);
        b.eatHumans(eatGain);
        b.fly(flyCost);
        b.fly(flyCost);
    }
}