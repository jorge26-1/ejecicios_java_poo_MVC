
package sensormovimiento.Modelo;




public class GestorSensores {
    private SensorMovimiento[] sensores;

    public GestorSensores(int cantidadSensores) {
        sensores = new SensorMovimiento[cantidadSensores];
        for (int i = 0; i < cantidadSensores; i++) {
            sensores[i] = new SensorMovimiento();
        }
    }

    
    public int contarSensoresActivos() {
        int sensoresActivos = 0;
        for (int i = 0; i < sensores.length; i++) {
            if (sensores[i].getDetectaMovimiento()) {
                sensoresActivos++;
            }
            // Mostrar el estado del sensor
            System.out.println("Sensor " + (i + 1) + " detecta movimiento: " + sensores[i].getDetectaMovimiento());
        }
        return sensoresActivos;
    }

   
    public void leerSensores() {
        for (int i = 0; i < sensores.length; i++) {
            sensores[i].detectarMovimiento();
        }
        // Mostrar el estado de cada sensor
        System.out.println("Estado después de detectar movimiento:");
        for (int i = 0; i < sensores.length; i++) {
            System.out.println("Sensor " + (i + 1) + " detecta movimiento: " + sensores[i].getDetectaMovimiento());
        }
    }

    
    public void resetearSensores() {
        for (SensorMovimiento sensor : sensores) {
            sensor.resetearSensor();
        }
    }
}
