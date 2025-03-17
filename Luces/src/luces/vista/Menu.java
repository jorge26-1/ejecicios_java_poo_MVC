package luces.vista;

import luces.Modelo.Luz;
import luces.Modelo.SistemaLuces;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private SistemaLuces sistemaLuces;

    public Menu(SistemaLuces sistemaLuces) {
        this.sistemaLuces = sistemaLuces;
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- Menú de Control de Luces Automático ---");
            System.out.println("1. Cambiar hora (día/noche)");
            System.out.println("2. Verificar el estado de las luces");
            System.out.println("3. Simular movimiento");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    cambiarHora();
                    break;
                case 2:
                    mostrarEstadoLuces();  // Ahora este método no debería dar error
                    break;
                case 3:
                    simularMovimiento();
                    break;
                case 4:
                    salir = true;
                    System.out.println("Gracias por usar el sistema de control de luces.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }

    private void cambiarHora() {
        Scanner scanner = new Scanner(System.in);
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
        ArrayList<Luz> luces = sistemaLuces.obtenerEstadoLuces();  // Ahora obtiene el estado de las luces correctamente
        System.out.println("\nEstado de las luces:");
        for (int i = 0; i < luces.size(); i++) {
            System.out.println("Luz " + (i + 1) + ": " + luces.get(i).toString());
        }
    }

    private void simularMovimiento() {
        Scanner scanner = new Scanner(System.in);
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

