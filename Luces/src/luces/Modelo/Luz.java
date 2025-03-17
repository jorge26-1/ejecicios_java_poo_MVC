
package luces.Modelo;






public class Luz {
    private boolean encendida;

    public Luz() {
        this.encendida = false; 
    }

    public boolean isEncendida() {
        return encendida;
    }

    public void encender() {
        this.encendida = true;
    }

    public void apagar() {
        this.encendida = false;
    }

    @Override
    public String toString() {
        return encendida ? "ENCENDIDA" : "APAGADA";  
    }
}
