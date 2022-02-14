package edu.poniperro.galleygrub.order;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class OrderMapTest {

    private OrderMap order = null;

    @Before
    public void setup_order() {
        order = new OrderMap();
    }

    @Test
    public void add_absent_item_test() {
        this.order.addItem("Krabby Patty", 1.25);
        assertEquals(1, this.order.itemsNum());
    }

    @Test
    public void add_present_item_test() {
        this.order.addItem("Krabby Patty", 1.25);
        this.order.addItem("Krabby Patty", 1.25);        
        assertEquals(1, this.order.itemsNum());
    }

    /*@Test
    public void item_quantity_test() {
        this.order.addItem("Krabby Patty", 1.25);
        this.order.addItem("Krabby Patty", 1.25); 
        assertEquals(2, this.order.itemQuantity("Krabby Patty"));
    }    */
}
