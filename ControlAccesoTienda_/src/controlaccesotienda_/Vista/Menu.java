
package controlaccesotienda_.Vista;



import controlaccesotienda_.Modelo.Cliente;
import java.util.Scanner;
import java.util.ArrayList;


public class Menu {

    private Scanner scanner;

    public Menu() {
        scanner = new Scanner(System.in);
    }

    public int mostrarMenu() {
        int opcion;

        System.out.println("\nBienvenido al sistema de control de acceso a la tienda.");
        System.out.println("1. Resolver ejercicio");
        System.out.println("2. Ver clientes almacenados");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
        opcion = scanner.nextInt();
        return opcion;
    }

    public Cliente obtenerDatosCliente() {
        System.out.print("¿El cliente tiene membresía? (true/false): ");
        boolean tieneMembresia = scanner.nextBoolean();

        System.out.print("¿El cliente es empleado? (true/false): ");
        boolean esEmpleado = scanner.nextBoolean();

        System.out.print("¿Qué hora es? (Ingrese la hora en formato 24 horas): ");
        int horaAcceso = scanner.nextInt();

        return new Cliente(tieneMembresia, esEmpleado, horaAcceso);
    }

    public void mostrarResultadoAcceso(Cliente cliente) {
        if (cliente.puedeAcceder()) {
            System.out.println("Acceso permitido a la tienda.");
        } else {
            System.out.println("Acceso denegado. No cumple con los requisitos.");
        }
    }

    
    public void mostrarClientes(ArrayList<Cliente> clientes) {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes almacenados.");
        } else {
            System.out.println("\nClientes almacenados:");
            for (Cliente cliente : clientes) {
                System.out.println(cliente);  
            }
        }
    }
}

