
package calculadora_matematica;




import calculadora_matematica.controlador.ControladorCalculadora;
import calculadora_matematica.vista.Menu;

public class Calculadora_matematica {

  

    public static void main(String[] args) {
       
        Menu menu = new Menu(null);

        
        ControladorCalculadora controlador = new ControladorCalculadora(menu);

        
        menu = new Menu(controlador);

        
        menu.mostrarMenu();
    }
}

