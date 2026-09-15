
import java.util.Scanner;

/**
 * Hector Caleb Mosqueda Santes N° control:25260872
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese nombre del videojuego: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese genero: ");
        String genero = scanner.nextLine();

        System.out.print("Ingrese año de lanzamiento: ");
        int año = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese plataforma: ");
        String plataforma = scanner.nextLine();

        System.out.print("Ingrese precio: $");
        double precio = scanner.nextDouble();

        System.out.print("Ingrese calificacion: ");
        double calificacion = scanner.nextDouble();

        System.out.println("\n--- INFORMACION DEL VIDEOJUEGO ---");
        REPASO7 juego = new REPASO7(nombre, genero, año, plataforma, precio, calificacion);

        juego.mostrarInformacion();
        juego.calcularClasico();
        juego.verificarOferta();

        System.out.println("\nAplicando descuento...");
        juego.aplicarDescuento();
        juego.verificarOferta();

        scanner.close();
    }
}