package edu.poniperro.galleygrub.receipt;

import edu.poniperro.galleygrub.items.Item;
import edu.poniperro.galleygrub.order.Order;

public class Receipt {

    private Order order = null;
    private Double total = 0d;

    public Receipt(Order order) {
        this.order = order;
    }

    public Double total() {
        return this.total == 0d? this.sumRegularPrices(): this.total;
    }

    private Double sumRegularPrices() {
        for(Item item: this.order.itemList()) {
            this.total += item.price();
        }
        return this.total;
    }

    public void print() {
        this.order.display();
        System.out.print("\tTOTAL --> " + this.total + "\n");
    }
    
}
