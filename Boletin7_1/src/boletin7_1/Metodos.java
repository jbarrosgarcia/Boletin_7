
package boletin7_1;

import javax.swing.JOptionPane;


public class Metodos {
     public static int pedirNumeroEnteiro(){
        return (Integer.parseInt(JOptionPane.showInputDialog("Teclea numero")));
    }
    public static String compararPos(int num1){
        String hola="";
        if(num1>=0){
        
         hola="Es Positivo "+num1;
        }
        return hola;
    }
}
