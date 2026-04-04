public class Cart {
    // Standard variables from lab assignment
    public static final int MAX_NUMBERS_ORDERED = 20;
    int qtyOrdered = 0;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        // Max DVD check
        if (qtyOrdered >= MAX_NUMBERS_ORDERED) {
            System.out.println("Maximum number of DVDs reached! Please remove one to continue!");
        }
        else {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("Successfully added your item to the cart!");
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
}
