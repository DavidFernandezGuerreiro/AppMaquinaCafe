
package aplicacionmaquinacafe;

import java.util.ArrayList;

/**
 * Muestra la elaboración del producto.
 * @author dfernandezguerreiro
 */
public class Elaboracion {
    
    /**
     * Muestra la bebida que se está elaborando en ese instante.
     * @param op Parametro que indica la posicion de la bebida que seleccioné del Switch.
     * @param listaProductos Lista donde se guardan las bebidas y sus precios.
     */
    public static void elaborarBebida(int op,ArrayList<Producto>listaProductos){
        System.out.println("Elaborando... "+listaProductos.get(op-1).getNombre());    
    }
    
    /**
     * Muestra un paso importante en la elaboración del producto.
     */
    public static void ponerVaso(){
        System.out.println("Poniendo vaso...");
    }
    
}
