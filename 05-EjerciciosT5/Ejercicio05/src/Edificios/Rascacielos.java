package Edificios;

/**
 *
 * @author hidal
 */
public class Rascacielos extends Edificio {
    
    //Atributos
        private int altura;
        
        
    //Constructore
        public Rascacielos(String direccion, int numeroPlantas, int altura)
        throws IllegalArgumentException{
            super(direccion, numeroPlantas);
            if(altura >= 0){
              this.altura = altura; 
            }else{
              throw new IllegalArgumentException("El numero no es positivo"+
                      " para la altura");  
            }
        }
    
    //Getters
        public int getaltura(){
            return this.altura;
        }
        
        @Override
        public String toString() {
        
            String aux = "";
        
                aux += "La altura es: " +this.getaltura();
                
            
            return aux;
        }
}
