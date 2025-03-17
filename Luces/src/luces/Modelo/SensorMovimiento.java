
package luces.Modelo;



public class SensorMovimiento {
    private boolean hayMovimiento;

    public SensorMovimiento() {
        this.hayMovimiento = false;  // Inicialmente no hay movimiento
    }

    // Método para simular la detección de movimiento
    public void detectarMovimiento(boolean hayMovimiento) {
        this.hayMovimiento = hayMovimiento;
    }

    // Método para obtener si hay movimiento
    public boolean detectar() {
        return this.hayMovimiento;
    }
}
