package repaso4;

/**
 *
 *Hector Caleb Mosqueda Santes N° control:25260872
 */

public class Repaso4 {

    public static void main(String[] args) {
        int resultado = factorial(5);
        System.out.println("El factorial de 5 es: " + resultado);
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {      // caso base
            return 1;
        }
        return n * factorial(n - 1); // caso recursivo
    }
}
   