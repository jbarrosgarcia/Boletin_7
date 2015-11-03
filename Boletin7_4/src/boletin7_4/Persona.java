package boletin7_4;


public class Persona {
    private String nombre;
    private float peso;
    public Persona(String nom,float pes){
        this.nombre=nom;
        this.peso=pes;
    }
    public float getPeso(){
        return this.peso;
    }
    public String getNombre(){
        return this.nombre;
    }
}
