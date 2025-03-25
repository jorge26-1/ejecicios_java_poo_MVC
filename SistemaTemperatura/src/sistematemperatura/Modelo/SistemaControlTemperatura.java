
package sistematemperatura.Modelo;

public class SistemaControlTemperatura {

    public void controlarTemperatura(double temperatura) {
        if (temperatura < 10) {
            System.out.println("La temperatura es " + temperatura + "°C. Activando calefactor...");
        } else if (temperatura >= 10 && temperatura <= 25) {
            System.out.println("La temperatura es " + temperatura + "°C. Sistema inactivo.");
        } else {
            System.out.println("La temperatura es " + temperatura + "°C. Activando ventilador...");
        }
    }

    public void controlarTemperaturas(double[] temperaturas) {
        for (double temperatura : temperaturas) {
            controlarTemperatura(temperatura);
        }
    }
}

