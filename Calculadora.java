import java.util.Scanner;

public class Calculadora {

    // Función que aplica la operación aritmética correspondiente
    public static double aplicarOperacion(int num1, int num2, String operador) {
        double resultado = 0;

        switch (operador) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    resultado = (double) num1 / num2;
                } else {
                    System.out.println("Error: División por cero.");
                    return Double.NaN;  // Retornar NaN en caso de división por cero
                }
                break;
            case "%":
                if (num2 != 0) {
                    resultado = num1 % num2;
                } else {
                    System.out.println("Error: División por cero.");
                    return Double.NaN;  // Retornar NaN en caso de división por cero
                }
                break;
            case "**":
                resultado = Math.pow(num1, num2);
                break;
            default:
                System.out.println("Error: Operador no reconocido.");
                return Double.NaN;  // Retornar NaN en caso de operador no válido
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer dos números enteros
        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();
        
        // Leer el operador
        System.out.print("Ingrese el operador (+, -, *, /, %, **): ");
        String operador = scanner.next();

        // Usar la función para calcular el resultado
        double resultado = aplicarOperacion(numero1, numero2, operador);

        // Mostrar el resultado
        if (!Double.isNaN(resultado)) {  // Mostrar solo si no hubo error
            System.out.println("El resultado es: " + resultado);
        }

        scanner.close();
    }
}
