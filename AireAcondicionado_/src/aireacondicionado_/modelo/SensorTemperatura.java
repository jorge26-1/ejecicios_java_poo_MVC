
package aireacondicionado_.modelo;


import java.util.Random;

public class SensorTemperatura {
    private double temperatura;

    public SensorTemperatura() {
        this.temperatura = 20.0; 
    }

    public void leerTemperatura() {
        Random random = new Random();
        this.temperatura = 20 + random.nextDouble() * 15; 
    }

    public double obtenerTemperatura() {
        return this.temperatura;
    }
}

