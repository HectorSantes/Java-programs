package practica19;

import java.util.Scanner;

/**
 *
 * //Hector Caleb Mosqueda Santes N° control:25260872
 */
public class Practica19 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingresa el numero de terminos: ");
        int n = scan.nextInt();

        System.out.println("Serie de Fibonacci:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
        scan.close();
    }

    // Método recursivo para calcular el término n de Fibonacci
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}