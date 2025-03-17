
package luces.controlador;

import luces.Modelo.SistemaLuces;
import luces.vista.Menu;
import java.util.Scanner;

public class ControladorLuces {

    private SistemaLuces sistemaLuces;
    private Menu menu;
    private Scanner scanner;

    public ControladorLuces(int cantidadLuces) {
        this.sistemaLuces = new SistemaLuces(cantidadLuces);
        this.menu = new Menu(sistemaLuces);
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        boolean continuar = true;

        while (continuar) {
            menu.mostrarMenu();
            System.out.print("Seleccione una opción (1-4): ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    cambiarHora();
                    break;
                case 2:
                    mostrarEstadoLuces();
                    break;
                case 3:
                    simularMovimiento();
                    break;
                case 4:
                    System.out.println("Gracias por usar el sistema de control de luces.");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente de nuevo.");
            }
        }
    }

    private void cambiarHora() {
        System.out.print("¿Es de noche? (s/n): ");
        String respuesta = scanner.nextLine();

        if (respuesta.equalsIgnoreCase("s")) {
            sistemaLuces.cambiarHora(true);
            System.out.println("La hora ha sido cambiada a noche.");
        } else {
            sistemaLuces.cambiarHora(false);
            System.out.println("La hora ha sido cambiada a día.");
        }
    }

    private void mostrarEstadoLuces() {
        sistemaLuces.mostrarEstado();
    }

    private void simularMovimiento() {
        System.out.print("¿Se detectó movimiento? (s/n): ");
        String respuesta = scanner.nextLine();

        if (respuesta.equalsIgnoreCase("s")) {
            sistemaLuces.simularMovimiento(true);
            sistemaLuces.controlarLuces();
            sistemaLuces.mostrarEstado();
        } else {
            sistemaLuces.simularMovimiento(false);
            sistemaLuces.controlarLuces();
            sistemaLuces.mostrarEstado();
        }
    }
}
