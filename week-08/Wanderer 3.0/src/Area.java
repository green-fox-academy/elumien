import java.awt.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Area{

    static int numberOfTiles = 10;
    static int sizeOfGameObject = 72;

    public static void createArea(Graphics graphics) {

        drawEmptyTiles(graphics);
        drawNotEmptyTiles(readMapFile(),graphics);
    }

    public static List<String> readMapFile() {
        try {
            Path filePath = Paths.get("src/txt/wall.txt");
            List<String> lines = Files.readAllLines(filePath);
            //System.out.println(lines.get(0));

            return  lines;
        } catch (Exception e) {
            System.out.println("Uh-oh, could not read the file!");
            return null;
        }
    }

    public static void drawNotEmptyTiles(List<String> lines, Graphics graphics) {

        ArrayList<ArrayList<Integer>> wall = new ArrayList<>();

        for (String line : lines) {

            ArrayList<Integer> coordinates = new ArrayList<>();
            coordinates.add(Character.getNumericValue(line.charAt(0)));
            coordinates.add(Character.getNumericValue(line.charAt(2)));
            wall.add(coordinates);
        }

        //System.out.println(wall.get(0)[0] +  " , " + wall.get(0)[0]);

        for (ArrayList<Integer> ints: wall) {

            //System.out.println(ints.get(0) + " , " + ints.get(1));

            NotEmptyTile net = new NotEmptyTile(ints.get(0)*sizeOfGameObject,ints.get(1)*sizeOfGameObject);
            net.draw(graphics);
        }

    }

    private static void drawEmptyTiles(Graphics graphics) {

//        try { // Required by Files.readAllLines(filePath);
//            // Reads the content from `lorem-psum.txt` in the `assets` folder line by line to a String List
//            Path filePath = Paths.get("src/txt/wall.txt");
//            List<String> lines = Files.readAllLines(filePath);
//            System.out.println(lines.get(0)); // Prints the first line of the file
//        } catch (Exception e) {
//            System.out.println("Uh-oh, could not read the file!");
//        }

        int x = 0;
        int y = 0;

        int sizeOfTiles = 72;

        for (int currentX = 0; currentX < numberOfTiles; currentX++) {
            for (int currentY = 0; currentY < numberOfTiles; currentY++) {

                EmptyTile et = new EmptyTile(x,y);
                et.draw(graphics);
                y += sizeOfTiles;
            }
            x += sizeOfTiles;
            y = 0;
        }

    }
}


