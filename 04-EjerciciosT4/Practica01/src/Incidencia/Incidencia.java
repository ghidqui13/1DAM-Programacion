package Incidencia;

/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Incidencia {
    private int codigo;
    private String incidencia;
    private int puesto;
    private String estado;
    
    public Incidencia(int p, String i){
        codigo = 0;
        codigo++;
        puesto = p;
        incidencia = i;
        estado = "Pendiente";
    }
    public String Resuelve(String r){
        estado = "Resuelta";
        String aux = estado +  r;
        return aux;
    }
    public int  getPendientes(){
        int contador = 0;
        if (estado.equals("Pendiente")){
            contador++; 
        }
        return contador;
    }
    @Override
    public String toString(){
        String aux;
        
        aux = "Incidencia "+codigo+ " - Puesto: "+puesto+
                " - " +incidencia+ " - " +estado+ " - "
                ;
        
        return aux;
    }
}
