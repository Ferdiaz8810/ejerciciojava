import java.util.Scanner;

public class GastoPedro {

    // Función que calcula el gasto en arriendo
    public static double calcularGastoArriendo(double sueldo) {
        return sueldo * 0.40;
    }

    // Función que calcula el gasto en comida
    public static double calcularGastoComida(double sueldo) {
        return sueldo * 0.15;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el sueldo de Pedro
        System.out.print("Ingrese el sueldo de Pedro: ");
        double sueldo = scanner.nextDouble();

        // Calcular gastos
        double gastoArriendo = calcularGastoArriendo(sueldo);
        double gastoComida = calcularGastoComida(sueldo);
        double dineroRestante = sueldo - (gastoArriendo + gastoComida);

        // Mostrar resultados
        System.out.println("Gasto en arriendo: " + gastoArriendo);
        System.out.println("Gasto en comida: " + gastoComida);
        System.out.println("Dinero restante: " + dineroRestante);

        scanner.close();
    }
}
