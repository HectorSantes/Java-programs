package practica.pkg16;

import java.util.Scanner;

/**
 *
 * //Hector Caleb Mosqueda Santes N° control:25260872
 */
public class Practica16 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Agrega un numero: ");

        int numero = entrada.nextInt();

        int resultado = sumar(numero);

        System.out.println("La suma es: " + resultado);
        entrada.close();
    }

    public static int sumar(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }
}