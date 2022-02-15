package edu.poniperro.galleygrub.items;

public class Item {

    String name = "";
    Double price = 0d;
    String extra = "";

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Item(String name, double price, String extra) {
        this.name = name;
        this.price = price;
        this.extra = extra;
    }

    public String name() {
        return this.name;
    }

    public Double price() {
        return this.price;
    }

    @Override
    public String toString() {
        return this.extra.isEmpty()? 
            this.name + "...." + String.format("%.2f", this.price) + "$": 
            this.name + " w/ " + this.extra + "...." + String.format("%.2f", this.price) + "$";
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
