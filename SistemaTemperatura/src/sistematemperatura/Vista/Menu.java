
package sistematemperatura.Vista;



import java.util.Scanner;
import sistematemperatura.Modelo.Sensor;
import sistematemperatura.Modelo.SistemaControlTemperatura;

public class Menu {
    private Sensor sensor;
    private SistemaControlTemperatura sistemaControl;
    private Scanner scanner;

    public Menu(Sensor sensor, SistemaControlTemperatura sistemaControl) {
        this.sensor = sensor;
        this.sistemaControl = sistemaControl;
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println("\n--- Menú de Control de Temperatura ---");
        System.out.println("1. Mensaje de bienvenida");
        System.out.println("2. Simular lectura de temperatura y control");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public void mostrarMensajeBienvenida() {
        System.out.println("\nBienvenido al sistema de control de temperatura en un invernadero.");
        System.out.println("Este programa simula un sensor de temperatura y activa un calefactor o ventilador dependiendo de la temperatura.");
        System.out.println("Si la temperatura es menor a 10°C, se activa el calefactor.");
        System.out.println("Si la temperatura está entre 10°C y 25°C, no se hace nada.");
        System.out.println("Si la temperatura es mayor a 25°C, se activa el ventilador.");
    }

    public void simularLecturaTemperatura() {
        System.out.println("\nSimulando lectura de temperatura...");
        sensor.leerTemperaturas(); 
        sistemaControl.controlarTemperaturas(sensor.getTemperaturas()); 
    }
}
