import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

    //int testBoxX;
    //int testBoxY;
    static Graphics graphics;
    static int sizeOfBoard;
    static int sizeOfGameObject;

    GameObject hero = new GameObject("src/img/hero-down.png", 0, 0);

    public Board() {

        // set the size of your draw board
        sizeOfBoard = 720;
        sizeOfGameObject = 72;
        setPreferredSize(new Dimension(sizeOfBoard, sizeOfBoard));
        setVisible(true);

    }


    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        //graphics.fillRect(testBoxX, testBoxY, 100, 100);
        // here you have a 720x720 canvas
        // you can create and draw an image using the class below e.g.
        //Area.createArea(graphics);
        Area.createArea(graphics);
        hero.draw(graphics);

    }

    public static void main(String[] args) {
        // Here is how you set up a new window and adding our board to it
        JFrame frame = new JFrame("RPG Game title");
        Board board = new Board();
        frame.add(board);
        Board.setGraphics(graphics);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
        // Here is how you can add a key event listener
        // The board object will be notified when hitting any key
        // with the system calling one of the below 3 methods
        frame.addKeyListener(board);
        // Notice (at the top) that we can only do this
        // because this Board class (the type of the board object) is also a KeyListener


    }

    private static void setGraphics(Graphics graphics) {
        Board.graphics = graphics;
    }

    // To be a KeyListener the class needs to have these 3 methods in it
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyCode());
    }

    // But actually we can use just this one for our goals here
    @Override
    public void keyReleased(KeyEvent e) {
        // When the up or down keys hit, we change the position of our box
        if (e.getKeyCode() == KeyEvent.VK_UP && hero.posY != 0) {
            hero.posY -= sizeOfGameObject;
        } else if(e.getKeyCode() == KeyEvent.VK_DOWN && hero.posY != 9*sizeOfGameObject) {
            hero.posY += sizeOfGameObject;
        } else if(e.getKeyCode() == KeyEvent.VK_LEFT  && hero.posX != 0) {
            hero.posX -= sizeOfGameObject;
        } else if(e.getKeyCode() == KeyEvent.VK_RIGHT  && hero.posX != 9*sizeOfGameObject) {
            hero.posX += sizeOfGameObject;
        }
        // and redraw to have a new picture with the new coordinates
        repaint();
    }

//    private void drawMapOfTiles(Graphics graphics) {
//
////        try { // Required by Files.readAllLines(filePath);
////            // Reads the content from `lorem-psum.txt` in the `assets` folder line by line to a String List
////            Path filePath = Paths.get("src/txt/wall.txt");
////            List<String> lines = Files.readAllLines(filePath);
////            System.out.println(lines.get(0)); // Prints the first line of the file
////        } catch (Exception e) {
////            System.out.println("Uh-oh, could not read the file!");
////        }
//
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
//
//    }
}

