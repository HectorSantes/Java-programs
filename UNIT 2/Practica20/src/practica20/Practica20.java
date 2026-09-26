package practica20;

import java.util.Scanner;

/**
 *
 * //Hector Caleb Mosqueda Santes N° control:25260872
 */
public class Practica20 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingresa el numero de terminos: ");
        int n = scan.nextInt();

        int suma = sumarFibonacci(n);
        System.out.println("La suma de los primeros " + n + " terminos de Fibonacci es: " + suma);
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

    // Método recursivo para sumar los términos de la serie
    public static int sumarFibonacci(int n) {
        if (n <= 0) {
            return 0;
        }
        return fibonacci(n - 1) + sumarFibonacci(n - 1);
    }
}