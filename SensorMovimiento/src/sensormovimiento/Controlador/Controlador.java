
package sensormovimiento.Controlador;

import sensormovimiento.Modelo.SistemaSeguridad;
import sensormovimiento.Vista.Vista;


public class Controlador {
    private SistemaSeguridad sistemaSeguridad;
    private Vista vista;

    public Controlador(SistemaSeguridad sistemaSeguridad, Vista vista) {
        this.sistemaSeguridad = sistemaSeguridad;
        this.vista = vista;
    }

    public void iniciar() {
        boolean salir = false;

        while (!salir) {
            vista.mostrarMenu();
            int opcion = vista.obtenerOpcion();

            switch (opcion) {
                case 1:
                    vista.mostrarMensajeBienvenida();
                    break;
                case 2:
                    sistemaSeguridad.cambiarEstadoAlarma();
                    sistemaSeguridad.mostrarEstado();
                    break;
                case 3:
                    vista.cambiarHora();
                    // Cambiar hora según la entrada de la vista
                    sistemaSeguridad.cambiarHora(vista.obtenerOpcion() == 1);
                    break;
                case 4:
                    sistemaSeguridad.leerSensores();
                    sistemaSeguridad.mostrarEstado();
                    break;
                case 5:
                    salir = true;
                    System.out.println("Gracias por usar el sistema de seguridad.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        }
    }
}


