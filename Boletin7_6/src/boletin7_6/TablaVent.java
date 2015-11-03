
package boletin7_6;

public class TablaVent {
    public static String tablaVent(Objetos obj1){
        String tipo="";
        if(obj1.getNumVentas()<=100){
            tipo="Es un objeto de consumo bajo";
        }else{
            if(obj1.getNumVentas()>100 && obj1.getNumVentas()<=500){
            tipo="Es un objeto de consumo medio";
        }else{
            if(obj1.getNumVentas()>500 && obj1.getNumVentas()<=1000){
            tipo="Es un objeto de consumo alto";
        }else{
               if(obj1.getNumVentas()>1000){
            tipo="Es un objeto de primera necesidad";
        }
            }
        }
        }
        return tipo;
    }
}
