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
        
    }
    public DNI( String dni){
        
        
        dni.substring(0,7);
        dni.charAt(dni.length()-1);
        
    }
    public int getnumero(){
        return numero;
    }
    public char getletra(){
        return letra;
    }

}
