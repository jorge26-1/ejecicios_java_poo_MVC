
package aireacondicionado_.vista;



public class VistaAireAcondicionado {
    
    public void mostrarEstado(boolean aireEncendido, double temperatura, double humedad) {
        System.out.println("\n--- Estado Actual del Aire Acondicionado ---");
        if (aireEncendido) {
            System.out.println("El aire acondicionado está ENCENDIDO.");
        } else {
            System.out.println("El aire acondicionado está APAGADO.");
        }
        System.out.printf("Temperatura actual: %.2f°C\n", temperatura);
        System.out.printf("Humedad actual: %.2f%%\n", humedad);
        System.out.println("-------------------------------------------");
    }

    
    public void mostrarMensajeBienvenida() {
        System.out.println("\nBienvenido al sistema de control de aire acondicionado.");
        System.out.println("Este sistema enciende el aire acondicionado si:");
        System.out.println("1. La temperatura es mayor a 28°C y la humedad es mayor al 60%.");
        System.out.println("2. La temperatura es mayor a 30°C, independientemente de la humedad.");
        System.out.println("-------------------------------------------------------------");
    }

    public void mostrarHistorial() {
        System.out.println("\n--- Historial del Aire Acondicionado ---");
        System.out.println("Mostrando historial de los últimos registros:");
    }

    public void mostrarMensajeFinalizacion() {
        System.out.println("\nGracias por usar el sistema de control de aire acondicionado.");
    }

    public void mostrarOpcionInvalida() {
        System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
    }
}
