
package boletin7_6;
import javax.swing.JOptionPane;
public class Boletin7_6 {

    public static void main(String[] args) {
           String nombre;
           int numV;
           nombre=JOptionPane.showInputDialog("Introduzca el nombre del objeto");
           numV=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de ventas"));
           Objetos obj1=new Objetos(nombre,numV);
           JOptionPane.showMessageDialog(null,TablaVent.tablaVent(obj1));
    }
    
}
