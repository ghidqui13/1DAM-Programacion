package EquipoFutbol;

/**
 *
 * @author hidal
 */
public class CuerpoTecnico extends Empleado {
    
    //Atributos
        
        private String puesto;
        
    //Constructor
    
        public CuerpoTecnico(String nombre, double sueldo, String puesto) {
            
            super(nombre, sueldo);
            this.puesto = puesto;
        }
        
    //Getters
        
       public String getPusto(){
           
           return this.puesto;
       } 
}
