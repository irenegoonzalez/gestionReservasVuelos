/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoreservasvuelos.usuarios;

/**
 *
 * @author administrador
 */
public class Cliente extends Usuario {
    
    
    protected int puntosFidelizacion;
    protected boolean accesoLounge;

    public Cliente (String dni, String nombre, String apellido, String email, String password, int puntosFidelizacion, boolean accesoLounge){
        super (dni, nombre, apellido, email, password);
    this.accesoLounge = accesoLounge;
    this.puntosFidelizacion = puntosFidelizacion;
    }   

    public int getPuntosFidelizacion() {
        return puntosFidelizacion;
    }

    public boolean isAccesoLounge() {
        return accesoLounge;
    }


    public void setPuntosFidelizacion(int puntosFidelizacion) {
        this.puntosFidelizacion = puntosFidelizacion;
    }

    public void setAccesoLounge(boolean accesoLounge) {
        this.accesoLounge = accesoLounge;
    }
    
    public String toString (){
        
        String cadena = "CLIENTE: DNI "+dni+" Nombre: "+nombre + " Password: "+password + " Email: "+email + " Puntos de Fidelizacion: "+puntosFidelizacion + "Acceso Lounge: "+accesoLounge;
        return cadena;
        
    }   
    
    
}
