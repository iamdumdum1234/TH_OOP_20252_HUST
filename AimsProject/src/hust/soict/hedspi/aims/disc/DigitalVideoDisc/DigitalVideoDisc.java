package hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class DigitalVideoDisc {
    private String title;
    private final String category;
    private final String director;
    private final int length;
    private final float cost;

    public static int nbDigitalVideoDiscs = 0;
    public int id;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    // One singular master constructor for everything, ensuring code reusability
    public DigitalVideoDisc(String name, String category, String director, int length, float cost) {
        this.title = name;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        ++nbDigitalVideoDiscs;          // Add 1 DVD to total amount
        this.id = nbDigitalVideoDiscs;  // Make that number the DVD's ID
    }

    // Title only
    public DigitalVideoDisc(String name) {this(name, null, null, 0, 0.0f);
    }

    // Name, category, cost only
    public DigitalVideoDisc(String name, String category, float cost) {
        this(name, category, null, 0, cost);
    }

    // Name, category, director, cost only
    public DigitalVideoDisc(String name, String category, String director, float cost) {
        this(name, category, director, 0, cost);
    }
}
