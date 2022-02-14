package edu.poniperro.galleygrub.order;

import java.util.ArrayList;
import java.util.List;

import edu.poniperro.galleygrub.items.Item;

class Order {
    
    private final List<Item> items = new ArrayList<Item>();

    Order() {};

    void addItem(String name, double price) {

        Item item = ItemFactory.getItem(name, price); 
        this.items.add(item);      
    }

    int size() {
        return this.items.size();
    }
}
