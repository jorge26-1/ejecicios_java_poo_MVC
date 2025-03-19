
package fizzbuzz.Vista;

import java.util.Scanner;



public class FizzBuzzVista {

    public void mostrarMenu() {
        System.out.println("\n--- Menú de FizzBuzz ---");
        System.out.println("1. Mensaje de bienvenida");
        System.out.println("2. Resolver el ejercicio FizzBuzz");
        System.out.println("3. Volver a hacer otro ejercicio");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public void mostrarMensajeBienvenida() {
        System.out.println("\nBienvenido al juego FizzBuzz.");
        System.out.println("Este programa recorre los números del 1 al 100 y para cada número:");
        System.out.println("- Si es divisible por 3, imprime 'Fizz'");
        System.out.println("- Si es divisible por 5, imprime 'Buzz'");
        System.out.println("- Si es divisible por ambos, imprime 'FizzBuzz'");
        System.out.println("- Si no es divisible por ninguno, imprime el número.");
    }

    public void mostrarResultados(String[] resultados) {
        
        for (String resultado : resultados) {
            System.out.println(resultado);
        }
    }

    public void mostrarMensajeSalida() {
        System.out.println("Gracias por usar el programa de FizzBuzz.");
    }

    public String obtenerRespuesta() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
