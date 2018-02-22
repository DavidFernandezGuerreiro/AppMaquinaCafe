
package aplicacionmaquinacafe;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * En esta clase se encuentran los botones de la máquina de café, seleccionar bebida y seleccionar azucar.
 * @author dfernandezguerreiro
 */
public class Botones {
    /**
     * Seleccionar bebida deseada.
     * @param listaProductos Lista donde guarda los productos y sus precios.
     * @return 
     */
    public static int seleccionarBebida(ArrayList<Producto>listaProductos){
        boolean opc=true;
        int op=1;
        while(opc==true){
            op=Integer.parseInt(JOptionPane.showInputDialog("***** MENÚ *****"
                    + "\n0.-Salir de la aplicación."
                    + "\n1.-Café."
                    + "\n2.-Chocolate."
                    + "\n3.-Té."));
            switch(op){
                case 0:
                    opc=false;
                    break;
                case 1:
                    //Me paso el metodo mostrarDinero por la clase.
                    Display.mostrarProducto(listaProductos.get(op-1).getNombre()); //<- Es op-1 por que con el 0 salgo del switch.
                    Display.mostrarDinero(listaProductos.get(op-1).getPrecio());
                    opc=false;
                    break;
                case 2:
                    Display.mostrarProducto(listaProductos.get(op-1).getNombre());
                    Display.mostrarDinero(listaProductos.get(op-1).getPrecio());
                    opc=false;
                    break;
                case 3:
                    Display.mostrarProducto(listaProductos.get(op-1).getNombre());
                    Display.mostrarDinero(listaProductos.get(op-1).getPrecio());
                    opc=false;
                    break;
                default:
                    System.out.println("*** OPCIÓN INCORRECTA ***");
            }
        }
        return op;
    }
    
    /**
     * Seleccionar la cantidad de azucar deseada.
     */
    public static void anhadirAzucar(){
        String[]opciones={"|", "||", "|||", "||||"};
        int seleccion=JOptionPane.showOptionDialog(null, "Seleccionar cantidad de azucar:", "AZUCAR", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
        Display.mostrarAzucar(seleccion);
    }
}
