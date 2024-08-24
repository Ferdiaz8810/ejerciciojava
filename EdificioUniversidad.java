import java.util.Scanner;

public class EdificioUniversidad {

    // Función que calcula el número de salones necesarios
    public static int calcularNumeroSalones(int numeroEstudiantes, int capacidadSalon) {
        // Se utiliza el techo de la división para asegurar que haya suficiente espacio para todos los estudiantes
        return (int) Math.ceil((double) numeroEstudiantes / capacidadSalon);
    }

    // Función que calcula el número de pisos necesarios
    public static int calcularNumeroPisos(int numeroSalones, int salonesPorPiso) {
        // Se utiliza el techo de la división para asegurar que haya suficiente espacio para todos los salones
        return (int) Math.ceil((double) numeroSalones / salonesPorPiso);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer los datos desde el teclado
        System.out.print("Ingrese el número de estudiantes en la universidad: ");
        int numeroEstudiantes = scanner.nextInt();
        
        System.out.print("Ingrese la capacidad de un salón: ");
        int capacidadSalon = scanner.nextInt();
        
        System.out.print("Ingrese el número de salones por piso: ");
        int salonesPorPiso = scanner.nextInt();

        // Calcular el número de salones necesarios
        int numeroSalones = calcularNumeroSalones(numeroEstudiantes, capacidadSalon);
        
        // Calcular el número de pisos necesarios
        int numeroPisos = calcularNumeroPisos(numeroSalones, salonesPorPiso);

        // Mostrar los resultados
        System.out.println("El número de salones necesarios es: " + numeroSalones);
        System.out.println("El número de pisos necesarios es: " + numeroPisos);

        scanner.close();
    }
}
