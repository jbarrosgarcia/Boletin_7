package boletin7_4;

public class ComparaPersona {
    public static String comparaPer(Persona per1,Persona per2){
        String masPeso="";
            if(per1.getPeso()>per2.getPeso()){
                masPeso=per1.getNombre()+" pesa "+per1.getPeso()+" la diferencia de peso entre ambos es "+(per1.getPeso()-per2.getPeso());
            }else{
                masPeso=per2.getNombre()+" pesa "+per2.getPeso()+" la diferencia de peso entre ambos es "+(per2.getPeso()-per1.getPeso());
            }
        
        return masPeso;
    }
}
