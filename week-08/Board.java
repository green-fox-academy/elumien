import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Board extends JComponent implements KeyListener {

    int testBoxX;
    int testBoxY;

    public Board() {
        testBoxX = 300;
        testBoxY = 300;

        // set the size of your draw board
        setPreferredSize(new Dimension(720, 720));
        setVisible(true);
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("RPG Game");
        Board board = new Board();
        frame.add(board);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
        frame.addKeyListener(board);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.fillRect(testBoxX, testBoxY, 100, 100);
        // here you have a 720x720 canvas
        // you can create and draw an image using the class below e.g.
        //PositionedImage image = new PositionedImage("lol", 300, 300);
        //image.draw(graphics);


        System.out.println("lol");
        drawMapOfTiles(graphics);
    }

    private void drawMapOfTiles(Graphics graphics) {

        try { // Required by Files.readAllLines(filePath);
            // Reads the content from `lorem-psum.txt` in the `assets` folder line by line to a String List
            Path filePath = Paths.get("src/txt/wall.txt");
            List<String> lines = Files.readAllLines(filePath);
            System.out.println(lines.get(0)); // Prints the first line of the file
        } catch (Exception e) {
            System.out.println("Uh-oh, could not read the file!");
        }

//        int x = 0;
//        int y = 0;
//
//        int numberOfTiles = 10;
//        int sizeOfTiles = 72;
//
//        for (int currentX = 0; currentX < numberOfTiles; currentX++) {
//            for (int currentY = 0; currentY < numberOfTiles; currentY++) {
//
//                if (currentY == 4) {
//                    NotEmptyTile net = new NotEmptyTile(x,y);
//                    net.draw(graphics);
//                } else {
//                    EmptyTile et = new EmptyTile(x,y);
//                    et.draw(graphics);
//                }
//                y += sizeOfTiles;
//            }
//            x += sizeOfTiles;
//            y = 0;
//        }

    }

    // To be a KeyListener the class needs to have these 3 methods in it
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    // But actually we can use just this one for our goals here
    @Override
    public void keyReleased(KeyEvent e) {
        // When the up or down keys hit, we change the position of our box
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            testBoxY -= 100;
        } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
            testBoxY += 100;
        }
        // and redraw to have a new picture with the new coordinates
        repaint();
    }
}