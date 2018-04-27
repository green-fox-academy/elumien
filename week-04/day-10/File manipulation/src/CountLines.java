import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
    // Write a function that takes a filename as string,
    // then returns the number of lines the file contains.
    // It should return zero if it can't open the file, and
    // should not raise any error.
    public static void main(String[] args) {

    int lines = lineCounter("my-file.txt");

    System.out.println(lines);

    }

    private static int lineCounter(String fileName) {

        int lines;

        try{
            Path filePath = Paths.get(fileName);
            List<String> text = Files.readAllLines(filePath);
            lines = text.size();

        }
        catch (Exception e)
        {
            lines = 0;
        }

        return lines;
    }
}

