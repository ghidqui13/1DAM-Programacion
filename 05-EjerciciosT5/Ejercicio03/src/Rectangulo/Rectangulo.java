package Rectangulo;

/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Rectangulo {

    private int base;
    private int altura;
    protected int area;
    
    //constructores
    
    public Rectangulo(int base, int altura){
        this.altura = altura;
        this.base = base;
    }
    
    //geters
    
    public int getAltura(){
        return this.altura;
    }
    public int getBase(){
        return this.base;
    }
    public int getArea(){
        
        this.area = this.altura * this.base;
        
        return this.area;
    }
    
    //seters
    
    public void setBase(int base){
         this.base = base;
    }
    public void setAltura(int altura){
         this.altura = altura;
    }
}
