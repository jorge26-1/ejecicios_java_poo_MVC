
package controlaccesotienda_.Controlador;

import controlaccesotienda_.Modelo.Cliente;
import controlaccesotienda_.Vista.Menu;



import java.util.ArrayList;

public class ControladorAcceso {

    private Menu menu;
    private ArrayList<Cliente> clientes;

    public ControladorAcceso() {
        menu = new Menu();
        clientes = new ArrayList<>(); 
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = menu.mostrarMenu();  

            switch (opcion) {
                case 1:
                    Cliente cliente = menu.obtenerDatosCliente();  
                    clientes.add(cliente);  
                    menu.mostrarResultadoAcceso(cliente);  
                    break;
                case 2:
                    menu.mostrarClientes(clientes); 
                    break;
                case 3:
                    System.out.println("Gracias por usar el sistema. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    break;
            }
        } while (opcion != 3);  
    }
}
