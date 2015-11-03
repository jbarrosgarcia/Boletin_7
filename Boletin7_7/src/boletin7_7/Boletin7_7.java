
package boletin7_7;
import javax.swing.JOptionPane;

public class Boletin7_7 {


    public static void main(String[] args) {
        int numOp=0;
        numOp=Integer.parseInt(JOptionPane.showInputDialog("Para Calcular el area del ciruculo intruduzca el numero 1\nPara calcular el area del cuadrado introduzca el numero 2\nPara calcular el area del triangulo introduzca el numero 3"));
        switch(numOp){
            case 1:
                double radio=Double.parseDouble(JOptionPane.showInputDialog("Introduzca el radio"));
                Circulo circ1=new Circulo(radio);
                JOptionPane.showMessageDialog(null, "El area es "+circ1.calcularArea());
                break;
            case 2:
                double lado=Double.parseDouble(JOptionPane.showInputDialog("Introduzca el lado"));
                Cuadrado cuadrado1=new Cuadrado(lado);
                JOptionPane.showMessageDialog(null, "El area es "+cuadrado1.calcArea());
                break; 
            case 3:
                double base=Double.parseDouble(JOptionPane.showInputDialog("Introduzca la base"));
                double altura=Double.parseDouble(JOptionPane.showInputDialog("Introduzca la altura"));
                Triangulo triangulo1=new Triangulo(base,altura);
                JOptionPane.showMessageDialog(null, "El area es "+triangulo1.calcArea());
                break;     
            
        
        }
    }
    
}
