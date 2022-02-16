package edu.poniperro.galleygrub.receipt;

import edu.poniperro.galleygrub.extras.Extra;
import edu.poniperro.galleygrub.order.Order;

public class Receipt {

    private Order order = null;
    private Double total = 0d;
    private Extra firstExtra = null;

    public Receipt(Order order) {
        this.order = order;
        this.total = order.getTotal();
    }

    public Order getOrder() {
        return this.order;
    }

    public void setChain(Extra extra) {
        this.firstExtra = extra;
    }

    public Extra getChain() {
        return this.firstExtra;
    }

    public Double total() {
        if (this.total == 0d) {
            this.sumExtrasCharge();
            this.total = this.getOrder().getTotal();
        }
        return this.total;
    }

    public void sumExtrasCharge() {
        if (this.firstExtra != null) {
            this.firstExtra.sumExtras(this.order);
        }
    }

    public void print() {
        this.getOrder().display();
        System.out.print("\tTOTAL --------> " + String.format("%.2f", this.total) + "$\n");
    }
}
