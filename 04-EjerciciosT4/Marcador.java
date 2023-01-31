package MarcadorBaloncesto;

import java.time.LocalDate;

/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Marcador {
    private String nombreLocal;
    private String nombreVisitante;
    private int puntosLocal;
    private int puntosVisitante;
    private LocalDate fecha;
    
    public  Marcador(String nL,String nV){
        nombreLocal = nL;
        nombreVisitante = nV;
    }
    public Marcador(String nL,String nV, LocalDate f){
        nombreLocal = nL;
        nombreVisitante = nV;
        fecha = f;
    }
    public Marcador(String nL,int pL, String nV, int pV, LocalDate f ){
        nombreLocal = nL;
        nombreVisitante = nV;
        puntosLocal = pL;
        puntosVisitante = pV;
        fecha = f;
    }
    @Override
    public String toString(){
        
        String aux;
        
        aux = "El patido de "+nombreLocal+" contra "+nombreVisitante+
             " tiene el marcador "+puntosLocal+ " contra " +puntosVisitante+ 
                " con fecha " +fecha;
        return aux;
        
    }
    
}
