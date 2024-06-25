/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoreservasvuelos;

import java.time.LocalDate;
import java.util.Scanner;
import proyectoreservasvuelos.usuarios.Administrador;
import proyectoreservasvuelos.usuarios.Avion;
import proyectoreservasvuelos.usuarios.Ciudad;
import proyectoreservasvuelos.usuarios.GestionReservas;
import proyectoreservasvuelos.usuarios.GestionUsuarios;
import proyectoreservasvuelos.usuarios.IGestionReservas;
import proyectoreservasvuelos.usuarios.IGestionUsuarios;
import proyectoreservasvuelos.usuarios.Reserva;
import proyectoreservasvuelos.usuarios.Usuario;

/**
 *
 * @author administrador
 */
public class ProyectoReservasVuelos {

    public static void main(String[] args) {
        
        IGestionUsuarios gestionUsuarios = new GestionUsuarios ();
        IGestionReservas gestionReserva=new GestionReservas(gestionUsuarios);
        
        gestionReserva.addAvion("A747373", "JS23", 150);
        
        Ciudad ciudadOrigen;
        Ciudad ciudadDestino;


        Scanner sc = new Scanner (System.in);

        //MENU

        int opc;
        String dni;
        String nombre;
        String password;
        String apellido;
        String email;
        int puntosFidelizacion;
        boolean accesoLounge;
        String cadenaAcceso;
        String regaloBienvenida;
        String idTrabajador;
        String idVuelo;
        String origen;
        String destino;
        String matricula;
        int plazasDisponibles;
        LocalDate fecha;
        String modelo;
        String idReserva;
        String asiento;

        
        
       gestionUsuarios.addAdministrador("34343", "5678B", "Pepe", "Gonzalez", "pepe@gmail.com", "1234");
       gestionUsuarios.addCliente("12345A", "Pepa", "Rodriguez", "pepa@icloud.com", "5678", 20, true);
       
       Usuario usuario = null;
       do{
            System.out.println("Introduce dni del usuario: ");
            dni = sc.nextLine();
            System.out.println();
            System.out.println("Introduce el password: ");
            password = sc.nextLine();
            System.out.println();

            usuario = gestionUsuarios.validarUsuario(dni, password);
            if(usuario==null){
                System.out.println("error, El usuario no es valido");

            }
        }while(usuario==null);
        
        if(usuario instanceof Administrador){

            do{

                System.out.println("1. Gestion de Usuarios");
                System.out.println("2. Gestion Vuelos");
                System.out.println("3. Gestion Aviones");
                System.out.println("4. Gestion Reservas");
                System.out.println("0. SALIR");
                System.out.println("Elija una opcion: ");
                opc = Integer.parseInt(sc.nextLine());

                //Menu
                switch (opc){

                    case 1:
                        do {

                            System.out.println("1. Añadir cliente");
                            System.out.println("2. Añadir clienteVIP");
                            System.out.println("3. Añadir administrador");
                            System.out.println("4. Mostrar usuarios");
                            System.out.println("0. Volver al menu anterior");

                            System.out.println("Elija una opcion: ");
                            opc = Integer.parseInt(sc.nextLine());

                            switch (opc){

                                case 1:

                                    System.out.println("Introduce dni del cliente");
                                    dni = sc.nextLine();

                                    System.out.println("Introduce nombre del cliente");
                                    nombre = sc.nextLine();

                                    System.out.println("Introduce apellido del cliente");
                                    apellido = sc.nextLine();

                                    System.out.println("Introduce email del cliente");
                                    email = sc.nextLine();

                                    System.out.println("Introduce password del cliente");
                                    password = sc.nextLine();

                                    System.out.println("Introduce tus puntos de fidelizacion");
                                    puntosFidelizacion = Integer.parseInt(sc.nextLine());

                                    do {

                                        System.out.println("¿Desea el servicio de acceso Lounge?");
                                        cadenaAcceso = sc.nextLine();

                                    } while ((cadenaAcceso.equalsIgnoreCase("Si") == false) && (cadenaAcceso.equalsIgnoreCase("No") == false));

                                    if (cadenaAcceso.equalsIgnoreCase("Si")){

                                        accesoLounge = true;
                                    } else {

                                        accesoLounge = false;
                                    }

                                    gestionUsuarios.addCliente(dni, nombre, apellido, email, password, puntosFidelizacion, accesoLounge);
                                    break;

                                    case 2:

                                        System.out.println("Introduce dni del clienteVIP");
                                        dni = sc.nextLine();

                                        System.out.println("Introduce nombre del clienteVIP");
                                        nombre = sc.nextLine();

                                        System.out.println("Introduce apellido del clienteVIP");
                                        apellido = sc.nextLine();

                                        System.out.println("Introduce email del clienteVIP");
                                        email = sc.nextLine();

                                        System.out.println("Introduce password del clienteVIP");
                                        password = sc.nextLine();

                                        System.out.println("Introduce tus puntos de fidelizacion");
                                        puntosFidelizacion = Integer.parseInt(sc.nextLine());

                                        do{
                                            System.out.println("¡Enhorabuena! Has conseguido tu regalo de bienvenida por ser VIP, elige entre: telefono, vuelo gratis y taza");
                                            regaloBienvenida = sc.nextLine();

                                        } while (regaloBienvenida.equalsIgnoreCase("telefono")== false && (regaloBienvenida.equalsIgnoreCase("vuelo gratis")== false && (regaloBienvenida.equalsIgnoreCase("taza"))));


                                        do {

                                        System.out.println("¿Desea el servicio de acceso Lounge?");
                                        cadenaAcceso = sc.nextLine();

                                        } while ((cadenaAcceso.equalsIgnoreCase("Si") == false) && (cadenaAcceso.equalsIgnoreCase("No") == false));

                                        if (cadenaAcceso.equalsIgnoreCase("Si")){

                                        accesoLounge = true;
                                        } else {

                                        accesoLounge = false;
                                        }

                                        gestionUsuarios.addClienteVIP(dni, nombre, apellido, email, password, puntosFidelizacion, accesoLounge, regaloBienvenida);
                                        break;

                                    case 3:

                                        System.out.println("Introduce idTrabajador del administrador");
                                        idTrabajador = sc.nextLine();

                                        System.out.println("Introduce dni del administrador");
                                        dni = sc.nextLine();

                                        System.out.println("Introduce nombre del administrador");
                                        nombre = sc.nextLine();

                                        System.out.println("Introduce apellido del administrador");
                                        apellido = sc.nextLine();

                                        System.out.println("Introduce email del administrador");
                                        email = sc.nextLine();

                                        System.out.println("Introduce tu password");
                                        password = sc.nextLine();

                                        gestionUsuarios.addAdministrador(idTrabajador, dni, nombre, apellido, email, password);
                                        break;

                                    case 4:

                                        gestionUsuarios.mostrarUsuarios();
                                        break;

                            }

                        } while (opc != 0);

                        opc = 1;

                        break; 

                    case 2:
                        do {

                            System.out.println("1. Añadir vuelo");
                            System.out.println("2. Mostrar vuelo");
                            System.out.println("0. Volver al menu anterior");

                            System.out.println("Elija una opcion: ");
                            opc = Integer.parseInt(sc.nextLine());

                            switch(opc){
                            case 1:

                                System.out.println("Introduce id del vuelo");
                                idVuelo = sc.nextLine();

                                do{
                                    System.out.println("Introduce el origen");
                                    origen = sc.nextLine();

                                    ciudadOrigen=gestionReserva.comprobarCiudad(origen);
                                }while(ciudadOrigen==null);

                                do{
                                    System.out.println("Introduce el destino");
                                    destino = sc.nextLine();

                                    ciudadDestino=gestionReserva.comprobarCiudad(destino);
                                }while(ciudadDestino==null);

                                System.out.println("Introduce la fecha (yyyy-MM-dd):");
                                String cadenaFecha=sc.nextLine();
                                fecha = LocalDate.parse(cadenaFecha); 

                                System.out.println("Introduce la matricula del avion");
                                matricula = sc.nextLine();

                                System.out.println("Introduce las plazas disponibles");
                                plazasDisponibles = Integer.parseInt(sc.nextLine());

                                gestionReserva.addVuelo(idVuelo, origen, destino, fecha, matricula, plazasDisponibles);
                                break;

                            case 2:

                                System.out.println("Aqui tienes tu vuelo:");
                                gestionReserva.mostrarVuelos();
                                break;          
                            }
                        }while(opc !=0);

                        opc = 2;
                        break;

                    case 3:

                        do {

                            System.out.println("1. Añadir avion");
                            System.out.println("2. Buscar avion");
                            System.out.println("3. Mostrar aviones");
                            System.out.println("0. Volver al menu anterior");

                            System.out.println("Elija una opcion: ");
                            opc = Integer.parseInt(sc.nextLine());

                             switch (opc){

                            case 1:

                                System.out.println("Introduce matricula");
                                matricula = sc.nextLine();

                                System.out.println("Introdude modelo");
                                modelo = sc.nextLine();

                                System.out.println("Introduce las plazas disponibles");
                                plazasDisponibles = Integer.parseInt(sc.nextLine());
                                break;


                            case 2:

                                System.out.println("Introduce matricula para buscar avion");
                                matricula = sc.nextLine();

                                gestionReserva.buscarAvion(matricula);

                                Avion avionBuscado = gestionReserva.buscarAvion(matricula);
                                System.out.println(avionBuscado);
                                break;

                            case 3:

                                System.out.println("Aqui tienes los aviones seleccionados");
                                gestionReserva.mostrarAviones();
                                break;

                            }
                        }while(opc !=0);


                        opc=3;
                        break;

                    case 4:

                        do {

                            System.out.println("1. Hacer Reserva");
                            System.out.println("2. Cancelar Reserva");
                            System.out.println("3. Buscar Reserva");

                            System.out.println("Elija una opcion: ");
                            opc = Integer.parseInt(sc.nextLine());

                            switch (opc){

                            case 1:

                                System.out.println("Introduce id de la Reserva");
                                idReserva = sc.nextLine();

                                System.out.println("Introduce tu dni");
                                dni = sc.nextLine();

                                System.out.println("Introduce tu id de vuelo");
                                idVuelo = sc.nextLine();

                                System.out.println("Introduce tu asiento");
                                asiento = sc.nextLine();

                                if (gestionReserva.hacerReserva(idReserva, dni, idVuelo, asiento)){

                                    System.out.println("Reserva realizada con exito"); 
                                }

                                break;

                            case 2:

                                System.out.println("Introduce id de la Reserva");
                                idReserva = sc.nextLine();

                                System.out.println("Introduce tu dni");
                                dni = sc.nextLine();

                                System.out.println("Introduce tu id de vuelo");
                                idVuelo = sc.nextLine();

                                System.out.println("Introduce tu asiento");
                                asiento = sc.nextLine();

                                gestionReserva.cancelarReserva(idReserva);

                                if (gestionReserva.cancelarReserva(idReserva)){

                                    System.out.println("Reserva eliminada con exito"); 
                                }
                                break;

                            case 3:

                                System.out.println("Introduce ID de la reserva para buscarla");
                                idReserva = sc.nextLine();
                                Reserva reservaBuscada = gestionReserva.buscarReserva(idReserva);
                                System.out.println(reservaBuscada);
                                break;

                        }

                        } while (opc != 0);

                }

            } while (opc != -0);    
        } else {
            
            do{

                System.out.println("1. Gestion de Usuarios");
                System.out.println("2. Gestion Reservas");
                System.out.println("0. SALIR");
                System.out.println("Elija una opcion: ");
                opc = Integer.parseInt(sc.nextLine());

                //Menu
                switch (opc){

                    case 1:
                        do {

                            System.out.println("1. Añadir cliente");
                            System.out.println("2. Añadir clienteVIP");
                            System.out.println("0. Volver al menu anterior");

                            System.out.println("Elija una opcion: ");
                            opc = Integer.parseInt(sc.nextLine());

                            switch (opc){

                                case 1:

                                    System.out.println("Introduce dni del cliente");
                                    dni = sc.nextLine();

                                    System.out.println("Introduce nombre del cliente");
                                    nombre = sc.nextLine();

                                    System.out.println("Introduce apellido del cliente");
                                    apellido = sc.nextLine();

                                    System.out.println("Introduce email del cliente");
                                    email = sc.nextLine();

                                    System.out.println("Introduce password del cliente");
                                    password = sc.nextLine();

                                    System.out.println("Introduce tus puntos de fidelizacion");
                                    puntosFidelizacion = Integer.parseInt(sc.nextLine());

                                    do {

                                        System.out.println("¿Desea el servicio de acceso Lounge?");
                                        cadenaAcceso = sc.nextLine();

                                    } while ((cadenaAcceso.equalsIgnoreCase("Si") == false) && (cadenaAcceso.equalsIgnoreCase("No") == false));

                                    if (cadenaAcceso.equalsIgnoreCase("Si")){

                                        accesoLounge = true;
                                    } else {

                                        accesoLounge = false;
                                    }

                                    gestionUsuarios.addCliente(dni, nombre, apellido, email, password, puntosFidelizacion, accesoLounge);
                                    break;

                                    case 2:

                                        System.out.println("Introduce dni del clienteVIP");
                                        dni = sc.nextLine();

                                        System.out.println("Introduce nombre del clienteVIP");
                                        nombre = sc.nextLine();

                                        System.out.println("Introduce apellido del clienteVIP");
                                        apellido = sc.nextLine();

                                        System.out.println("Introduce email del clienteVIP");
                                        email = sc.nextLine();

                                        System.out.println("Introduce password del clienteVIP");
                                        password = sc.nextLine();

                                        System.out.println("Introduce tus puntos de fidelizacion");
                                        puntosFidelizacion = Integer.parseInt(sc.nextLine());

                                        do{
                                            System.out.println("¡Enhorabuena! Has conseguido tu regalo de bienvenida por ser VIP, elige entre: telefono, vuelo gratis y taza");
                                            regaloBienvenida = sc.nextLine();

                                        } while (regaloBienvenida.equalsIgnoreCase("telefono")== false && (regaloBienvenida.equalsIgnoreCase("vuelo gratis")== false && (regaloBienvenida.equalsIgnoreCase("taza"))));


                                        do {

                                        System.out.println("¿Desea el servicio de acceso Lounge?");
                                        cadenaAcceso = sc.nextLine();

                                        } while ((cadenaAcceso.equalsIgnoreCase("Si") == false) && (cadenaAcceso.equalsIgnoreCase("No") == false));

                                        if (cadenaAcceso.equalsIgnoreCase("Si")){

                                        accesoLounge = true;
                                        } else {

                                        accesoLounge = false;
                                        }

                                        gestionUsuarios.addClienteVIP(dni, nombre, apellido, email, password, puntosFidelizacion, accesoLounge, regaloBienvenida);
                                        break;
 
                            }

                        } while (opc != 0);

                        opc = 1;

                        break; 

                    case 2:

                        do {

                            System.out.println("1. Hacer Reserva");
                            System.out.println("2. Cancelar Reserva");
                            System.out.println("3. Buscar Reserva");

                            System.out.println("Elija una opcion: ");
                            opc = Integer.parseInt(sc.nextLine());

                            switch (opc){

                            case 1:

                                System.out.println("Introduce id de la Reserva");
                                idReserva = sc.nextLine();

                                System.out.println("Introduce tu dni");
                                dni = sc.nextLine();

                                System.out.println("Introduce tu id de vuelo");
                                idVuelo = sc.nextLine();

                                System.out.println("Introduce tu asiento");
                                asiento = sc.nextLine();

                                if (gestionReserva.hacerReserva(idReserva, dni, idVuelo, asiento)){

                                    System.out.println("Reserva realizada con exito"); 
                                }

                                break;

                            case 2:

                                System.out.println("Introduce id de la Reserva");
                                idReserva = sc.nextLine();

                                System.out.println("Introduce tu dni");
                                dni = sc.nextLine();

                                System.out.println("Introduce tu id de vuelo");
                                idVuelo = sc.nextLine();

                                System.out.println("Introduce tu asiento");
                                asiento = sc.nextLine();

                                gestionReserva.cancelarReserva(idReserva);

                                if (gestionReserva.cancelarReserva(idReserva)){

                                    System.out.println("Reserva eliminada con exito"); 
                                }
                                break;

                            case 3:

                                System.out.println("Introduce ID de la reserva para buscarla");
                                idReserva = sc.nextLine();
                                Reserva reservaBuscada = gestionReserva.buscarReserva(idReserva);
                                System.out.println(reservaBuscada);
                                break;

                        }

                        } while (opc != 0);

                }

            } while (opc != -0); 
            
        }
    }
    
}
