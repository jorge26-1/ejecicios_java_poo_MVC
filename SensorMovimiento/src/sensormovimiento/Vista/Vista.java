
package sensormovimiento.Vista;



import java.util.Scanner;



public class Vista {
    private Scanner scanner;

    public Vista() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println("\n--- Menú de Sistema de Seguridad ---");
        System.out.println("1. Mensaje de bienvenida");
        System.out.println("2. Activar/Desactivar alarma");
        System.out.println("3. Cambiar hora (día/noche)");
        System.out.println("4. Leer sensores y mostrar estado");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public int obtenerOpcion() {
        return scanner.nextInt();
    }

    public void mostrarMensajeBienvenida() {
        System.out.println("\nBienvenido al sistema de seguridad con sensores de movimiento.");
        System.out.println("El sistema activa la alarma si al menos dos sensores detectan movimiento y es de noche.");
    }

    public void cambiarHora() {
        System.out.print("¿Es de noche? (s/n): ");
        String respuesta = scanner.next();
        if (respuesta.equalsIgnoreCase("s")) {
            System.out.println("La hora ha sido cambiada a noche.");
        } else {
            System.out.println("La hora ha sido cambiada a día.");
        }
    }

    public void mostrarEstadoAlarma(boolean alarmaActivada) {
        if (alarmaActivada) {
            System.out.println("¡Alarma activada! Intruso detectado.");
        } else {
            System.out.println("Alarma desactivada.");
        }
    }
}
