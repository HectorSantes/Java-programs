package practica.pkg14;

import java.util.Scanner;

/**
 *
 * //Hector Caleb Mosqueda Santes N° control:25260872
 */
public class Practica14 {

    public static void main(String[] args) {
        String P;
        Scanner scan = new Scanner(System.in);
        System.out.println("Agrega una palabra");
        P = scan.nextLine();

        System.out.println(P);
        System.out.println("Caracteristicas\n" + P);
        System.out.println("Longitud: " + P.length());

        // Recorrido de los caracteres mediante un ciclo for
        for (int i = 0; i < P.length(); i++) {
            System.out.println("" + P.charAt(i));
        }

        System.out.println("Último carácter: " + P.charAt(P.length() - 1));
        scan.close();
    }
}