
package aireacondicionado_;

import aireacondicionado_.controlador.ControladorAireAcondicionado;
import aireacondicionado_.modelo.SistemaAireAcondicionado;
import aireacondicionado_.vista.VistaAireAcondicionado;


public class AireAcondicionado_ {

    
    public static void main(String[] args) {
        
        SistemaAireAcondicionado sistemaAireAcondicionado = new SistemaAireAcondicionado(5);
        
        VistaAireAcondicionado vista = new VistaAireAcondicionado();

        ControladorAireAcondicionado controlador = new ControladorAireAcondicionado(sistemaAireAcondicionado, vista);

        controlador.iniciar();
    }
}


