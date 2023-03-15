package EquipoFutbol;
/**
 *
 * @author hidal
 */
public class Empleado {
    //Atributos
    
        private String nombre;
        private double sueldo;
        private double dinero;
        
    //Constructor
        
        public Empleado(String nombre, double sueldo){
          
            this.nombre = nombre;
            this.sueldo = sueldo;
        }
        
    //Metodos
        
        public void cobrar(double cantidad)throws CabreoException{
            
            if(cantidad >= this.sueldo){
                this.dinero += cantidad;
            }else{
                throw new CabreoException("No ha cobrado un sueldo "
                        + "suficiente se le tiene que pagar mas");  
            }
        }
        
    //Getters
        
        public double getSueldo(){
            
            return this.sueldo;
        }
        public double getDinero(){
            
            return this.dinero;
        }
        
    //Overrides
        
        @Override
        public String toString(){
            
            String aux;
            
            aux = "El nombre del empleado es: " +this.nombre;
            aux += "\nSu sueldo es de: "+this.getSueldo();
            aux += "\nEl dinero que tiene en ele banco es: " +this.getDinero();
            
            return aux;
        }
}
