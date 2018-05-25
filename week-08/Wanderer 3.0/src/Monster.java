import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Monster extends GameObject{

    Graphics graphics;

    Random random = new Random();
    int x = random.nextInt(10)*Area.sizeOfGameObject;
    int y = random.nextInt(10)*Area.sizeOfGameObject;

    public Monster() {
        super("src/img/skeleton.png", 0, 0);

        generateRandomMonster(graphics);

    }

    public void generateRandomMonster(Graphics graphics) {
        int x = random.nextInt(10)*Area.sizeOfGameObject;
        int y = random.nextInt(10)*Area.sizeOfGameObject;
        ArrayList<Integer> xy = new ArrayList();
        xy.add(x/Area.sizeOfGameObject);
        xy.add(y/Area.sizeOfGameObject);

        if (Board.wall.contains(xy)) {
            generateRandomMonster(graphics);
        }

        else {
            this.posX = x;
            this.posY = y;
        }

    }
}
