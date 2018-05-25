import java.awt.*;

public class GameEventHandler {



    public static void drawMapOfTiles() {
        int x = 0;
        int y = 0;

        int numberOfTiles = 10;
        int sizeOfTiles = 72;

        for (int currentX = 0; currentX < numberOfTiles; currentX++) {
            for (int currentY = 0; currentY < numberOfTiles; currentY++) {

                if (currentY == 4) {
                    NotEmptyTile net = new NotEmptyTile(x,y);
                    net.draw(graphics);
                } else {
                    EmptyTile et = new EmptyTile(x,y);
                    et.draw(graphics);
                }
                y += sizeOfTiles;
            }
            x += sizeOfTiles;
            y = 0;
        }

    }

}
