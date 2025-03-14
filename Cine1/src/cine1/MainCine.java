
package cine1;

import cine1.controlador.Controlador;
import cine1.modelo.Sala;

import cine1.vista.Vista;


public class MainCine {
    public class Main {
    public static void main(String[] args) {
        Vista vista = new Vista();
        Sala sala = new Sala("Sala 1", 10);  // Creamos la sala con 10 sillas
        Controlador controlador = new Controlador(vista, sala);
        
        controlador.iniciar();  
    }
}

}
