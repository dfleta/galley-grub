package edu.poniperro.galleygrub;

import edu.poniperro.galleygrub.discounts.Extra;
import edu.poniperro.galleygrub.discounts.ExtraDiscount;
import edu.poniperro.galleygrub.discounts.SauceExtra;
import edu.poniperro.galleygrub.discounts.SizeExtra;
import edu.poniperro.galleygrub.items.Item;
import edu.poniperro.galleygrub.order.Order;
import edu.poniperro.galleygrub.receipt.Receipt;

/**
 * 
 * Bob Esponja trabaja como cocinero en el Krusty Krab, 
 * restaurante famoso por su hamburguesa de autor
 * Krabby Patty.
 * El restaurante tiene un menu llamado Galley Grub
 * que puedes leer aquí:
 * https://spongebob.fandom.com/wiki/Galley_Grub
 * 
 * Las comandas son anotadas a mano por Squidward Tentacles.
 * El propierario Eugene H. Krabs -un agarrao-
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

        System.out.print("\t --- GALLEY GRUB ---  \n");
        
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
         * y hace una comanda muy simple.
         * Quiere todo lo que hay en el menu
         * en su tamaño estandar y sin 
         * condimentos extras.
         * 
         * Squidward Tentacles crea la comanda
         * y la muestra en la pantalla para que
         * el cliente le de el visto bueno
         * antes de generar el recibo con la factura.
         */

        Order order = new Order();

        order.addItem("Krabby Patty", 1.25);
        order.addItem("Coral Bits", 1.00);
        order.addItem("Kelp Rings", 1.50);
        order.addItem("Golden Loaf", 2.00);
        order.addItem("Seafom Soda", 1.00);

        order.display();

        /**
         * Squidward Tentacles calcula el
         * importe total de la comanda
         * y lo muestra en pantalla.
         */

        Receipt receipt = new Receipt(order);
        receipt.total();
        receipt.print();

        /**
         * Eugene H. Krabs quiere obtener un margen
         * de beneficio extra y decide ahora cargar
         * por los extras.
         * 
         * Extras
         */

        Extra extra = new ExtraDiscount("cheese");
        Extra sauce = new SauceExtra();
        Extra size = new SizeExtra();

        extra.setNextDiscount(sauce);
        sauce.setNextDiscount(size);

    }

    public static void display(Item item) {
        System.out.print("\t" + item.toString() + "\n");
    }
}
