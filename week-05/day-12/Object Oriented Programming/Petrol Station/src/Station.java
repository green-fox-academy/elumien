public class Station {

//    Station
//            gasAmount
//    refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount

    int gasAmount;

    public void refill(Car c)
    {
        this.gasAmount-= c.capacity;
        c.gasAmount+= c.capacity;
    }

}
