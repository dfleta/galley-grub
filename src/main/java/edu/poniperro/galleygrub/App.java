package edu.poniperro.galleygrub;

import edu.poniperro.galleygrub.extras.CheeseExtra;
import edu.poniperro.galleygrub.extras.Extra;
import edu.poniperro.galleygrub.extras.Regular;
import edu.poniperro.galleygrub.extras.SauceExtra;
import edu.poniperro.galleygrub.extras.SizeLargeExtra;
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
         * Seafoam Soda
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
        Item soda = new Item("Seafoam Soda", 1.00);
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
        order.addItem("Seafoam Soda", 1.00);

        order.display();

        /**
         * Squidward Tentacles genera el recibo,
         * la app calcula el importe total de la comanda
         * y lo muestra en pantalla.
         */

        Receipt receipt = new Receipt(order);
        receipt.total();
        receipt.print();

        /**
         * Eugene H. Krabs quiere obtener un margen
         * de beneficio extra y decide cargar
         * por los extras.
         * 
         * Adapta el tipo Item para incluir los extras.
         * 
         * Refactoriza el toString() de Item
         * para mostrar el ingrediente extra.
         * 
         * NO ACTUALICES EL PRECIO DEL ITEM
         * con el cargo extra.
         */

        System.out.print("\n\t --- GALLEY GRUB ---  \n");

        patty = new Item("Krabby Patty", 1.25, "cheese");
        display(patty);

        bits = new Item("Coral Bits", 1.00, "medium");
        display(bits);
        rings = new Item("Kelp Rings", 1.50, "sauce");
        display(rings);
        loaf = new Item("Golden Loaf", 2.00, "sauce");
        display(loaf);
        soda = new Item("Seafoam Soda", 1.00, "small");
        display(soda);

        /**
         * Buble Fish sigue zampando
         * y realiza una comanda cargada
         * de extras.
         */

        order = new Order();

        order.addItem("Krabby Patty", 1.25, "cheese");
        order.addItem("Coral Bits", 1.00, "medium");
        order.addItem("Kelp Rings", 1.50, "sauce");
        order.addItem("Golden Loaf", 2.00, "sauce");
        order.addItem("Seafoam Soda", 1.00, "large");
        order.addItem("Coral Bits", 1.00, "large");

        order.display();

        /**
         * Define el importe a cargar por cada extra.
         * 
         * Configura los tipos de Extras:
         *  - extra Cheese +0.25
         *  - extra sauce +0.50
         *  - size medium +0.25
         *  - size large +0.50
         */

        Extra regular = new Regular();
        Extra cheese = new CheeseExtra();
        Extra sauce = new SauceExtra();
        Extra size = new SizeLargeExtra();

        regular.setNextExtra(cheese);
        cheese.setNextExtra(sauce);
        sauce.setNextExtra(size);

        /**
         * Squidward Tentacles genera el recibo,
         * la app calcula el importe total de la comanda
         * y lo muestra en pantalla.
         */

        Receipt receiptExtra = new Receipt(order);
        receiptExtra.setChain(regular);

        receiptExtra.total();
        receiptExtra.print();
    }

    public static void display(Item item) {
        System.out.print("\t" + item.toString() + "\n");
    }
}
