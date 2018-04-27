import javax.swing.*;

        import java.awt.*;

        import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {
    public static void mainDraw(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps/r3.png]

        int size = 20;

        int x = 0;

        int y = 0;

        for (int i = 1; i < 5; i++) {
            graphics.setColor(new Color(138,43,226));
            x = factorio(i)*size;
            y = factorio(i)*size;
            graphics.fillRect(x,y,size*i,size*i);
            graphics.setColor(Color.BLACK);
            graphics.drawRect(x,y,size*i,size*i);

        }



    }

    private static int factorio(int number) {

        int factor = 1;

        for (int i = 1; i <= number; i++) {
            factor *= i;
        }

        return factor;
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