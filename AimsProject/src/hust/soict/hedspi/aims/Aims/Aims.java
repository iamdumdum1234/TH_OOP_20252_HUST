package hust.soict.hedspi.aims.Aims;

import hust.soict.hedspi.aims.cart.Cart.Cart;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class Aims {
    public static void main (String[] args) {
        Cart anOrder = new Cart();

        // Sample data from lab assignment
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);

        // DVD removal test
        DigitalVideoDisc notInCart = new DigitalVideoDisc("Testing");
        anOrder.removeDigitalVideoDisc(dvd2);
        anOrder.removeDigitalVideoDisc(notInCart);

        DigitalVideoDisc alsoNotInCart = new DigitalVideoDisc("My Sanity");
        anOrder.removeDigitalVideoDisc(alsoNotInCart);

        anOrder.addDigitalVideoDisc(notInCart, alsoNotInCart);

        System.out.println("Total Cost is: " + String.format("%.2f", anOrder.totalCost()));
    }
}