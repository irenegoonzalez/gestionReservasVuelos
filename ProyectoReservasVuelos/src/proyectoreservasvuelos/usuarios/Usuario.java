/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoreservasvuelos.usuarios;

/**
 *
 * @author administrador
 */
public abstract class Usuario {
    
    protected String dni;
    protected String nombre;
    protected String apellido;
    protected String email;
    protected String password;
    
    public Usuario (String dni, String nombre, String apellido, String email, String password){
        
        this.dni = dni;
        this.apellido = apellido;
        this.email = email;
        this.nombre = nombre;
        this.password = password;
        
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public boolean comprobarPassword (String password) {
        
        if (this.password.equals(password) == false){
            
            return false;
        }
        
        return true;
   
}
    
     public String toString (){
        
        String cadena = "CLIENTE: DNI "+dni+" Nombre: "+nombre + " Password: "+password + " Email: "+email;
        return cadena;
        
    }  
    
  
}


