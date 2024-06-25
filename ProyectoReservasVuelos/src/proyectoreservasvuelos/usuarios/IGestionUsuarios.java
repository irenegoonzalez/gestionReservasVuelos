/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package proyectoreservasvuelos.usuarios;

/**
 *
 * @author administrador
 */
public interface IGestionUsuarios {
    
    public Usuario buscarUsuario (String dni);
    public boolean addCliente (String dni, String nombre, String apellido, String email, String password, int puntosFidelizacion, boolean accesoLounge);
    public boolean addClienteVIP (String dni, String nombre, String apellido, String email, String password, int puntosFidelizacion, boolean accesoLounge, String regaloBienvenida);
    public boolean addAdministrador (String idTrabajador, String dni, String nombre, String apellido, String email, String password);
    public void mostrarUsuarios ();
    public Usuario validarUsuario (String dni, String password);
    
}
