
package aireacondicionado_.controlador;




import aireacondicionado_.modelo.SistemaAireAcondicionado;
import aireacondicionado_.vista.VistaAireAcondicionado;
import java.util.Scanner;

public class ControladorAireAcondicionado {
    private SistemaAireAcondicionado modelo;
    private VistaAireAcondicionado vista;
    private Scanner scanner;

    public ControladorAireAcondicionado(SistemaAireAcondicionado modelo, VistaAireAcondicionado vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        vista.mostrarMensajeBienvenida();

        boolean salir = false;
        while (!salir) {
            System.out.println("\n--- Menú de Control de Aire Acondicionado ---");
            System.out.println("1. Verificar el estado del aire acondicionado");
            System.out.println("2. Simular control del aire acondicionado");
            System.out.println("3. Ver historial del aire acondicionado");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarEstado();
                    break;
                case 2:
                    simularControl();
                    break;
                case 3:
                    verHistorial();
                    break;
                case 4:
                    salir = true;
                    vista.mostrarMensajeFinalizacion();
                    break;
                default:
                    vista.mostrarOpcionInvalida();
            }
        }
    }

    private void mostrarEstado() {
        boolean aireEncendido = modelo.getAireEncendido();
        double temperatura = modelo.getTemperatura();
        double humedad = modelo.getHumedad();

        vista.mostrarEstado(aireEncendido, temperatura, humedad);
    }

    private void simularControl() {
        System.out.println("Simulando el control del aire acondicionado...");
        for (int i = 0; i < 5; i++) {
            modelo.controlarAireAcondicionado();
            mostrarEstado();
            try {
                Thread.sleep(5000); // Espera de 5 segundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void verHistorial() {
        modelo.mostrarHistorial();
    }
}

