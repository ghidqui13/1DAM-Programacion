package Edificios;

/**
 *
 * @author hidal
 */
public class Edificio {
    
    //Atributos
       private String direccion;
       private int numeroPlantas;
       
    //Constructore
       
       public Edificio(String direccion, int numeroPlantas)
               throws IllegalArgumentException{
           
            this.direccion = direccion;
            
            if(numeroPlantas >= 0){
              this.numeroPlantas = numeroPlantas; 
            }else{
              throw new IllegalArgumentException("El numero no es positivo"+
                      " para el numero de plantas");  
            }
       }
    
   //Getters
       
       public String getDireccion(){
           return this.direccion;
       }
       public int getnumeroPlantas(){
           return this.numeroPlantas;
       }
       @Override
        public String toString() {
        
            String aux = "";
        
                aux += "La direccio es: " +this.getDireccion();
                aux += "\nEl numero de planta es: " +this.getnumeroPlantas();
            
            return aux;
        }
}
