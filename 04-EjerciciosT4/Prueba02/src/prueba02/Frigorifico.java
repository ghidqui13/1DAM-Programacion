package prueba02;

/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Frigorifico {
    private String marca;
    private int grados;
    private String alimentos;
    
    private static int alimentacion = 0;
    
    
    public Frigorifico(){
        
    }
    public Frigorifico(int grados , String marca){
        this.marca = marca;
        this.grados = grados;
    }
    public void setGrados(int grados){
        this.grados = grados;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setAlimento(String alimento){
        this.alimentos = alimento;
        
        Frigorifico.alimentacion++;
    }
    public String getAlimento(){
        String aux;
        aux = alimentos;
        aux+= " y el numero de alimentos es " +Frigorifico.alimentacion;
        return aux;
        
    }
    public String getMarca(){
      
        return this.marca;
        
    }
    public int getGrados(){
        return this.grados;
    }
    public void sacarAlimentos(){
         
        Frigorifico.alimentacion--;
    }
    
    @Override
    public String toString(){
        String aux;
        aux = "El frigorif" 
    }
}
