import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

    static Graphics graphics;
    int sizeOfGameObject = GameObject.sizeOfGameObject;
    Hero hero = new Hero(0,0);
    int testBoxX;
    int testBoxY;


    public Board() {
        testBoxX = 300;
        testBoxY = 300;

        // set the size of your draw board
        setPreferredSize(new Dimension(720, 720));
        setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.fillRect(testBoxX, testBoxY, 100, 100);
        // here you have a 720x720 canvas
        // you can create and draw an image using the class below e.g.

        EmptyTile emptyTile = new EmptyTile(300,300);
        emptyTile.draw(graphics);

        //hero = new Hero(0,0);
        hero.draw(graphics);
    }

    public static void main(String[] args) {
        // Here is how you set up a new window and adding our board to it
        JFrame frame = new JFrame("RPG Game");
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

    }

    // But actually we can use just this one for our goals here
    @Override
    public void keyReleased(KeyEvent e) {
        // When the up or down keys hit, we change the position of our box
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            //testBoxY -= 100;
            hero.positionY -= -sizeOfGameObject;
        } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
            //testBoxY += 100;
            hero.positionY += -sizeOfGameObject;
        } else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
            //testBoxX -= 100;
            hero.positionX -= -sizeOfGameObject;
        } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
            //testBoxX += 100;
            hero.positionX += -sizeOfGameObject;
        }

        hero.draw(graphics);

        // and redraw to have a new picture with the new coordinates
        repaint();
    }
}