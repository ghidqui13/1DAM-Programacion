package Caja;

/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Caja {
    private boolean abierto;
    private String mensaje;
    
    public Caja(){
        abierto = false;
        mensaje = "Viva el tema 7";
    };
    public Caja(String m){
        mensaje = m;
        abierto  = false;
    };
    public Caja(boolean a, String m){
        mensaje = m;
        abierto  = a;
    };
 
}
