/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoreservasvuelos.usuarios;

import java.util.ArrayList;

/**
 *
 * @author administrador
 */
public class GestionUsuarios implements IGestionUsuarios {
    
    private ArrayList <Usuario> listaUsuarios = new ArrayList ();

      
    
    public Usuario buscarUsuario (String dni) {
        
        for (Usuario u: listaUsuarios){
            
            if (u.getDni().equals(dni) ){
                
                return u;    
            }    
        }
        return null; 
    }   
    
    public boolean addCliente (String dni, String nombre, String apellido, String email, String password, int puntosFidelizacion, boolean accesoLounge){
        
        Usuario usuarioBuscado = buscarUsuario (dni);
        
        if (usuarioBuscado != null){
            
            System.out.println("Se ha producido un error, este cliente ya existe con este DNI");
            return false;
        }
        
        Cliente clienteNuevo = new Cliente (dni, nombre, apellido, email, password, puntosFidelizacion, accesoLounge);
        
        listaUsuarios.add(clienteNuevo);
        
        return true;
        
        
    }
    
    public boolean addClienteVIP (String dni, String nombre, String apellido, String email, String password, int puntosFidelizacion, boolean accesoLounge, String regaloBienvenida){
        
        Usuario usuarioBuscado = buscarUsuario (dni);
        
        if (usuarioBuscado != null){
            
            System.out.println("Se ha producido un error, este cliente VIP ya existe con este DNI");
            return false;
        }
        
        Cliente clienteNuevoVIP = new Cliente (dni, nombre, apellido, email, password, puntosFidelizacion, accesoLounge);
        
        listaUsuarios.add(clienteNuevoVIP);
        
        return true;
        
        
    }
    
    public boolean addAdministrador (String idTrabajador, String dni, String nombre, String apellido, String email, String password){
        
        Usuario usuarioBuscado = buscarUsuario (idTrabajador);
        
        if (usuarioBuscado != null){
            
            System.out.println("Se ha producido un error, este administrador ya existe con este idTrabajador");
            return false;
        }
        
        Administrador administradorNuevo = new Administrador (idTrabajador, dni, nombre, apellido, email, password);
        
        listaUsuarios.add(administradorNuevo);
        
        return true;
        
    }
    
    
   public void mostrarUsuarios (){
       
      
       for (Usuario u: listaUsuarios){
           
           System.out.println(u);
           
           
       }
        
   }
   
   public Usuario validarUsuario (String dni, String password){
       
       Usuario usuarioBuscado = buscarUsuario (dni);
       
       if (usuarioBuscado == null){
           
           return null;
       }
       
       if (usuarioBuscado.comprobarPassword(password)){
           
           return usuarioBuscado;
       }
       
       return null;
   }
}
