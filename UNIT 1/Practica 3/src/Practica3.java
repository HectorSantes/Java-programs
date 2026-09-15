import java.util.Scanner;

public class Practica3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese el primer número entero positivo: ");
        int a = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero positivo: ");
        int b = scanner.nextInt();

        System.out.print("Ingrese el tercer número entero positivo: ");
        int c = scanner.nextInt();

        // Proceso y evaluación de la condición
        if (a == b + c || b == a + c || c == a + b) {
            System.out.println("Cumple: Uno de los números es la suma de los otros dos.");
        } else {
            System.out.println("No cumple: Ningún número es la suma de los otros dos.");
        }

        scanner.close();
    }
}
