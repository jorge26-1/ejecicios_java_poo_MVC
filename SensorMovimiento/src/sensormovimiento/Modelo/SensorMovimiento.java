
package sensormovimiento.Modelo;


import java.util.Random;

public class SensorMovimiento {
    private boolean detectaMovimiento;

    public SensorMovimiento() {
        this.detectaMovimiento = false;
    }

    public void detectarMovimiento() {
        Random random = new Random();
        this.detectaMovimiento = random.nextBoolean();
    }

    public boolean getDetectaMovimiento() {
        return detectaMovimiento;
    }

    public void resetearSensor() {
        this.detectaMovimiento = false;
    }
}

