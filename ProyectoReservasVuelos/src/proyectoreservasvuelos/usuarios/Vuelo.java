/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoreservasvuelos.usuarios;
import java.time.LocalDate;
/**
 *
 * @author administrador
 */
public class Vuelo {
    
    private String idVuelo;
    private String origen;
    private String destino;
    private LocalDate fecha;
    private Avion avion;
    private int plazasDisponibles;
    
    public Vuelo (String idVuelo, String origen, String destino, LocalDate fecha, Avion avion, int plazasDisponibles){
        
        this.avion = avion;
        this.destino = destino;
        this.fecha = fecha;
        this.idVuelo = idVuelo;
        this.origen = origen;
        this.plazasDisponibles = plazasDisponibles;
    }

    public String getIdVuelo() {
        return idVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Avion getAvion() {
        return avion;
    }

    public int getPlazasDisponibles() {
        return plazasDisponibles;
    }

    public void setIdVuelo(String idVuelo) {
        this.idVuelo = idVuelo;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public void setPlazasDisponibles(int plazasDisponibles) {
        this.plazasDisponibles = plazasDisponibles;
    }
    
    
    
    
    
}
