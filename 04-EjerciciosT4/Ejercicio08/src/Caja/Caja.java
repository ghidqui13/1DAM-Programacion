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
    }
    public Caja(String m){
        mensaje = m;
        abierto  = false;
    }
    public Caja(boolean a, String m){
        mensaje = m;
        abierto  = a;
    }
 public void setMensaje(String M){
        if (abierto = true){
            mensaje = M;
        }
    }
    public void pasarMayusculas(){
        this.mensaje = mensaje.toUpperCase();
    }
     @Override
    public String toString(){
        
        String aux = "La caja tirnr el estado " +abierto+ 
                " y tiene el mensaje " +mensaje;
  
        return aux;
    }
}
