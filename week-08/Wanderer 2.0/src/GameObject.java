import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public abstract class GameObject {

    BufferedImage image;
    int positionX, positionY;
    static int sizeOfGameObject = 72;

    public GameObject(String filename, int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
        try {
            image = ImageIO.read(new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void draw(Graphics graphics) {
        if (image != null) {
            graphics.drawImage(image, positionX, positionY, null);
        }
    }
}