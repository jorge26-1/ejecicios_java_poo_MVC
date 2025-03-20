
package sensormovimiento.Modelo;





public class SistemaSeguridad {
    private GestorSensores gestorSensores;
    private Alarma alarma;
    private Hora hora;

    public SistemaSeguridad(int cantidadSensores) {
        gestorSensores = new GestorSensores(cantidadSensores);
        alarma = new Alarma();
        hora = new Hora();
    }

    public void leerSensores() {
        gestorSensores.leerSensores(); 
        int sensoresActivos = gestorSensores.contarSensoresActivos(); 

        System.out.println("Sensores activos: " + sensoresActivos);

        
        if (sensoresActivos >= 2 && hora.esDeNoche()) {
            alarma.activar();
        } else {
            alarma.desactivar();
        }
    }

    public void cambiarEstadoAlarma() {
        if (alarma.isAlarmaActivada()) {
            alarma.desactivar();
        } else {
            alarma.activar();
        }
    }

    public void mostrarEstado() {
        alarma.mostrarEstado();
    }

    public void cambiarHora(boolean esDeNoche) {
        hora.cambiarHora(esDeNoche);
    }

    public void mostrarHora() {
        hora.mostrarHora();
    }
}
