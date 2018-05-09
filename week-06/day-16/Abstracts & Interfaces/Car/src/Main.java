public class Main {

    public static void main(String... args) {
        Car c = new Car();
        c.move(100);
        System.out.println(c.distanceTaken);

        Moveable something = new Car();
        something.move(200);
        System.out.println(((Car)something).distanceTaken);
    }
}
