public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    public String getTitle() {
        return title;
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
    }

    // Title only
    public DigitalVideoDisc(String name) {
        this(name, null, null, 0, 0.0f);
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
