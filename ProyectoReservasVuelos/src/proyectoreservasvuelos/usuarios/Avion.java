/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoreservasvuelos.usuarios;

/**
 *
 * @author administrador
 */
public class Avion {
    
    private String modelo;
    private String matricula;
    private int capacidad;
    
    public Avion (String modelo, String matricula, int capacidad){
        
        this.capacidad = capacidad;
        this.matricula = matricula;
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    
    
    
}
