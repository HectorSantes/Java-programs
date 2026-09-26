package practica.pkg15;

import java.util.Scanner;

/**
 *
 * //Hector Caleb Mosqueda Santes N° control:25260872
 */
public class Practica15 {

    public static void main(String[] args) {
        String P;
        Scanner scan = new Scanner(System.in);
        System.out.println("Agrega una palabra");
        P = scan.nextLine();

        int c = P.length();
        invertir(P, c - 1);
        scan.close();
    }

    public static void invertir(String P, int num_letras) {
        for (int i = num_letras; i >= 0; i--) {
            System.out.println(P.charAt(i));
        }
    }
}