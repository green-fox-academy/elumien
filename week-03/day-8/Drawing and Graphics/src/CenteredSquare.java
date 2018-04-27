import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenteredSquare {

    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void mainDraw(Graphics graphics) {
        // Draw a green 10x10 square to the canvas' center.

        int size = 10;

        graphics.setColor(Color.GREEN);
        graphics.drawRect((WIDTH-size)/2, (HEIGHT-size)/2,size, size);



    }

    // Don't touch the code below
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

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }
}