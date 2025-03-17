package calculadora_matematica.controlador;

import calculadora_matematica.modelo.Operaciones;
import calculadora_matematica.vista.Menu;
import java.util.Scanner;

public class ControladorCalculadora {

    private Menu menu;
    private Operaciones[] resultados;  
    private int index;  
    
    public ControladorCalculadora(Menu menu) {
        this.menu = menu;
        this.resultados = new Operaciones[10];  
        this.index = 0;
    }

    
    public void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                mostrarMensajeBienvenida();
                break;
            case 2:
                realizarOperacion();
                break;
            case 3:
                mostrarHistorial();
                break;
            case 4:
                System.out.println("Gracias por usar la calculadora.");
                break;
            default:
                System.out.println("Opción no válida. Intente nuevamente.");
                break;
        }
    }

    
    private void mostrarMensajeBienvenida() {
        System.out.println("\nBienvenido a la calculadora simple.");
        System.out.println("Este programa le permite realizar operaciones matemáticas simples.");
        System.out.println("Puede realizar operaciones de suma, resta, multiplicación y división.");
    }

    
    private void realizarOperacion() {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("\nSeleccione la operación a realizar:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");

        int operacion = scanner.nextInt();

        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;
        String nombreOperacion = "";
        switch (operacion) {
            case 1:
                resultado = num1 + num2;
                nombreOperacion = "Suma";
                break;
            case 2:
                resultado = num1 - num2;
                nombreOperacion = "Resta";
                break;
            case 3:
                resultado = num1 * num2;
                nombreOperacion = "Multiplicación";
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    nombreOperacion = "División";
                } else {
                    System.out.println("Error: No se puede dividir por 0.");
                    return;
                }
                break;
            default:
                System.out.println("Operación no válida.");
                return;
        }

        
        if (index < resultados.length) {
            resultados[index] = new Operaciones(nombreOperacion, resultado);
            index++;
        } else {
            System.out.println("Historial lleno, no se pueden almacenar más resultados.");
        }

        System.out.println("El resultado de la operación es: " + resultado);
    }

    
    private void mostrarHistorial() {
        System.out.println("\nHistorial de resultados:");
        if (index == 0) {
            System.out.println("No se han realizado operaciones.");
        } else {
            for (int i = 0; i < index; i++) {
                System.out.println(resultados[i]);
            }
        }
    }
}

