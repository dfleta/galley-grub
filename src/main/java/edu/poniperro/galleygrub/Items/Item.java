package edu.poniperro.galleygrub.Items;

public class Item {



    String name = "";
    Double price = 0d; 

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return this.name + " " + String.format("%.2f", this.price) + "$";
    }    
}
