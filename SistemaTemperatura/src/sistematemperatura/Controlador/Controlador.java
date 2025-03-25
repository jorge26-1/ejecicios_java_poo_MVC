
package sistematemperatura.Controlador;




import java.util.Scanner;
import sistematemperatura.Modelo.Sensor;
import sistematemperatura.Modelo.SistemaControlTemperatura;
import sistematemperatura.Vista.Menu;

public class Controlador {
    private Menu menu;
    private Sensor sensor;
    private SistemaControlTemperatura sistemaControl;
    private Scanner scanner;

    public Controlador(Sensor sensor, SistemaControlTemperatura sistemaControl) {
        this.sensor = sensor;
        this.sistemaControl = sistemaControl;
        this.menu = new Menu(sensor, sistemaControl);
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        boolean salir = false;

        while (!salir) {
            mostrarMenu();
            int opcion = obtenerOpcionMenu();

            switch (opcion) {
                case 1:
                    mostrarMensajeBienvenida();
                    break;
                case 2:
                    simularLecturaTemperatura();
                    break;
                case 3:
                    salir = true;
                    System.out.println("Gracias por usar el control de temperatura.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        }
    }

    private void mostrarMenu() {
        System.out.println("\n--- Menú de Control de Temperatura ---");
        System.out.println("1. Mensaje de bienvenida");
        System.out.println("2. Simular lectura de temperatura y control");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private int obtenerOpcionMenu() {
        int opcion = -1;
        try {
            opcion = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Entrada no válida. Por favor ingrese un número.");
        }
        return opcion;
    }

    private void mostrarMensajeBienvenida() {
        System.out.println("\nBienvenido al sistema de control de temperatura en un invernadero.");
        System.out.println("Este programa simula un sensor de temperatura y activa un calefactor o ventilador dependiendo de la temperatura.");
        System.out.println("Si la temperatura es menor a 10°C, se activa el calefactor.");
        System.out.println("Si la temperatura está entre 10°C y 25°C, no se hace nada.");
        System.out.println("Si la temperatura es mayor a 25°C, se activa el ventilador.");
    }

    private void simularLecturaTemperatura() {
        System.out.println("\nSimulando lectura de temperatura...");
        sensor.leerTemperaturas(); 
        sistemaControl.controlarTemperaturas(sensor.getTemperaturas()); 
    }
}
