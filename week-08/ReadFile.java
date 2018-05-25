import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class ReadFile {

    public static List<String> readMapFile() {
        try {
            Path filePath = Paths.get("src/txt/wall.txt");
            List<String> lines = Files.readAllLines(filePath);
            return  lines;
        } catch (Exception e) {
            System.out.println("Uh-oh, could not read the file!");
            return null;
        }
    }
}