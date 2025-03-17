
package calculadora_matematica.modelo;

public class Operaciones {

    private String nombreOperacion;  // Nombre de la operación (suma, resta, etc.)
    private double resultado;  // Resultado de la operación

    
    public Operaciones(String nombreOperacion, double resultado) {
        this.nombreOperacion = nombreOperacion;
        this.resultado = resultado;
    }

    
    public String getNombreOperacion() {
        return nombreOperacion;
    }

    public double getResultado() {
        return resultado;
    }

    @Override
    public String toString() {
        return "Operación: " + nombreOperacion + ", Resultado: " + resultado;
    }
}
