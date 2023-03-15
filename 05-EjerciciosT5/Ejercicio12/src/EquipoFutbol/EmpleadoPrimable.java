package EquipoFutbol;

/**
 *
 * @author hidal
 */
public class EmpleadoPrimable extends Empleado{
    
    //Atributos
        
        private boolean primado;
        
    //Costructor

        public EmpleadoPrimable(String nombre, double sueldo) {
            super(nombre, sueldo);
        }
        
    //Metodos
        
        public void primar(){
            
            this.primado = true;
        }
        
    //Getters
        
        public boolean getPrimado(){
            
            return this.primado;
        }
        
    //Override
        
        @Override
        public String toString(){
            
            String aux;
            
            aux = "El nombre del empleado es: " +this.getNombre();
            aux += "\nSu sueldo es de: "+this.getSueldo();
            aux += "\nEl dinero que tiene en ele banco es: " +this.getDinero();
         
            if(this.getPrimado() == true){
                aux+= "\nEsta primado";
            }else{
                aux+= "\nNo esta primado";
            }
            return aux;
        }
}
