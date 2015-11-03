
package boletin7_2;

public class ComparaShort {
    public static String comparar(short num1,short num2){
        String suma="";
        String resta="";
        if(num1>=num2){
            resta=num1+" - "+num2+" = "+(num1-num2);
        }
            suma=resta+"\n"+num1+" + "+num2+" = "+(num1+num2);
        
        return suma;
    }
}
