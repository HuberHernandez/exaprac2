
package huberhernandez;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * Nombre de la clase: HuberHernandez
 * Fecha: 16-04-2018
 * Version: 1.0
 * CopyRight: Huber Hernandez
 * @author Huber Hernandez
 */
public class HuberHernandez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menu;
        int n;
        int opcion = 0;
        double total = 0,pago = 0, totales = 0;

        DecimalFormat df = new DecimalFormat("##.##");
        
        menu = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la siguiente opcion a realizar \n "
                + "1)Agregar Compra  "
                + "2) Calcular total  "
                + "3)Salir  "));
        String valorNombres = "";
        int valorCantidad = 0;
        double valorPrecio = 0;
        double acu =0;
            
        if(menu == 1){

            n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de Compras a registrar: "));
            String nombre[] = new String[n];
            int cantidad[] = new int[n];
            double precio[] = new double[n];
            
            for(int i=0;i<n;i++){
                nombre[i] = JOptionPane.showInputDialog("Ingrese el nombre del producto "+ (i+1)+ " : \n");
                valorNombres = valorNombres + nombre[i]+"\n";
                cantidad[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad del producto:  "+ (i+1)+ " :"));
                valorCantidad = valorCantidad + cantidad[i];
                precio[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto: "+ (i+1) + " :"));
                valorPrecio = valorPrecio + precio[i];
                
                totales = cantidad[i]*precio[i];
                acu = acu + totales;
            }
             opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la siguiente opcion a realizar \n "
                + "1)Agregar Compra  "
                + "2) Calcular total  "
                + "3)Salir  "));
            
        }else if(menu == 2){
            JOptionPane.showMessageDialog(null, "Importante: \n"+ "No puede ver productos si no ha registrado nada xD","Notificacion",3);
        }
        if(opcion == 2){
            total = acu * 0.13;
            pago = acu + total;
            JOptionPane.showMessageDialog(null, "Datos de Compra:"+
                        "\n Nombres de Productos: \n"+valorNombres + 
                        "\n Cantidad total de productos: \n"+valorCantidad+
                        "\n Valor total de los productos: \n"+ "$"+df.format(valorPrecio) +
                        "\n El total a pagar con iva es: "+ "$"+df.format(pago),"Registro Compras",1);
        }else{
            JOptionPane.showMessageDialog(null, "Importante: \n"+ "No puede ver productos si no ha registrado nada xD","Notificacion",3);
        }
        
        
    }
    
}
