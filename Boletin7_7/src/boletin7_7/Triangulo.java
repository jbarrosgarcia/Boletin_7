package boletin7_7;

public class Triangulo {
    private double base;
    private double altura;
    public Triangulo(double bas,double alt){
        this.base=bas;
        this.altura=alt;
    }
    public double calcArea(){
        double area=0;
        area=(this.base*this.altura)/2;
        return area;
    }
}
