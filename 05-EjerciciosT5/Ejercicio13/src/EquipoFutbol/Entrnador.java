package EquipoFutbol;

/**
 *
 * @author hidal
 */
public class Entrnador extends EmpleadoPrimable {
    
    
    //Constructor
    
        public Entrnador(String nombre, double sueldo) {
            
            super(nombre, sueldo);
        }
       
    //Override
        
        @Override
        public String toString(){
            
            String aux;
            
            aux = "El nombre del empleado es: " +this.getNombre();
            aux += "\nSu sueldo es de: "+this.getSueldo();
            aux += "\nEl dinero que tiene en ele banco es: " +this.getDinero();
            
            return aux;
        }
    
}
