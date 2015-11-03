

package boletin7_3;


public class ComparaInt {
    
    public static String comparar(int num1){
    String numero="";
    if(num1>0){
    numero="+";
    }else{
        if (num1<0){
            numero="-";
        }else{
            numero="0";
        }
    }
    return numero;
    }
}
