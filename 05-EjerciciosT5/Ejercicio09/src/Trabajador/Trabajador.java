package Trabajador;

/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Trabajador {

    //Atributos 
    
        private String dni;
        private String nombre;
        protected int sueldo;
    
    //Contructor
        
        public Trabajador(String nombre,int numDNI, char letraDNI, int sueldo){
            this.dni =Integer.toString(numDNI)+letraDNI;
            this.nombre = nombre;
            this.sueldo = sueldo;
        }
        
    //Getters
        
        public int getSueldo(){ 
           return this.sueldo;
        }
        public String getNombre(){
            return this.nombre;
        }
        public String getDNI(){
            return this.dni;
        }
}
