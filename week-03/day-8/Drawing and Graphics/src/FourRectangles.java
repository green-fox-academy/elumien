import org.w3c.dom.css.RGBColor;

import javax.swing.*;

import java.awt.*;

import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    static int WIDTH = 320;
    static int HEIGHT = 343;

    static int x;
    static int y;
    static int width;
    static int height;
    static Color color;

    static Random rnd = new Random();

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.

        for (int i = 0; i < 3; i++) {
            randomize();
            drawRectangle(graphics, x,y,width,height,color);
        }



    }

    private static void randomize() {

        x = rnd.nextInt(WIDTH / 2) + 0;
        y = rnd.nextInt(HEIGHT / 2) + 0;
        width = rnd.nextInt(WIDTH/2-10) + 10;
        height = rnd.nextInt(HEIGHT/2-10) + 10;
        color = new Color(rnd.nextInt(256),rnd.nextInt(256),rnd.nextInt(256));
    }

    private static void drawRectangle(Graphics g, int x, int y, int width, int height, Color color) {

        g.setColor(color);
        g.drawRect(x,y,width,height);

    }

    //    Don't touch the code below
    //static int WIDTH = 320;
    //static int HEIGHT = 343;
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}