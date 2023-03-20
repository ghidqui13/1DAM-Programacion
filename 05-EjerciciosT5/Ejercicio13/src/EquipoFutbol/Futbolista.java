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
    //Getters
        
        public int getDorsal(){
            
            return this.dorsal;
        }
        
        
    //Override
        
        @Override
        public String toString(){
            
            String aux;
            
            aux = "El nombre del empleado es: " +this.getNombre();
            aux += "\nSu sueldo es de: "+this.getSueldo();
            aux += "\nEl dinero que tiene en ele banco es: " +this.getDinero();
            aux += "\nSu dorsal es: "+getDorsal();
            return aux;
        }
}
