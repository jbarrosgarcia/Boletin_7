
package boletin7_5;

public class ComparaNumeros {
   private int numero1;
   private int numero2;
   private int numero3;
    public ComparaNumeros(int num1,int num2, int num3){
        this.numero1=num1;
        this.numero2=num2;
        this.numero3=num3;
    }
    public String indicaMayor(){
    String mayor="";
        if(this.numero1>this.numero2&&this.numero1>this.numero3){
            mayor="El mayor es "+this.numero1;
    }else{
        if(this.numero2>this.numero1&&this.numero2>this.numero3){
            mayor="El mayor es "+this.numero2;
        }else{if(this.numero3>this.numero1&&this.numero3>this.numero2){
            mayor="El mayor es "+this.numero3;
        }
    }
        }
    return mayor;
    }
}
