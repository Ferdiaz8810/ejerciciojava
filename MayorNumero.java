import java.util.Scanner;

public class MayorNumero {

    // Función que retorna el mayor de dos números enteros
    public static int encontrarMayor(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer dos números enteros
        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        // Usar la función para encontrar el mayor número
        int mayor = encontrarMayor(numero1, numero2);

        // Imprimir el mayor número
        System.out.println("El mayor de los dos números es: " + mayor);

        scanner.close();
    }
}

