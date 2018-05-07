public class Flower extends Plant {

//    The Flower
//    needs water if its current water amount is less then 5
//    when watering it the flower can only absorb the 75% of the water
//    eg. watering with 10 the flower's amount of water should only increase with 7.5

    public Flower(String color) {
        super(color);
        this.absorbPercentage = 0.75;
        this.waterNeed = 5;
        this.name = this.color + " Flower";
    }

}
