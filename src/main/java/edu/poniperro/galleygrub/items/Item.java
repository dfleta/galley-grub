package edu.poniperro.galleygrub.items;

public class Item {

    String name = "";
    Double price = 0d; 

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String name() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name + " " + String.format("%.2f", this.price) + "$";
    }
    
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Item) {
            return this.name.equals(((Item)obj).name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
}
