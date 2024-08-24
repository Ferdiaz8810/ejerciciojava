public class LongitudEscalera {

  // Método estático para calcular la longitud de la escalera
  public static double calcularLongitudEscalera(double altura, double anguloGrados) {
      // Convertir el ángulo de grados a radianes
      double anguloRadianes = Math.toRadians(anguloGrados);
      
      // Calcular la longitud de la escalera usando la fórmula y = x / cos(α)
      double longitudEscalera = altura / Math.cos(anguloRadianes);
      
      return longitudEscalera;
  }

  public static void main(String[] args) {
      // Ejemplo de datos: altura y ángulo
      double altura = 5.0; // en metros
      double angulo = 30.0; // en grados

      // Llamar al método para calcular la longitud de la escalera
      double longitud = calcularLongitudEscalera(altura, angulo);

      // Mostrar el resultado
      System.out.println("La longitud de la escalera es: " + longitud + " metros");
  }
}
