/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoreservasvuelos.usuarios;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.TreeMap;

/**
 *
 * @author administrador
 */
public class GestionReservas implements IGestionReservas{
    
    private ArrayList <Reserva> listaReservas = new ArrayList();
    private ArrayList <Vuelo> listaVuelos = new ArrayList();
    private ArrayList <Avion> listaAviones = new ArrayList ();
   
    private TreeMap <String, ArrayList<Vuelo>> mapaVuelos = new TreeMap <>();
    private IGestionUsuarios gestionUsuarios;
    

    public GestionReservas(IGestionUsuarios gestionUsuarios) {
        this.gestionUsuarios = gestionUsuarios;
    }

    public Reserva buscarReserva (String idReserva) {
        
        for (Reserva r: listaReservas){
            
            if (r.getIdReserva().equals(idReserva) ){
                return r;    
            }    
        }
        return null; 
}
    
    public Vuelo buscarVuelo (String idVuelo){
        
        for (Vuelo v: listaVuelos){
            if (v.getIdVuelo() == v.getIdVuelo()){
                return v;
            }
        }
        
        return null;
    }
    
    public Avion buscarAvion (String matricula){
        
        for (Avion a: listaAviones){
            if (a.getMatricula().equals(matricula)){
                return a;
            }
        }
        
        return null;
    }
    
    public boolean addVuelo (String idVuelo, String origen, String destino, LocalDate fecha, String matricula, int plazasDisponibles){
        
        Vuelo vueloBuscado = buscarVuelo (idVuelo);
        
         if(vueloBuscado !=null){
            System.out.println("Se ha producido un error, este vuelo ya existe con este idVuelo");
            return false;
        }
         
         Avion avionBuscado = buscarAvion(matricula);
         if(avionBuscado==null){
             System.out.println("Este avion no existe");
             return true;
         }
         
        Vuelo vueloNuevo = new Vuelo(idVuelo, origen, destino, fecha, avionBuscado, plazasDisponibles);
        listaVuelos.add(vueloNuevo);
        
        if (mapaVuelos.containsKey(origen)){
            
            ArrayList <Vuelo> valor = mapaVuelos.get(origen);
            valor.add (vueloNuevo);
            
        } else {
            
            ArrayList <Vuelo> valor = new ArrayList ();
            valor.add (vueloNuevo);
            mapaVuelos.put(origen, valor);
        }
        
        
        return true;
      
    }
    
    public void mostrarVuelos (){
        System.out.println("Estos son los vuelos:");
        
        for (Vuelo v: listaVuelos){
            
            System.out.println(v);
        }
        
        
    }
    
    public boolean removeVuelo (String idVuelo){
        
        Vuelo vueloBuscado = buscarVuelo (idVuelo);
        
        if (vueloBuscado == null){
            System.out.println("Se ha producido un error, este vuelo no existe con este idVuelo");
            return false;
        }
        
        listaVuelos.remove(vueloBuscado);
        
        return true;
    }
    
    public boolean addAvion (String modelo, String matricula, int capacidad){
        
        Avion avionBuscado = buscarAvion (matricula);
        
         if(avionBuscado !=null){
            System.out.println("Se ha producido un error, este avion ya existe con esta matricula");
            return false;
        }
         
        Avion avionNuevo = new Avion (modelo, matricula, capacidad);
        listaAviones.add(avionNuevo);
        
        return true;
      
    }
    
    public boolean removeAvion (String matricula){
        
        Avion avionBuscado = buscarAvion (matricula);
        
         if(avionBuscado !=null){
            System.out.println("Se ha producido un error, este avion no existe con esta matricula");
            return false;
        }
        listaAviones.remove(avionBuscado);
        return true;
      
    }
    
    public void mostrarAviones (){
        
        System.out.println("Estos son los aviones:");
        for (Avion a: listaAviones){
            
            System.out.println(a);
        }
    }
    
    public ArrayList <Vuelo> obtenerVuelosPorOrigen (String origen){
        
        ArrayList <Vuelo> vuelosOrigen = mapaVuelos.get (origen);
        
        return vuelosOrigen;
         
    }
    
    public ArrayList <Vuelo> obtenerVuelosPorDestino(String destino){
        
        ArrayList <Vuelo> vuelosDestino = new ArrayList ();
        for (Vuelo v: listaVuelos) {
            
            if (v.getDestino().equals(destino)){
                
                vuelosDestino.add(v);
               
            } 
        }
        return vuelosDestino;  
    }
    
    
    public boolean hacerReserva (String idReserva, String dni, String idVuelo, String asiento){
        
        Reserva reservaBuscada = buscarReserva (idReserva);
        
        if (reservaBuscada != null){
            
            return false;
        }
        
        Usuario usuario = gestionUsuarios.buscarUsuario(dni);
        
        if (usuario == null){
            
            System.out.println("No existe el usuario, no se puede realizar reserva");
         
            return false;
        }
        

        Vuelo vuelo = buscarVuelo (idVuelo);
        if (vuelo == null){
            
            System.out.println("Error, no existe este vuelo");
            
            return false;
        }
        
        Reserva reservaNueva = new Reserva (idReserva, usuario, vuelo, asiento);
        listaReservas.add(reservaNueva);
        
        return true;   
    } 
    
    public boolean cancelarReserva (String idReserva){
        
        Reserva reservaBuscada = buscarReserva (idReserva);
        
        if (reservaBuscada == null){
            
            System.out.println("Error. No existe esta reserva");
            
            return false;
        }
        
        listaReservas.remove(reservaBuscada);
        
        return true;
        
    }
    
    public void mostrarCiudades(){
            
            for (Ciudad ciudad:Ciudad.values()){
                System.out.println("Estas son las ciudades con las que operamos");
                System.out.println(ciudad);
                
            }
 
        }
        
    public Ciudad comprobarCiudad(String ciudad){

            for(Ciudad c: Ciudad.values()){
                if(c.name().equalsIgnoreCase(ciudad)){
                    return c;
                }
            }
            
            System.out.println("Error. No operamos con esa ciudad");
            return null;
        }
        
        
    
}
