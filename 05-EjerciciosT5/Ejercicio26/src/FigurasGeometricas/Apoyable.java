package FigurasGeometricas;

/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public interface Apoyable extends FiguraGeometrica {
    
    public int getLongitudBase();
    public int getLongituAltura();
    public default boolean esHorizontal(){
        
    return getLongitudBase() > getLongituAltura();
    }
    public default boolean esVertical(){
        
    return getLongituAltura() > getLongitudBase();
    }
}
