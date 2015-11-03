package boletin7_4;
import javax.swing.JOptionPane;
public class Boletin7_4 {

    public static void main(String[] args) {
    String nombre="";
    float peso=0f;
   
    nombre=JOptionPane.showInputDialog("Introduzca nombre");
    peso=Float.parseFloat(JOptionPane.showInputDialog("Introduzca peso"));
    Persona per1=new Persona(nombre,peso);
    nombre=JOptionPane.showInputDialog("Introduzca nombre");
    peso=Float.parseFloat(JOptionPane.showInputDialog("Introduzca peso"));
    Persona per2=new Persona(nombre,peso);
    JOptionPane.showMessageDialog(null ,ComparaPersona.comparaPer(per1, per2));
    }
    
}
