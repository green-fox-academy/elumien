public class Car implements Moveable {
    public int distanceTaken;

    public Car() {
        distanceTaken = 0;
    }

    @Override
    public void move(int meter) {
        distanceTaken += meter;
    }
}