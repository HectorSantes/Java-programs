import java.util.Scanner;

public class Practica12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int pisoActual = 1;
        int opcion = 0;

        System.out.println("=== SIMULADOR DE ASCENSOR (25 PISOS) ===");

        do {
            System.out.println("\n----------------------------------------");
            System.out.println("Piso actual del ascensor: " + pisoActual);
            System.out.println("----------------------------------------");
            System.out.println("1. Llamar o mover el ascensor a un piso");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.print("Ingrese el piso al que desea ir (1 al 25): ");
                int pisoDestino = scanner.nextInt();

                // Validar rango de pisos
                if (pisoDestino < 1 || pisoDestino > 25) {
                    System.out.println("Error: El piso debe estar entre 1 y 25.");
                    continue;
                }

                // Validar restricciones de los extremos (simulando la lógica del botón)
                if (pisoDestino == 1 && pisoActual > 1) {
                    System.out.println("Nota: Desde el piso 1 solo se puede llamar para SUBIR.");
                } else if (pisoDestino == 25 && pisoActual < 25) {
                    System.out.println("Nota: Desde el piso 25 solo se puede llamar para BAJAR.");
                }

                // Simular el movimiento del ascensor paso a paso
                if (pisoDestino > pisoActual) {
                    System.out.println("\nSubiendo...");
                    while (pisoActual < pisoDestino) {
                        pisoActual++;
                        System.out.println("-> Pasando por el piso " + pisoActual);
                    }
                } else if (pisoDestino < pisoActual) {
                    System.out.println("\nBajando...");
                    while (pisoActual > pisoDestino) {
                        pisoActual--;
                        System.out.println("-> Pasando por el piso " + pisoActual);
                    }
                } else {
                    System.out.println("Ya te encuentras en el piso " + pisoActual);
                }

                System.out.println(">>> ¡Llegaste al destino! Puertas abiertas en el piso " + pisoActual + " <<<");

            } else if (opcion != 2) {
                System.out.println("Opción no válida.");
            }

        } while (opcion != 2);

        System.out.println("Saliendo del simulador. ¡Hasta luego!");
        scanner.close();
    }
}
