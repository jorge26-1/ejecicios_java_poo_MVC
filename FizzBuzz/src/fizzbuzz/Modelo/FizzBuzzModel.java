
package fizzbuzz.Modelo;





public class FizzBuzzModel {
    private String[] resultados;

    public FizzBuzzModel() {
        resultados = new String[100];
    }

    public String[] getResultados() {
        return resultados;
    }

    public void generarFizzBuzz() {
        
        for (int i = 0; i < 100; i++) {
            int num = i + 1; 
            if (num % 3 == 0 && num % 5 == 0) {
                resultados[i] = "FizzBuzz"; 
            } else if (num % 3 == 0) {
                resultados[i] = "Fizz"; 
            } else if (num % 5 == 0) {
                resultados[i] = "Buzz"; 
            } else {
                resultados[i] = String.valueOf(num); 
            }
        }
    }
}

