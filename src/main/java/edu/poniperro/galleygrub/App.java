package edu.poniperro.galleygrub;

import edu.poniperro.galleygrub.Items.Item;

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
         * Crea los items y printa sus datos.
         * 
         * Krabby Patty
         * Coral Bits
         * Kelp Rings
         * Golden Loaf
         * Seafom Soda
         */

        Item item = new Item("Krabby Patty", 1.25);
        display(item);
        item = new Item("Coral Bits", 1.00);
        display(item);
        item = new Item("Kelp Rings", 1.50);
        display(item);
        item = new Item("Golden Loaf", 2.00);
        display(item);
        item = new Item("Seafom Soda", 1.00);
        display(item);



    }

    public static void display(Item item) {
        System.out.print("\t" + item.toString() + "\n");
    }
}
