
package sistematemperatura.Modelo;



import java.util.Random;

public class Sensor {
    private double[] temperaturas;

    public Sensor() {
        this.temperaturas = new double[5]; 
    }

    public double[] getTemperaturas() {
        return temperaturas;
    }

    public void leerTemperaturas() {
        Random random = new Random();
        for (int i = 0; i < temperaturas.length; i++) {
            temperaturas[i] = 5 + (random.nextDouble() * 35); 
        }
    }
}

