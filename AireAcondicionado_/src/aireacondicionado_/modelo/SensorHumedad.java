
package aireacondicionado_.modelo;



import java.util.Random;

public class SensorHumedad {
    private double humedad;

    public SensorHumedad() {
        this.humedad = 50.0; 
    }

    public void leerHumedad() {
        Random random = new Random();
        this.humedad = 40 + random.nextDouble() * 40; 
    }

    public double obtenerHumedad() {
        return this.humedad;
    }
}
