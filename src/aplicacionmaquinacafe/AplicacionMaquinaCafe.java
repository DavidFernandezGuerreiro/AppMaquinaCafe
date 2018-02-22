
package aplicacionmaquinacafe;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Programa de una máquina de café. Contiene las opciones seleccionar bebida, introducir dinero y seleccionar cantidad de azucar.
 * @author dfernandezguerreiro
 */
public class AplicacionMaquinaCafe {

    /**
     * En la clase principal, se encuentra un ArrayList de Productos, donde se encuentran las bebidas y sus precios.
     * Otro ArrayList, en este caso de Monedero.
     * Y finalmente un Switch, en el que se muestra el menú.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Producto>listaProductos=new ArrayList<>();
        listaProductos.add(new Producto("Café",0.50F));
        listaProductos.add(new Producto("Chocolate",0.60F));
        listaProductos.add(new Producto("Té",0.70F));
        
        ArrayList<Monedero>listaMonedero=new ArrayList<>();
  
        boolean opc=true;
        while(opc==true){
            int op=Integer.parseInt(JOptionPane.showInputDialog("***** MENÚ *****"
                    + "\n0.-Salir de la aplicación."
                    + "\n1.-Ver precio de los productos."
                    + "\n2.-Introducir dinero."));
            switch(op){
                case 0:
                    opc=false;
                    break;
                case 1:
                    Botones.seleccionarBebida(listaProductos);
                    break;
                case 2:
                    Monedero.introducirDinero(listaMonedero);
                    Display.mostrarCredito(listaMonedero.get(0).getCredito());
                    Botones.anhadirAzucar();
                    int opBebida=Botones.seleccionarBebida(listaProductos);
                    Elaboracion.ponerVaso();
                    Elaboracion.elaborarBebida(opBebida,listaProductos);
                    Display.mostrarCambio(opBebida, listaMonedero, listaProductos);
                    break;
                default:
                    System.out.println("*** OPCIÓN INCORRECTA ***");
            }
        }

        
    }
    
}
