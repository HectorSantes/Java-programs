package repaso5;

/**
 *
 * Hector Caleb Mosqueda Santes N° control 25260872
 */
public class Repaso5 {

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Ascendente:");
        mostrarParesAscendente(1, n);
        System.out.println("\nDescendente:");
        mostrarParesDescendente(n);
    }

    // Metodo 1: pares de 1 hasta n, subiendo
    public static void mostrarParesAscendente(int actual, int n) {
        if (actual > n) {            // caso base
            return;
        }
        if (actual % 2 == 0) {
            System.out.print(actual + " ");
        }
        mostrarParesAscendente(actual + 1, n);
    }

    // Metodo 2: pares desde n hasta 1, bajando
    public static void mostrarParesDescendente(int n) {
        if (n <= 0) {                // caso base
            return;
        }
        if (n % 2 == 0) {
            System.out.print(n + " ");
        }
        mostrarParesDescendente(n - 1);
    }
}