package edu.poniperro.galleygrub.extras;

import edu.poniperro.galleygrub.order.Order;

public abstract class Extra {

    static final String CHEESE = "cheese";
    static final String SAUCE = "sauce";
    static final String SIZE_LARGE = "large";

    String extraProduct = "";

    Extra nextExtra;

    public void setNextExtra(Extra nextExtra) {
        this.nextExtra = nextExtra;
    }  
    
    public abstract void sumExtras(Order order);
}
