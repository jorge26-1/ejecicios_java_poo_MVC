
package cine1.vista;

import java.util.Scanner;

public class Vista {
    private Scanner scanner;

    public Vista() {
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println("\n--- Menú de Reservas ---");
        System.out.println("1. Hacer reserva");
        System.out.println("2. Ver estado de la sala");
        System.out.println("3. Reiniciar la sala");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public String pedirNombre() {
        System.out.print("Ingrese su nombre: ");
        return scanner.nextLine();
    }

    public int obtenerOpcion() {
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, ingrese un número válido.");
            scanner.next();
        }
        int opcion = scanner.nextInt();
        scanner.nextLine();
        return opcion;
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
