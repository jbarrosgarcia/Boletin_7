
package boletin7_7;

public class Circulo {
    private double radio;
    public Circulo (double rad){
        this.radio=rad;
    }
    public double calcularArea(){
    double area=0;
    area=Math.pow(this.radio,2)*Math.PI;
   return area;
    }
    
}
