
package luces.Modelo;

import java.util.ArrayList;

public class SistemaLuces {
    private boolean esDeNoche;
    private SensorMovimiento sensorMovimiento;
    private Luz[] luces;  // Arreglo de luces

    public SistemaLuces(int cantidadLuces) {
        this.esDeNoche = false;  // Inicialmente no es de noche
        this.sensorMovimiento = new SensorMovimiento();
        this.luces = new Luz[cantidadLuces];

        // Inicializamos las luces
        for (int i = 0; i < cantidadLuces; i++) {
            luces[i] = new Luz();  // Todas las luces inicialmente están apagadas
        }
    }

    // Método para simular el movimiento
    public void simularMovimiento(boolean hayMovimiento) {
        sensorMovimiento.detectarMovimiento(hayMovimiento);  // Simulamos el movimiento
    }

    // Método para controlar las luces (dependiendo del sensor y la hora)
    public void controlarLuces() {
        for (Luz luz : luces) {
            if (esDeNoche && sensorMovimiento.detectar()) {
                luz.encender();  // Si es de noche y hay movimiento, encendemos las luces
            } else {
                luz.apagar();  // Si no hay movimiento o no es de noche, apagamos las luces
            }
        }
    }

    // Método para cambiar la hora (día o noche)
    public void cambiarHora(boolean esDeNoche) {
        this.esDeNoche = esDeNoche;
    }

    // Método para obtener el estado de todas las luces
    public ArrayList<Luz> obtenerEstadoLuces() {
        ArrayList<Luz> lucesEstado = new ArrayList<>();
        for (Luz luz : luces) {
            lucesEstado.add(luz);  // Agregar cada luz al ArrayList
        }
        return lucesEstado;
    }

    // Método para mostrar el estado de las luces
    public void mostrarEstado() {
        ArrayList<Luz> lucesEstado = obtenerEstadoLuces();
        for (int i = 0; i < lucesEstado.size(); i++) {
            System.out.println("Luz " + (i + 1) + ": " + lucesEstado.get(i).toString());
        }
    }
}
