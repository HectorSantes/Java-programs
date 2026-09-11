import java.util.Scanner;

public class Practica10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int a = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int b = scanner.nextInt();

        System.out.print("Ingresa el tercer número: ");
        int c = scanner.nextInt();

        int central;

        // Evaluamos las condiciones para encontrar el número del medio
        if ((a >= b && a <= c) || (a <= b && a >= c)) {
            central = a;
        } else if ((b >= a && b <= c) || (b <= a && b >= c)) {
            central = b;
        } else {
            central = c;
        }

        System.out.println("El número central es: " + central);
        
        scanner.close();
    }
}
