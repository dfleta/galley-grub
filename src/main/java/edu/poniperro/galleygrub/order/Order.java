package edu.poniperro.galleygrub.order;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.poniperro.galleygrub.items.Item;
import edu.poniperro.galleygrub.items.ItemFactory;

public class Order {
    
    private final List<Item> items = new ArrayList<Item>();

    public Order() {};

    public void addItem(String name, double price) {

        Item item = ItemFactory.getItem(name, price); 
        this.items.add(item);      
    }

    public int size() {
        return this.items.size();
    }

    public List<Item> itemList() {
        return Collections.unmodifiableList(this.items);
    }

    public void display() {
        System.out.print("\n\t --- ORDER --- \n");
        itemList().stream().forEach(this::itemDisplay);
    }

    private void itemDisplay(Item item) {
        System.out.print("\t" + item.toString() + "\n");
    }
}
