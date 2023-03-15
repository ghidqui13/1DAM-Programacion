package EquipoFutbol;

/**
 *
 * @author hidal
 */
public class Futbolista extends EmpleadoPrimable{
    
    //Atributo 
    
        private int dorsal;
        
    //Constructor

        public Futbolista(String nombre, double sueldo, int dorsal) {
            
            super(nombre, sueldo);
            this.dorsal = dorsal;
        }
        
        
}
