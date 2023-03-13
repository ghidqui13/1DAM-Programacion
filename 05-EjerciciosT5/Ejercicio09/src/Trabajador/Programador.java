package Trabajador;

import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Programador extends TrabajadorTecleante {
    
    //Atributos
        
        private Map<String,String>lenguajes;
        

    //Constructor
        
        public Programador(String nombre, int numDNI, char letraDNI, int sueldo, 
            int pulsacionesMinuto, Teclado teclado) {
            super(nombre, numDNI, letraDNI, sueldo, pulsacionesMinuto, teclado);
            this.lenguajes = new HashMap<>();
        }
    
        public void aprenderLenguaje(String lenguaje, String holaMundo){
            
            this.lenguajes.put(lenguaje,holaMundo);
        }
        
        public String programarHolaMundo(String lenguaje)throws 
               IllegalStateException{
            if(this.lenguajes.containsKey(lenguaje)){
                return this.lenguajes.get(lenguaje);
            }else{
                throw new IllegalStateException ("No es valido el lenguaje"); 
            }
        }
}
