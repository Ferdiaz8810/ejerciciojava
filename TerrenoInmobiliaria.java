import java.util.Scanner;

public class TerrenoInmobiliaria {

    // Función para calcular el área de un rectángulo
    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    // Función para calcular la hipotenusa de un triángulo rectángulo
    public static double calcularHipotenusa(double cateto1, double cateto2) {
        return Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
    }

    // Función para calcular el área de un triángulo
    public static double calcularAreaTriangulo(double base, double altura) {
        return 0.5 * base * altura;
    }

    // Función para calcular el perímetro del terreno
    public static double calcularPerimetro(double ladoA, double ladoB, double ladoC) {
        // Encontrar la hipotenusa del triángulo rectángulo
        double hipotenusa = calcularHipotenusa(ladoA, ladoB);
        // El perímetro es la suma de todos los lados
        return ladoA + ladoB + hipotenusa;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer las dimensiones de los lados del terreno
        System.out.print("Ingrese el lado A del triángulo rectángulo: ");
        double ladoA = scanner.nextDouble();
        
        System.out.print("Ingrese el lado B del triángulo rectángulo: ");
        double ladoB = scanner.nextDouble();
        
        System.out.print("Ingrese el lado C del triángulo rectángulo (es la hipotenusa): ");
        double ladoC = scanner.nextDouble();

        // Calcular la hipotenusa (si no es igual a ladoC)
        double hipotenusa = calcularHipotenusa(ladoA, ladoB);

        // Calcular el área del triángulo rectángulo
        double areaTriangulo = calcularAreaTriangulo(ladoA, ladoB);

        // Calcular el área del rectángulo utilizando la base y altura proporcionadas
        // Asumimos que la base y altura del rectángulo son los lados del triángulo rectángulo
        double areaRectangulo = calcularAreaRectangulo(ladoA, ladoB);

        // Calcular el perímetro del terreno
        double perimetro = calcularPerimetro(ladoA, ladoB, ladoC);

        // Mostrar los resultados
        System.out.println("Área del triángulo rectángulo: " + areaTriangulo);
        System.out.println("Área del rectángulo: " + areaRectangulo);
        System.out.println("Perímetro del terreno: " + perimetro);

        scanner.close();
    }
}
