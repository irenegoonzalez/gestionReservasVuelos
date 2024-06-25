/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoreservasvuelos.usuarios;

/**
 *
 * @author administrador
 */
public class Reserva {
    
    private String idReserva;
    private Usuario usuario;
    private Vuelo vuelo;
    private String asiento;
    
    public Reserva (String idReserva, Usuario usuario, Vuelo vuelo, String asiento){
        
        this.asiento = asiento;
        this.idReserva = idReserva;
        this.usuario = usuario;
        this.vuelo = vuelo;
    }

    public String getIdReserva() {
        return idReserva;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setIdReserva(String idReserva) {
        this.idReserva = idReserva;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }
    
    
    
}
