

package boletin7_3;
import javax.swing.JOptionPane;

public class Boletin7_3 {


    public static void main(String[] args) {
    int num1;
    num1=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));
    JOptionPane.showMessageDialog(null, ComparaInt.comparar(num1));
    }
    
}
