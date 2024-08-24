

public class Algebra {
  // Método estático para calcular f(x, y)
  public static int calcularFuncion(int x, int y) {
      // Calcula la función f(x, y) = x^2 + 2xy + y^2
      return (x * x) + (2 * x * y) + (y * y);
  }

  public static void main(String[] args) {
      // Valores de x e y
      int x = 3;
      int y = 4;

      // Llama al método calcularFuncion y almacena el resultado
      int resultado = calcularFuncion(x, y);

      // Muestra el resultado en la consola
      System.out.println("El valor de f(" + x + ", " + y + ") es: " + resultado);
  }
}
