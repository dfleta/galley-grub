package edu.poniperro.galleygrub.extras;

import java.util.Optional;

import edu.poniperro.galleygrub.order.Order;

public abstract class Extra {

    static final String CHEESE = "cheese";
    static final String SAUCE = "sauce";
    static final String SIZE_LARGE = "large";

    String extraProduct = "";

    Optional<Extra> nextExtra = Optional.ofNullable(null);

    public void setNextExtra(Extra nextExtra) {
        this.nextExtra = Optional.of(nextExtra);
    }  
    
    public abstract void sumExtras(Order order);
}
