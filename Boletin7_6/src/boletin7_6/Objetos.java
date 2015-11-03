
package boletin7_6;

public class Objetos {
    private String nombre;
    private int numVentas;
    public Objetos(String nomObj,int numV){
        this.nombre=nomObj;
        this.numVentas=numV;
    }
    public int getNumVentas(){
        return this.numVentas;
    }
    public String getNomObe(){
        return this.nombre;
    }
    
}
