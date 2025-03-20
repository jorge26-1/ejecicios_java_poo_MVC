
package sensormovimiento.Modelo;



public class Alarma {
    private boolean alarmaActivada;

    public Alarma() {
        this.alarmaActivada = false;
    }

    public boolean isAlarmaActivada() {
        return alarmaActivada;
    }

    public void activar() {
        this.alarmaActivada = true;
    }

    public void desactivar() {
        this.alarmaActivada = false;
    }

    public void mostrarEstado() {
        if (alarmaActivada) {
            System.out.println("¡Alarma activada! Intruso detectado.");
        } else {
            System.out.println("Alarma desactivada.");
        }
    }
}
