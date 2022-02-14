package edu.poniperro.galleygrub;

import edu.poniperro.galleygrub.items.Item;
import edu.poniperro.galleygrub.order.Order;

/**
 * 
 * Bib Esponja trabaja como cocinero en el Krusty Krab, 
 * restaurante famoso for su hamburguesa Krabby Patty.
 * El restaurante tiene un menu llamado Galley Grub
 * que puedes leer aquí:
 * https://spongebob.fandom.com/wiki/Galley_Grub
 * 
 * Las comandas son anotadas a mano por Squidward Tentacles,
 * pero el propierario Eugene H. Krabs -un agarrao-
 * en vez de adquirir un TPV ha decidido contratar
 * a un estudiante de Dual para que programar un software
 * para calcular el importe total del pedido e imprimir el recibo.
 * 
 * Intenta hacer como que programas si no quieres terminar
 * en la cocina ayudando a Bob a preparar Krusty Burguers.
 */
public class App 
{
    public static void main( String[] args )
    {

        /**
         * Crea los items del menu 
         * y printa sus datos.
         * 
         * Krabby Patty
         * Coral Bits
         * Kelp Rings
         * Golden Loaf
         * Seafom Soda
         */

        Item patty = new Item("Krabby Patty", 1.25);
        display(patty);
        Item bits = new Item("Coral Bits", 1.00);
        display(bits);
        Item rings = new Item("Kelp Rings", 1.50);
        display(rings);
        Item loaf = new Item("Golden Loaf", 2.00);
        display(loaf);
        Item soda = new Item("Seafom Soda", 1.00);
        display(soda);

        /**
         * Bubble Bass llega al restaurante
         * y hace un pedido muy simple.
         * Quiere todo lo que hay en el menu
         * en su tamaño estandar y sin 
         * condimentos extras.
         * 
         * Crea la comanda.
         */

        Order order = new Order();

        order.addItem("Krabby Patty", 1.25);
        order.addItem("Coral Bits", 1.00);
        order.addItem("Kelp Rings", 1.50);
        order.addItem("Golden Loaf", 2.00);
        order.addItem("Seafom Soda", 1.00);

        order.display();
    }

    public static void display(Item item) {
        System.out.print("\t" + item.toString() + "\n");
    }
}
