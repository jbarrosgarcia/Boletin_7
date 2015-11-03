
package boletin7_5;
import javax.swing.JOptionPane;

public class Boletin7_5 {


    public static void main(String[] args) {
    int num1,num2,num3;
    num1=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));
    num2=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));
    num3=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));
    ComparaNumeros comparar1=new ComparaNumeros(num1,num2,num3);
    JOptionPane.showMessageDialog(null,comparar1.indicaMayor());
    }
    
}
