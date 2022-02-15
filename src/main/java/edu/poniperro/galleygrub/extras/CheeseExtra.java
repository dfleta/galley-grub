package edu.poniperro.galleygrub.extras;

import java.util.Optional;

import edu.poniperro.galleygrub.order.Order;

public class CheeseExtra extends Extra {

    private Double CHEESE_PRICE = 0.25d;

    public CheeseExtra() {};

    @Override
    public void sumExtras(Order order) {
        Optional<Double> cheeseCharge = order.itemList().stream()
                            .filter(item -> item.extra().equals(CHEESE))
                            .map(item -> CHEESE_PRICE)
                            .reduce(Double::sum);

        if (cheeseCharge.isPresent()) {
            order.updateTotal(cheeseCharge.get());  
        }

        if(this.nextExtra != null) {
            this.nextExtra.sumExtras(order);
        }
    }
    
}
