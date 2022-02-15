package edu.poniperro.galleygrub.receipt;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.poniperro.galleygrub.order.Order;

public class ReceiptTest {

    static Receipt receipt;

    
    @BeforeClass
    public static void setup_receipt() {

        Order order = new Order();

        order.addItem("Krabby Patty", 1.25);
        order.addItem("Coral Bits", 1.00);
        order.addItem("Kelp Rings", 1.50);
        order.addItem("Golden Loaf", 2.00);
        order.addItem("Seafom Soda", 1.00);

        receipt = new Receipt(order);
    }

    @Test
    public void total_test() {
        assertEquals(6.75d , receipt.total(), 0.1);
    }
    
}
