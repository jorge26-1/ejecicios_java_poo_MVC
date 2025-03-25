
package sistematemperatura;

import sistematemperatura.Controlador.Controlador;
import sistematemperatura.Modelo.Sensor;
import sistematemperatura.Modelo.SistemaControlTemperatura;


public class SistemaTemperatura {





    public static void main(String[] args) {
        
        Sensor sensor = new Sensor();
        SistemaControlTemperatura sistemaControl = new SistemaControlTemperatura();
        Controlador controlador = new Controlador(sensor, sistemaControl); 
        controlador.iniciar(); 
    }
}
