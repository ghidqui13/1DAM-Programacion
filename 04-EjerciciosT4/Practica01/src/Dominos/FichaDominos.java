package Dominos;

/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class FichaDominos {
    private int ladoI;
    private int ladoD;
    private boolean encaja;
    
    public FichaDominos(int i, int d){
        ladoI=i;
        ladoD=d;
    }
    public String voltea(){
      String aux = "["+ladoD+","+ladoI+"]";
        
        return aux;

    }
    public boolean encajar(){
        if (ladoI == ladoD ||ladoD == ladoI ){
            encaja= true;
        }else{
            encaja= false;
        }
        return encaja;
    }
    @Override
    public String toString(){
        String aux;
        
        aux = "["+ladoI+","+ladoD+"]";
        
        return aux;
    }
  
}
