import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese marca: ");
        String marca = scanner.nextLine();

        System.out.print("Ingrese modelo: ");
        String modelo = scanner.nextLine();

        System.out.print("Ingrese año: ");
        int año = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese color: ");
        String color = scanner.nextLine();

        System.out.print("Ingrese memoria en GB: ");
        int memoria = scanner.nextInt();

        REPASO6 celular = new REPASO6(marca, modelo, año, color, memoria);

        System.out.println("\nDATOS DEL CELULAR");
        celular.mostrarInformacion();

        int antiguedad = celular.calcularAntiguedad(2026);
        System.out.println("Antiguedad: " + antiguedad + " años");

        celular.verificarMemoria();

        scanner.close();
    }
}