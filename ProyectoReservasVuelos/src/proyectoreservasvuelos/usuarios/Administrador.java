/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoreservasvuelos.usuarios;

/**
 *
 * @author administrador
 */
public class Administrador extends Usuario {
    
    protected String idTrabajador;
    
    
    public Administrador (String idTrabajador, String dni, String nombre, String apellido, String email, String password){
        
        super (dni,nombre, apellido, email, password);
        
        this.idTrabajador = idTrabajador;
        
        
    }

    public String getIdTrabajador() {
        return idTrabajador;
    }


    public void setIdTrabajador(String idTrabajador) {
        this.idTrabajador = idTrabajador;
    }
    
     public String toString (){
        
        String cadena = "CLIENTE: DNI "+dni+" Nombre: "+nombre + " Password: "+password + " Email: "+email + " Apellido: "+apellido + " idTrabajador: "+idTrabajador;
        return cadena;
        
    }  

    
}
