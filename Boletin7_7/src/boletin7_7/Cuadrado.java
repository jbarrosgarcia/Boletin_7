package boletin7_7;

public class Cuadrado {
    private double lado;
    public Cuadrado(double lad){
        this.lado=lad;
    }
    public double calcArea(){
        double area=0;
        area=this.lado*this.lado;
        return area;
    }
}
