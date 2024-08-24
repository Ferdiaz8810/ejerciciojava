import java.util.Scanner;

public class CoronaCircular {

    // Función que calcula el área de un círculo
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    // Función que calcula el área de la corona circular
    public static double calcularAreaCoronaCircular(double radioGrande, double radioPequeno) {
        double areaCirculoGrande = calcularAreaCirculo(radioGrande);
        double areaCirculoPequeno = calcularAreaCirculo(radioPequeno);
        return areaCirculoGrande - areaCirculoPequeno;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer los radios
        System.out.print("Ingrese el radio pequeño (r): ");
        double radioPequeno = scanner.nextDouble();
        
        System.out.print("Ingrese el radio grande (R): ");
        double radioGrande = scanner.nextDouble();

        // Calcular el área de la corona circular
        double areaCorona = calcularAreaCoronaCircular(radioGrande, radioPequeno);

        // Mostrar el resultado
        System.out.println("El área de la corona circular es: " + areaCorona);

        scanner.close();
    }
}

