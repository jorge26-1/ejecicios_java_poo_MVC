
package sensormovimiento;

import sensormovimiento.Controlador.Controlador;
import sensormovimiento.Modelo.SistemaSeguridad;
import sensormovimiento.Vista.Vista;





public class SensorMovimiento {

    public static void main(String[] args) {
        
        SistemaSeguridad sistemaSeguridad = new SistemaSeguridad(3);

        
        Vista vista = new Vista();

        
        Controlador controlador = new Controlador(sistemaSeguridad, vista);

        
        controlador.iniciar();
    }
}


