
package aireacondicionado_.modelo;




public class SistemaAireAcondicionado {
    private SensorTemperatura sensorTemperatura;
    private SensorHumedad sensorHumedad;
    private boolean aireEncendido;
    
    // Arrays para almacenar el historial
    private double[] temperaturas;
    private double[] humedades;
    private boolean[] estadosAire;

    // Variables para el tamaño del historial
    private int index;

    public SistemaAireAcondicionado(int historialSize) {
        this.sensorTemperatura = new SensorTemperatura();
        this.sensorHumedad = new SensorHumedad();
        this.aireEncendido = false;

        // Inicializamos los arrays para almacenar los valores
        this.temperaturas = new double[historialSize];
        this.humedades = new double[historialSize];
        this.estadosAire = new boolean[historialSize];
        this.index = 0;
    }

    public void controlarAireAcondicionado() {
        sensorTemperatura.leerTemperatura();
        sensorHumedad.leerHumedad();

        double temperatura = sensorTemperatura.obtenerTemperatura();
        double humedad = sensorHumedad.obtenerHumedad();

        if ((temperatura > 28 && humedad > 60) || temperatura > 30) {
            aireEncendido = true;
        } else {
            aireEncendido = false;
        }

        // Guardamos los valores en el historial
        temperaturas[index] = temperatura;
        humedades[index] = humedad;
        estadosAire[index] = aireEncendido;

        
        index = (index + 1) % temperaturas.length;
    }

    public boolean getAireEncendido() {
        return aireEncendido;
    }

    public double getTemperatura() {
        return sensorTemperatura.obtenerTemperatura();
    }

    public double getHumedad() {
        return sensorHumedad.obtenerHumedad();
    }

    public void mostrarHistorial() {
        System.out.println("\n--- Historial del Aire Acondicionado ---");
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] != 0) {
                System.out.printf("Registro %d - Temperatura: %.2f°C, Humedad: %.2f%%, Aire Encendido: %s\n",
                        i + 1, temperaturas[i], humedades[i], estadosAire[i] ? "ENCENDIDO" : "APAGADO");
            }
        }
    }
}
