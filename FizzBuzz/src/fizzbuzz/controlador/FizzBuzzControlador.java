
package fizzbuzz.controlador;
import fizzbuzz.Modelo.FizzBuzzModel;
import fizzbuzz.Vista.FizzBuzzVista;
import java.util.Scanner;





public class FizzBuzzControlador {
    private FizzBuzzModel model;
    private FizzBuzzVista vista;

    public FizzBuzzControlador(FizzBuzzModel model, FizzBuzzVista vista) {
        this.model = model;
        this.vista = vista;
    }

    public void iniciar() {
        boolean salir = false;
        while (!salir) {
            vista.mostrarMenu();
            Scanner scanner = new Scanner(System.in);
            int opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    vista.mostrarMensajeBienvenida();
                    break;
                case 2:
                    model.generarFizzBuzz(); 
                    vista.mostrarResultados(model.getResultados()); 
                    break;
                case 3:
                    volverHacerOtroEjercicio();
                    break;
                case 4:
                    salir = true;
                    vista.mostrarMensajeSalida();
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        }
    }

    private void volverHacerOtroEjercicio() {
        System.out.print("\n¿Desea volver a hacer el ejercicio? (s/n): ");
        String respuesta = vista.obtenerRespuesta();
        if (respuesta.equalsIgnoreCase("s")) {
            model.generarFizzBuzz(); 
            vista.mostrarResultados(model.getResultados()); 
        } else {
            System.out.println("Gracias por usar el programa de FizzBuzz.");
        }
    }
}
