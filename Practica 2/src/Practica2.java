import java.util.Scanner;

public class Practica2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Solicitamos los 4 números al usuario
        System.out.print("Ingrese el primer número entero: ");
        int num1 = teclado.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int num2 = teclado.nextInt();

        System.out.print("Ingrese el tercer número entero: ");
        int num3 = teclado.nextInt();

        System.out.print("Ingrese el cuarto número entero: ");
        int num4 = teclado.nextInt();

        // Encontramos el mayor usando la función integrada Math.max()
        int numero_mayor = Math.max(Math.max(num1, num2), Math.max(num3, num4));

        // Mostramos el resultado con el formato solicitado
        System.out.println("El número mayor es: " + numero_mayor);

        teclado.close();
    }
}

