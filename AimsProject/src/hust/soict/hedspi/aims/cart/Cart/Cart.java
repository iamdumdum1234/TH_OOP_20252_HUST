package hust.soict.hedspi.aims.cart.Cart;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class Cart {
    // Standard variables from lab assignment
    public static final int MAX_NUMBERS_ORDERED = 20;
    int qtyOrdered = 0;
    private final DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    // Add one (1) disc
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        // Max DVD check
        if (qtyOrdered >= MAX_NUMBERS_ORDERED) {
            System.out.println("Maximum number of DVDs reached! Please remove one to continue!");
        }
        else {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("Successfully added " + disc.getTitle() + " to the cart!");
            System.out.println("You now have " + qtyOrdered + " disc(s) in your cart.");
        }
    }

    // Add a list of discs
    /*public void addDigitalVideoDisc(hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc [] dvdList) {
        for (int i = 0; i < dvdList.length; i++) {
            // Max DVD check
            if (qtyOrdered >= MAX_NUMBERS_ORDERED) {
                System.out.println("Maximum number of DVDs reached! Please remove one to continue!");
            }
            else {
                itemsOrdered[qtyOrdered] = dvdList[i];
                qtyOrdered++;
                System.out.println("Successfully added your item to the cart!");
                System.out.println("You now have " + qtyOrdered + " disc(s) in your cart.");
            }
        }
    }*/

    // Arbitrary arguments (PROBABLY BETTER)
    public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
        for (int i = 0; i < dvdList.length; i++) {
            if (qtyOrdered >= MAX_NUMBERS_ORDERED) {
                System.out.println("Maximum number of DVDs reached! Please remove one to continue!");
            }
            else {
                itemsOrdered[qtyOrdered] = dvdList[i];
                qtyOrdered++;
                System.out.println("Successfully added " + dvdList[i].getTitle() + " to the cart!");
                System.out.println("You now have " + qtyOrdered + " disc(s) in your cart.");
            }
        }
    }

    // Method overloading using different arguments
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (qtyOrdered >= MAX_NUMBERS_ORDERED - 1) {
            System.out.println("Maximum number of DVDs reached! Please remove one to continue!");
        }
        else {
            itemsOrdered[qtyOrdered] = dvd1;
            ++qtyOrdered;
            itemsOrdered[qtyOrdered] = dvd2;
            ++qtyOrdered;
            System.out.println("Successfully added 2 DVDs to your cart!");
            System.out.println("You now have " + qtyOrdered + " disc(s) in your cart.");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                System.out.println("Removing " + itemsOrdered[i].getTitle() + " from cart...");
                // Move everything from the targeted dvd to the left
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null; // Remove the final duplicate from the array
                qtyOrdered--; // One less DVD
                System.out.println("Successfully removed it from the cart!");
                return;
            }
        }
        System.out.println("No DVD like that can be found! Please try again!");
    }

    public float totalCost() {
        float totalPrice = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            // Iterate through costs, if null, skip
            if (itemsOrdered[i].getCost() != 0.0f) {
                totalPrice += itemsOrdered[i].getCost();
            }
        }
        return totalPrice;
    }

    // find DVD by title
    public void findDVD(String title) {
        for (int i = 0; i < qtyOrdered; i++) {
            String curTitle = itemsOrdered[i].getTitle();
            if (curTitle.contains(title)) {
                System.out.println("Match found!");
                String curCategory = itemsOrdered[i].getCategory();
                String curDirector = itemsOrdered[i].getDirector();
                int curLength = itemsOrdered[i].getLength();
                float curPrice = itemsOrdered[i].getCost();
                printDetails(curTitle, curCategory, curDirector, curLength, curPrice);
                return;
            }
        }
        System.out.println("No DVD by that name can be found! Cannot find it!");
    }

    // find DVD by ID
    public void findDVD(int ID) {
        if (ID > qtyOrdered || ID <= 0) {
            // If ID larger than number of discs in cart, or is LEQ to 0, just skip everything
            System.out.println("No DVD by that name can be found! Cannot find it!");
            return;
        }
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].id == ID) {
                System.out.println("Match found!");
                String curTitle = itemsOrdered[i].getTitle();
                String curCategory = itemsOrdered[i].getCategory();
                String curDirector = itemsOrdered[i].getDirector();
                int curLength = itemsOrdered[i].getLength();
                float curPrice = itemsOrdered[i].getCost();
                printDetails(curTitle, curCategory, curDirector, curLength, curPrice);
                return;
            }
        }
        System.out.println("No DVD by that name can be found! Cannot find it!");
    }

    // print details of 1 (one) DVD
    private void printDetails(String curTitle, String curCategory, String curDirector, int curLength, float curPrice) {
        System.out.println("Title: " + curTitle);
        System.out.println("Category: " + curCategory);
        System.out.println("Director: " + curDirector);
        System.out.println("Length: " + curLength + " minutes");
        System.out.println("Price: " + curPrice);
    }

    public void printCart() {
        System.out.println("***********************CART***********************");
        for (int i = 0; i < qtyOrdered; i++) {
            String curTitle = itemsOrdered[i].getTitle();
            String curCategory = itemsOrdered[i].getCategory();
            String curDirector = itemsOrdered[i].getDirector();
            int curLength = itemsOrdered[i].getLength();
            float curPrice = itemsOrdered[i].getCost();
            System.out.println((i + 1) + ". " + "DVD - " + curTitle + " - " + curCategory + " - " + curDirector + " - " + curLength + ": " + curPrice + "$");
        }
        System.out.println("Total cost: " + String.format("%.2f", this.totalCost()));
        System.out.println("***************************************************");
    }
}