import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

public class Board extends JComponent implements KeyListener {

    static Graphics graphics;
    static int sizeOfBoard;
    static int sizeOfGameObject;
    public static ArrayList<ArrayList<Integer>> wall = Area.getWallList(Area.readMapFile());
    static Random random = new Random();

    static Hero hero = new Hero();
    static ArrayList<Monster> monsters = new ArrayList<>();

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
        for (Monster monster : monsters) {
            monster.draw(graphics);
        }


    }

    public static void createMonsters(Graphics graphics) {

        for (int i = 0; i < 3; i++) {
            Monster monster = new Monster();
            monsters.add(monster);
        }

    }


    public static void setGraphics(Graphics graphics) {
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

            ArrayList<Integer> xy = new ArrayList<>();
            xy.add(hero.posX/sizeOfGameObject);
            xy.add(hero.posY/sizeOfGameObject - 1);

            if (!wall.contains(xy)) {
                hero.posY -= sizeOfGameObject;
                hero.turnUp();
            }

        } else if(e.getKeyCode() == KeyEvent.VK_DOWN && hero.posY != 9*sizeOfGameObject) {

            ArrayList<Integer> xy = new ArrayList<>();
            xy.add(hero.posX/sizeOfGameObject);
            xy.add(hero.posY/sizeOfGameObject + 1);

            if (!wall.contains(xy)) {
                hero.posY += sizeOfGameObject;
                hero.turnDown();
            }

        } else if(e.getKeyCode() == KeyEvent.VK_LEFT  && hero.posX != 0) {

            ArrayList<Integer> xy = new ArrayList<>();
            xy.add(hero.posX/sizeOfGameObject - 1);
            xy.add(hero.posY/sizeOfGameObject);

            if (!wall.contains(xy)) {
                hero.posX -= sizeOfGameObject;
                hero.turnLeft();
            }

        } else if(e.getKeyCode() == KeyEvent.VK_RIGHT  && hero.posX != 9*sizeOfGameObject) {

            ArrayList<Integer> xy = new ArrayList<>();
            xy.add(hero.posX/sizeOfGameObject + 1);
            xy.add(hero.posY/sizeOfGameObject);

            if (!wall.contains(xy)) {
                hero.posX += sizeOfGameObject;
                hero.turnRight();
            }

        }
        // and redraw to have a new picture with the new coordinates


        repaint();
    }


}

