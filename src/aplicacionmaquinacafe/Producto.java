
package aplicacionmaquinacafe;
import aplicacionmaquinacafe.*;

import java.util.ArrayList;

/**
 * Esta clase contiene parámetros, getters, setters y toString.
 * @author dfernandezguerreiro
 */
public class Producto {
    private String nombre;
    private float precio;
    private static int azucar;
    
    public Producto() {
    }

    public Producto(String nombre, float precio) {
        this.nombre=nombre;
        this.precio=precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio=precio;
    }

    public static int getAzucar() {
        return azucar;
    }

    public static void setAzucar(int azucar) {
        Producto.azucar=azucar;
    }

    @Override
    public String toString() {
        return "Nombre: "+nombre+", precio: "+precio;
    }
    
    
}
