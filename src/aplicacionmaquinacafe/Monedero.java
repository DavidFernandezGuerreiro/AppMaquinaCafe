
package aplicacionmaquinacafe;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Esta clase contiene parámetros, getters, setters, toString y los métodos introducir cambio y delvolver cambio.
 * @author dfernandezguerreiro
 */
public class Monedero {
    private float credito;
    private float cambio;

    public Monedero() {
    }

    public Monedero(float credito, float cambio) {
        this.credito=credito;
        this.cambio=cambio;
    }

    public float getCredito() {
        return credito;
    }

    public void setCredito(float credito) {
        this.credito=credito;
    }

    public float getCambio() {
        return cambio;
    }

    public void setCambio(float cambio) {
        this.cambio=cambio;
    }

    @Override
    public String toString() {
        return "Credito: "+credito+", cambio: "+cambio;
    }
    
    /**
     * Muestra el precio del producto.
     * @param op Parametro que indica la posicion de la bebida que seleccioné del Switch.
     * @param listaProducto Lista donde guarda los productos y sus productos.
     * @return 
     */
    public float devolverDinero(int op, ArrayList<Monedero>listaProducto){
       return cambio;
    }
    
    /**
     * Recoje el dinero introducido por el cliente.
     * @param listaMonedero Lista donde se guardan los paramentros de credito y cambio.
     */
    public static void introducirDinero(ArrayList<Monedero>listaMonedero){
        Monedero obxM=new Monedero();
        obxM.setCredito(Float.parseFloat(JOptionPane.showInputDialog("Introduzca dinero...")));
        listaMonedero.add(obxM);
    }

}
