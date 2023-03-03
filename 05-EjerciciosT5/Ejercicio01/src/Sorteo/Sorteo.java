package Sorteo;
/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Sorteo {
    
    //Atributos no encapsulados
    
    public double dineroCupon;
    public int pagosRealizados;
    public int pagosPedientes;
    public int totalTarticipantes;
    public double dineroRecogido;
    
    //Metodos
    
    public Sorteo(double dineroCupon, int totalPersona){
        this.dineroCupon = dineroCupon;
        this.totalTarticipantes = totalPersona;
    }
    
    public void registrarPago(){
        this.pagosRealizados++;
    }
    public void apuntarNuevoParticipante(){
        this.totalTarticipantes++;
    }
    
    @Override
    public String toString(){
        
        String aux;
        
        aux = "EL precio del cupon es: "+this.dineroCupon+
                ", los pagos realizados son: "+this.pagosRealizados+
                ", los pagos pendientes son: "+this.pagosPedientes+
                ", el total de participantes son: "+this.totalTarticipantes+
                 " y el dinero recogido es: "+this.dineroRecogido;
        
        return aux;
    }
}
