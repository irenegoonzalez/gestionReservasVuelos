/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoreservasvuelos.usuarios;

/**
 *
 * @author administrador
 */
public class ClienteVIP extends Cliente {
    
    private String regaloBienvenida;
    
    
    public ClienteVIP (String dni, String nombre, String apellido, String email, String password, int puntosFidelizacion, boolean accesoLounge){
        super (dni, nombre, apellido, email, password, puntosFidelizacion, accesoLounge);
        
        this.regaloBienvenida = regaloBienvenida;
        
    }
    
     public String toString (){
        
        String cadena = "CLIENTE: DNI "+dni+" Nombre: "+nombre + " Password: "+password + " Email: "+email + " Puntos de Fidelizacion: "+puntosFidelizacion + "Acceso Lounge: "+accesoLounge + " REGALO BIENVENIDA: "+ regaloBienvenida;
        return cadena;
        
    }  

    
}
