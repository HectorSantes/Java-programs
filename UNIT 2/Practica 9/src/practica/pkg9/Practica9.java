package practica.pkg9;

import java.util.Scanner;

public class Practica9 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Agrega un numero: ");

        int numero = entrada.nextInt();

        int resultado = sumar(numero);

        System.out.println("La suma recursiva es: " + resultado);
    }

    public static int sumar(int n) {

        if (n == 0) {
            return 0;
        }

        return n + sumar(n - 1);
    }
}