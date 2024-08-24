import java.util.Scanner;

public class AumentoSueldo {

    // Función que recibe el sueldo actual y retorna el valor del aumento
    public static double calcularAumento(double sueldo) {
        double aumento;

        if (sueldo <= 800000) {
            aumento = sueldo * 0.10;  // Aumento del 10%
        } else if (sueldo <= 1200000) {
            aumento = sueldo * 0.08;  // Aumento del 8%
        } else {
            aumento = sueldo * 0.05;  // Aumento del 5%
        }

        return aumento;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el sueldo actual del empleado: ");
        double sueldoActual = scanner.nextDouble();

        double aumento = calcularAumento(sueldoActual);
        double nuevoSueldo = sueldoActual + aumento;

        System.out.println("Valor del aumento: $" + String.format("%.2f", aumento));
        System.out.println("Nuevo salario: $" + String.format("%.2f", nuevoSueldo));

        scanner.close();
    }
}
