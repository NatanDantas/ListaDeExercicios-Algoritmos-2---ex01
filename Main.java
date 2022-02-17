
class Main {
  public static void main(String[] args) {
    int vetorA[] = { 7, 2, 5, 8, 4 };
    int vetorB[] = { 4, 2, 9, 5 };
    String resultado = intersecta(vetorA, vetorB);
    System.out.println("Resultado: " + resultado);
  }

  public static String intersecta(int[] a, int[] b) {
    String resultado = "";
    int aux = 0;
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < b.length; j++) {
        if (a[i] == b[j]) {
          resultado += a[i] + " ";
        }
      }
    }
    return resultado;
  }
}