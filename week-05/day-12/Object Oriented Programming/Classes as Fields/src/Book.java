import java.util.ArrayList;
import java.util.List;

public class Book {
    List<Page> pages;

    public Book() {
        this.pages = new ArrayList<>();
    }

    public void add(Page page) {
        pages.add(page);
    }

    public int countBlankPages() {
        int counter = 0;
        for (Page page : this.pages) {
            if (page.getContent().isEmpty()) {
                counter++;
            }
        }
        return counter;
    }
}