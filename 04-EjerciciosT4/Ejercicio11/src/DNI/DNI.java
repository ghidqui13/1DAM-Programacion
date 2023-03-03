package DNI;

/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class DNI {
    private int numero;
    private char letra;
    
    
    public DNI(int n, char l){
        numero = n;
        letra = l;
        
    };
    public DNI( String dni){
        
        numero = Integer.parseInt(dni.substring(0,8));
        
        letra = dni.charAt(8);
        
    };
    public int getnumero(){
        return numero;
    };
    public char getletra(){
        return letra;
    };
  ;
}
