
package fizzbuzz;

import fizzbuzz.Modelo.FizzBuzzModel;
import fizzbuzz.Vista.FizzBuzzVista;
import fizzbuzz.controlador.FizzBuzzControlador;


public class FizzBuzz {


    public static void main(String[] args) {
        FizzBuzzModel model = new FizzBuzzModel();
        FizzBuzzVista vista = new FizzBuzzVista();
        FizzBuzzControlador controlador = new FizzBuzzControlador(model, vista);
        controlador.iniciar();
    }
}
