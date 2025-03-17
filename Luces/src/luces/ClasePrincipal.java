
package luces;

import luces.controlador.ControladorLuces;






public class ClasePrincipal {
    public static void main(String[] args) {
        
        ControladorLuces controlador = new ControladorLuces(5);
        
        
        controlador.iniciar();
    }
}

