public class PaseoEstudiantes {
  // Método estático que calcula el número de buses necesarios
  public static int calcularBusesNecesarios(int sillasPorBus, int estudiantesGordos, int estudiantesFlacos) {
      // Calcula el número total de sillas necesarias
      int sillasNecesarias = (estudiantesGordos * 2) + estudiantesFlacos;
      
      // Calcula el número de buses necesarios (redondeando hacia arriba)
      int busesNecesarios = (int) Math.ceil((double) sillasNecesarias / sillasPorBus);
      
      return busesNecesarios;
  }

  public static void main(String[] args) {
      // Datos de ejemplo: número de sillas por bus, estudiantes gordos y estudiantes flacos
      int sillasPorBus = 50;
      int estudiantesGordos = 20;
      int estudiantesFlacos = 30;

      // Calcula el número de buses necesarios
      int buses = calcularBusesNecesarios(sillasPorBus, estudiantesGordos, estudiantesFlacos);

      // Imprime el resultado
      System.out.println("Número de buses necesarios: " + buses);
  }
}
