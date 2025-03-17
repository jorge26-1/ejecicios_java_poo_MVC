package calculadora_matematica.vista;

import calculadora_matematica.controlador.ControladorCalculadora;
import java.util.Scanner;

public class Menu {

    private ControladorCalculadora controlador;

    public Menu(ControladorCalculadora controlador) {
        this.controlador = controlador;
    }

    
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- Menú de Calculadora ---");
            System.out.println("1. Mensaje de bienvenida");
            System.out.println("2. Realizar operación");
            System.out.println("3. Ver historial de resultados");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            
            controlador.procesarOpcion(opcion);

            if (opcion == 4) {
                salir = true;
            }
        }
    }
}


