

package cine1.modelo;

public class Sala {
    private String nombre;
    private Silla[] sillas;

    public Sala(String nombre, int cantidadSillas) {
        this.nombre = nombre;
        this.sillas = new Silla[cantidadSillas];
        for (int i = 0; i < cantidadSillas; i++) {
            sillas[i] = new Silla(i + 1);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public boolean haySillasDisponibles() {
        for (Silla silla : sillas) {
            if (!silla.estaOcupada()) {
                return true;
            }
        }
        return false;
    }

    public boolean hacerReserva(Persona persona) {
        for (Silla silla : sillas) {
            if (!silla.estaOcupada()) {
                silla.ocupar();
                System.out.println("Reserva exitosa para " + persona.getNombre() + ". Silla número: " + silla.getNumero());
                return true;
            }
        }
        return false;
    }

    public void mostrarEstado() {
        System.out.println("Estado de la sala " + nombre + ":");
        for (Silla silla : sillas) {
            System.out.println("Silla " + silla.getNumero() + " - " + (silla.estaOcupada() ? "Ocupada" : "Disponible"));
        }
    }

    public void reiniciarSala() {
        for (Silla silla : sillas) {
            silla.liberar();
        }
        System.out.println("La sala ha sido reiniciada.");
    }
}
