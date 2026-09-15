import java.util.Scanner;

public class Practica9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sumaPares = 0;
        int contadorPares = 0;
        int sumaImpares = 0;
        int contadorImpares = 0;
        
        System.out.println("Por favor, ingresa 20 números enteros:");
        
        for (int i = 1; i <= 20; i++) {
            System.out.print("Número " + i + ": ");
            int numero = scanner.nextInt();
            
            if (numero % 2 == 0) {
                sumaPares += numero;
                contadorPares++;
            } else {
                sumaImpares += numero;
                contadorImpares++;
            }
        }
        
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("La suma de los números pares es: " + sumaPares);
        System.out.println("La cantidad de números pares existentes es: " + contadorPares);
        
        if (contadorImpares > 0) {
            double mediaImpares = (double) sumaImpares / contadorImpares;
            System.out.println("La media aritmética de los impares es: " + mediaImpares);
        } else {
            System.out.println("No se ingresaron números impares para calcular su media.");
        }
        
        scanner.close();
    }
}
