import java.util.Scanner;

/**
 * Nombre del Alumno: HECTOR CALEB MOSQUEDA SANTES
 * Número de Control: 25260872
 */
public class REPASO1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println(" Bienvenido al Sistema de Registro de Estudiantes ");
        System.out.println("==================================================");        
        String nombre;
        String apellido;
        int edad;
        System.out.print("Ingrese su nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Ingrese su apellido: ");
        apellido = scanner.nextLine();
        System.out.print("Ingrese su edad: ");
        edad = scanner.nextInt();
        System.out.println("\n--------------------------------------------------");
        System.out.println("INFORMACION CAPTURADA:");
        System.out.println("Nombre completo: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad + " años");
        System.out.println("--------------------------------------------------");
        scanner.close();
    }
}