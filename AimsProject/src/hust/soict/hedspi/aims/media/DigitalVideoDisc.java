package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
    public static int nbDigitalVideoDiscs = 0;

    // One singular master constructor for everything, ensuring code reusability
    public DigitalVideoDisc(String name, String category, String director, int length, float cost) {
        super(nbDigitalVideoDiscs, name, category, cost, length, director);
        ++nbDigitalVideoDiscs;          // Add 1 DVD to total amount
        this.setId(nbDigitalVideoDiscs);  // Make that number the DVD's ID
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

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("Length: " + this.getLength());
    }
}
