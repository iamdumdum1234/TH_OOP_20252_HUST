package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private List<String> authors = new ArrayList<String>();

    public Book(int id, String title, String category, float cost, List<String> authors) {
        super();
        this.setId(id);
        this.setTitle(title);
        this.setCategory(category);
        this.setCost(cost);
        this.authors = authors;
    }

    public void addAuthor(String author) {
        if (!authors.contains(author)) {
            authors.add(author);
        }
        else {
            System.out.println("Author already exists!");
        }
    }

    public void removeAuthor(String author) {
        if (authors.contains(author)) {
            authors.remove(author);
        }
        else {
            System.out.println("Author does not exist!");
        }
    }
}
