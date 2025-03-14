package cine1.controlador;

import cine1.modelo.Persona;
import cine1.modelo.Sala;
import cine1.modelo.Usuario;
import cine1.vista.Vista;

public class Controlador {
    private Vista vista;
    private Sala sala;
    private Usuario usuario;  

    public Controlador(Vista vista, Sala sala) {
        this.vista = vista;
        this.sala = sala;
    }

    public void iniciar() {
        boolean salir = false;
        while (!salir) {
            vista.mostrarMenu();
            int opcion = vista.obtenerOpcion();

            switch (opcion) {
                case 1:
                    String nombre = vista.pedirNombre();
                    Persona persona = new Persona(nombre);
                    usuario = new Usuario(persona);  
                    usuario.hacerReserva(sala);
                    break;
                case 2:
                    if (usuario != null) {
                        vista.mostrarMensaje("Estado de la sala:");
                        usuario.mostrarReserva(sala);
                    } else {
                        vista.mostrarMensaje("No se ha realizado ninguna reserva.");
                    }
                    break;
                case 3:
                    if (usuario != null) {
                        usuario.reiniciarSala(sala);
                    } else {
                        vista.mostrarMensaje("No se ha realizado ninguna reserva.");
                    }
                    break;
                case 4:
                    vista.mostrarMensaje("Saliendo del sistema...");
                    salir = true;
                    break;
                default:
                    vista.mostrarMensaje("Opción no válida.");
                    break;
            }
        }
    }
}
