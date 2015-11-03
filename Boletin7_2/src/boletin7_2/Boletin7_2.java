
package boletin7_2;
import javax.swing.JOptionPane;

public class Boletin7_2 {

    
    public static void main(String[] args) {
        short num1,num2;
        num1=Short.parseShort(JOptionPane.showInputDialog("Introduzca un numero"));
        num2=Short.parseShort(JOptionPane.showInputDialog("Introduzca un numero"));
        JOptionPane.showMessageDialog(null, ComparaShort.comparar(num1, num2));
    }
    
}
