import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

import java.util.Random;

public class RainbowBoxFunction {

    static Random rnd = new Random();

    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.



        int size = 30;

        Color color;

        for (int i = 10; i > 0; i--) {

            color = new Color(rnd.nextInt(256),rnd.nextInt(256),rnd.nextInt(256));
            rainbowSquare(graphics, size*(i+1), color);
        }

    }

    public static void rainbowSquare(Graphics g, int size, Color color) {

        g.setColor(color);
        g.fillRect((WIDTH-size)/2, (HEIGHT-size)/2,size, size);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}