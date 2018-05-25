import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Hero extends GameObject {


    public Hero() {
        super("src/img/hero-down.png", 0, 0);
    }

    public void turnUp() {
        try {
            image = ImageIO.read(new File("src/img/hero-up.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void turnDown() {
        try {
            image = ImageIO.read(new File("src/img/hero-down.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void turnLeft() {
        try {
            image = ImageIO.read(new File("src/img/hero-left.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void turnRight() {
        try {
            image = ImageIO.read(new File("src/img/hero-right.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

