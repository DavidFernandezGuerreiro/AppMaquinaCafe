
package aplicacionmaquinacafe;
import aplicacionmaquinacafe.*;
import java.util.ArrayList;
/**
 * Muestra las salidas por pantalla de la máquina de café.
 * @author dfernandezguerreiro
 */
public class Display {
    /**
     * Muestra el precio del producto.
     * @param precio Muestra el precio del producto.
     */
    public static void mostrarDinero(float precio){
        System.out.println("Precio: "+precio);
    }
    
    /**
     * Muestra la cantidad de azucar añadido.
     * @param cant Muestra la cantidad de azucar añadido.
     */
    public static void mostrarAzucar(int cant){
        System.out.println("Cantidad de azucar... "+cant);
    }
    
    /**
     * Muestra el nombre del producto.
     * @param nombre Muestra el nombre del producto.
     */
    public static void mostrarProducto(String nombre){
        System.out.print("\nBebida: "+nombre+", ");
    }
    
    /**
     * Muestra el precio del producto seleccionado.
     * @param credito Muestra el precio del producto seleccionado.
     */
    public static void mostrarCredito(float credito){
        System.out.print("Dinero introducido: "+credito);
    }
    
    /**
     * Muestra el cambio del cliente.
     * @param op Parametro que indica la posicion de la bebida que seleccioné del Switch.
     * @param listaMonedero Lista donde se guardan los paramentros de credito y cambio.
     * @param listaProductos Lista donde se guardan las bebidas y sus precios.
     */
    public static void mostrarCambio(int op,ArrayList<Monedero>listaMonedero,ArrayList<Producto>listaProductos){
        System.out.println("Su cambio... "+(listaMonedero.get(0).getCredito()-listaProductos.get(op-1).getPrecio()));
    }
}
