
package luces.Modelo;



public class SensorMovimiento {
    private boolean hayMovimiento;

    public SensorMovimiento() {
        this.hayMovimiento = false;  
    }

   
    public void detectarMovimiento(boolean hayMovimiento) {
        this.hayMovimiento = hayMovimiento;
    }

    
    public boolean detectar() {
        return this.hayMovimiento;
    }
}
