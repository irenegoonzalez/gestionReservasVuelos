/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package proyectoreservasvuelos.usuarios;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author administrador
 */
public interface IGestionReservas {
    public Reserva buscarReserva (String idReserva);
    public Vuelo buscarVuelo (String idVuelo);
    public Avion buscarAvion (String matricula);
    public boolean addVuelo (String idVuelo, String origen, String destino, LocalDate fecha, String matricula, int plazasDisponibles);
    public void mostrarVuelos ();
    public boolean removeVuelo (String idVuelo);
    public boolean addAvion (String modelo, String matricula, int capacidad);
    public boolean removeAvion (String matricula);
    public void mostrarAviones ();
    public ArrayList <Vuelo> obtenerVuelosPorOrigen (String origen);
    public ArrayList <Vuelo> obtenerVuelosPorDestino(String destino);
    public boolean hacerReserva (String idReserva, String dni, String idVuelo, String asiento);
    public boolean cancelarReserva (String idReserva);
    public void mostrarCiudades();
    public Ciudad comprobarCiudad(String ciudad);


}
