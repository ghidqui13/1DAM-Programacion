package ejercicio02;
import Compras.Compras;

/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio02 {

    
    public static void main(String[] args){
        
        Compras pre = new Compras(400.12);
        
        try {
            pre.reguistrarCompra(200.1);
            pre.reguistrarCompra(145.21);
            pre.reguistrarCompra(50.21);
            pre.reguistrarCompra(200.1);
 
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        System.out.println(pre.getPrecio());
    }
}
