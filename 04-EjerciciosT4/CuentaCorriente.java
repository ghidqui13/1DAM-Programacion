package CuentaCorriente;
import java.util.Random;
/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class CuentaCorriente {
    private int numero;
    private double saldo;
    
    public CuentaCorriente(){
        
        Random aleatorio = new Random(); 
        int N= 0;
        N = aleatorio.nextInt(0,1001);
        numero = N;
        saldo = 0;
    }
    public CuentaCorriente(int num){
        numero = num;
        saldo = 0;
    }
    public CuentaCorriente(int num , double sald){
        numero = num;
        saldo = sald;
    }
    public void AñadirDinero(int cantidad){
        this.saldo = (cantidad + saldo);
       
    }
    public void RetirarDinero(int cantidad){
        this.saldo = (saldo  - cantidad);
       
    }
     @Override
    public String toString(){
        
        String aux = "El numero es " +numero+ " y el saldo es "
                +saldo;
        
        return aux;
    }
}
