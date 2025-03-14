package cine1.modelo;

public class Usuario {
    private Persona persona;

    public Usuario(Persona persona) {
        this.persona = persona;
    }

    public boolean hacerReserva(Sala sala) {
        if (!sala.haySillasDisponibles()) {
            return false; 
        } else {
            return sala.hacerReserva(persona);
        }
    }

    public void mostrarReserva(Sala sala) {
        sala.mostrarEstado();
    }

    public void reiniciarSala(Sala sala) {
        sala.reiniciarSala();
    }
}

