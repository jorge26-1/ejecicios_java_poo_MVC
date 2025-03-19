
package controlaccesotienda_.Modelo;





public class Cliente {
    private boolean tieneMembresia;
    private boolean esEmpleado;
    private int horaAcceso;

    public Cliente(boolean tieneMembresia, boolean esEmpleado, int horaAcceso) {
        this.tieneMembresia = tieneMembresia;
        this.esEmpleado = esEmpleado;
        this.horaAcceso = horaAcceso;
    }

    public boolean puedeAcceder() {
        boolean horaValida = (horaAcceso >= 9 && horaAcceso <= 18); 
        return (tieneMembresia && horaValida) || esEmpleado;
    }

    public boolean isTieneMembresia() {
        return tieneMembresia;
    }

    public boolean isEsEmpleado() {
        return esEmpleado;
    }

    public int getHoraAcceso() {
        return horaAcceso;
    }

    @Override
    public String toString() {
        return "Cliente [Membresía: " + tieneMembresia + ", Empleado: " + esEmpleado + ", Hora: " + horaAcceso + "]";
    }
}


    

