package edu.poniperro.galleygrub.extras;

import java.util.Optional;

import edu.poniperro.galleygrub.order.Comanda;

public class SizeLargeExtra extends Extra {

    private Double SIZE_PRICE = 0.50d;

    public SizeLargeExtra() {
    };

    @Override
    public void sumExtras(Comanda order) {
        
        Optional<Double> sizeCharge = order.itemList().stream()
                .filter(item -> item.extra().equals(SIZE_LARGE))
                .map(item -> SIZE_PRICE)
                .reduce(Double::sum);

        if (sizeCharge.isPresent()) {
            order.updateTotal(sizeCharge.get());
        }

        this.nextExtra.ifPresent(chain -> chain.sumExtras(order));
    }
}
