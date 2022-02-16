package edu.poniperro.galleygrub.extras;

import java.util.Optional;

import edu.poniperro.galleygrub.order.Order;

public class SauceExtra extends Extra {


    private Double SAUCE_PRICE = 0.50d;

    public SauceExtra() {};

    @Override
    public void sumExtras(Order order) {
        Optional<Double> sauceCharge = order.itemList().stream()
                            .filter(item -> item.extra().equals(SAUCE))
                            .map(item -> SAUCE_PRICE)
                            .reduce(Double::sum);

        if (sauceCharge.isPresent()) {
            order.updateTotal(sauceCharge.get());  
        }

        if(this.nextExtra != null) {
            this.nextExtra.sumExtras(order);
        }
    }
}
