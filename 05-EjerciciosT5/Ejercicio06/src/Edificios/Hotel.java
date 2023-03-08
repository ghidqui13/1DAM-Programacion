package Edificios;

import java.util.ArrayList;

/**
 *
 * @author hidal
 */
public class Hotel extends Edificio{
    
    //Atributos
    
        private ArrayList<String>clientes;
        private int maximo;
    
        
    //Constructore
        public Hotel(String direccion, int numeroPlantas, int maximo) 
            throws IllegalArgumentException {
            super(direccion, numeroPlantas);
            this.maximo = maximo;
            this.clientes = new ArrayList<String>();
        }
    
    //Setters
        public void añadirCliente(String cliente){
            this.clientes.add(cliente);
        }
        public void retirarCliente(String cliente){
            this.clientes.remove(cliente);
        }
    
}
