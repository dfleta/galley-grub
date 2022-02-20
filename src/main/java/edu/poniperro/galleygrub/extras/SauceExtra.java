package edu.poniperro.galleygrub.extras;

import java.util.Optional;

import edu.poniperro.galleygrub.order.Comanda;

public class SauceExtra extends Extra {

    private Double SAUCE_PRICE = 0.50d;

    public SauceExtra() {};

    @Override
    public void sumExtras(Comanda order) {
        
        Optional<Double> sauceCharge = order.itemList().stream()
                            .filter(item -> item.extra().equals(SAUCE))
                            .map(item -> SAUCE_PRICE)
                            .reduce(Double::sum);

        if (sauceCharge.isPresent()) {
            order.updateTotal(sauceCharge.get());  
        }

        this.nextExtra.ifPresent(chain -> chain.sumExtras(order));
    }
}
