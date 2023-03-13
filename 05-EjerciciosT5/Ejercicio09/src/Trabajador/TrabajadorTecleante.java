package Trabajador;

/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class TrabajadorTecleante extends Trabajador implements Teclado{
    
    //Atributos
        
        public int pulsacionesMinuto;
        protected Teclado teclado;

        
    //Constructor
        
        public TrabajadorTecleante(String nombre, int numDNI, char letraDNI, 
                int sueldo, int pulsacionesMinuto,Teclado teclado) {
            super(nombre, numDNI, letraDNI, sueldo);
            this.pulsacionesMinuto = pulsacionesMinuto;
            this.teclado = teclado;
        }
    
    //Getters
        
        public Teclado getTeclado(){
            return this.teclado;
        }
        public int getPulsacionesMinuto(){
            return this.pulsacionesMinuto;
        }
        
    //Setters
        
        public void setTecaldo(Teclado teclado){
            this.teclado = teclado;
        }
    
    //Implements
        
        @Override
        public void escribirTexto(String mensaje) {
            
        }

}
