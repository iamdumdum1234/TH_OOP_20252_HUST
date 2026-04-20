package hust.soict.hedspi.aims.store.Store;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class Store {
    // Temporary max limit of 50000 DVDs as IDK how to make it variable for now
    private final DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[50000];
    private int quantity = 0;

    public void addDVD(DigitalVideoDisc... dvdList) {
        for (int i = 0; i < dvdList.length; i++) {
            if (quantity >= 50000) {
                System.out.println("Maximum limit of DVDs reached!");
                System.out.println("Cannot add " + dvdList[i].getTitle() + " to the system database!");
            }
            itemsInStore[quantity] = dvdList[i];
            quantity++;
            System.out.println("Successfully added " + dvdList[i].getTitle() + " with an ID of " + dvdList[i].id + " to the system database!");
            System.out.println("There are now " + quantity + " disc(s) in the database.");
        }
    }

    public void removeDVD(DigitalVideoDisc disc) {
        for (int i = 0; i < quantity; i++) {
            if (itemsInStore[i] == disc) {
                System.out.println("Removing " + itemsInStore[i].getTitle() + " from cart...");
                // Move everything from the targeted dvd to the left
                for (int j = i; j < quantity - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[quantity - 1] = null; // Remove the final duplicate from the array
                quantity--;
                System.out.println("Successfully removed it from the store database!");
                return;
            }
        }
        System.out.println("No DVD like that can be found! Please try again!");
    }
}