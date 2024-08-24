import java.util.Scanner;

public class DiaDeManana {

    // Función que recibe el nombre de un día y retorna el nombre del día de mañana
    public static String obtenerDiaDeManana(String dia) {
        dia = dia.toLowerCase();  // Convertir a minúsculas para evitar problemas con la entrada del usuario

        switch (dia) {
            case "lunes": return "martes";
            case "martes": return "miércoles";
            case "miércoles": return "jueves";
            case "jueves": return "viernes";
            case "viernes": return "sábado";
            case "sábado": return "domingo";
            case "domingo": return "lunes";
            default: return "Día inválido";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre de un día: ");
        String dia = scanner.nextLine();

        String diaDeManana = obtenerDiaDeManana(dia);

        if (diaDeManana.equals("Día inválido")) {
            System.out.println("Error: El nombre del día ingresado no es válido.");
        } else {
            System.out.println("El día de mañana es: " + diaDeManana);
        }

        scanner.close();
    }
}
