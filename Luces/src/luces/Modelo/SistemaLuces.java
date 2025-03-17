
package luces.Modelo;

import java.util.ArrayList;

public class SistemaLuces {
    private boolean esDeNoche;
    private SensorMovimiento sensorMovimiento;
    private Luz[] luces;  

    public SistemaLuces(int cantidadLuces) {
        this.esDeNoche = false;  
        this.sensorMovimiento = new SensorMovimiento();
        this.luces = new Luz[cantidadLuces];

        // Inicializamos las luces
        for (int i = 0; i < cantidadLuces; i++) {
            luces[i] = new Luz();  
        }
    }

    
    public void simularMovimiento(boolean hayMovimiento) {
        sensorMovimiento.detectarMovimiento(hayMovimiento);  
    }

    
    public void controlarLuces() {
        for (Luz luz : luces) {
            if (esDeNoche && sensorMovimiento.detectar()) {
                luz.encender();  
            } else {
                luz.apagar();  
            }
        }
    }

    
    public void cambiarHora(boolean esDeNoche) {
        this.esDeNoche = esDeNoche;
    }

    
    public ArrayList<Luz> obtenerEstadoLuces() {
        ArrayList<Luz> lucesEstado = new ArrayList<>();
        for (Luz luz : luces) {
            lucesEstado.add(luz);  
        }
        return lucesEstado;
    }

   
    public void mostrarEstado() {
        ArrayList<Luz> lucesEstado = obtenerEstadoLuces();
        for (int i = 0; i < lucesEstado.size(); i++) {
            System.out.println("Luz " + (i + 1) + ": " + lucesEstado.get(i).toString());
        }
    }
}
