
package sensormovimiento.Modelo;




public class Hora {
    private boolean esDeNoche;

    public Hora() {
        this.esDeNoche = false; // Por defecto, es de día
    }

    public boolean esDeNoche() {
        return esDeNoche;
    }

    public void cambiarHora(boolean esDeNoche) {
        this.esDeNoche = esDeNoche;
    }

    public void mostrarHora() {
        if (esDeNoche) {
            System.out.println("Es de noche.");
        } else {
            System.out.println("Es de día.");
        }
    }
}

