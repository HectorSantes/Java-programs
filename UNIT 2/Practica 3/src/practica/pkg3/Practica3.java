package practica.pkg3;
import java.util.Scanner;

//Hector Caleb MOsqueda Santes N°control:25260872
public class Practica3{
public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double sueldo, nuevoSueldo;

        System.out.println("Ingresa el sueldo del trabajador: ");
        sueldo = entrada.nextDouble();

        if (sueldo < 1000) {
            nuevoSueldo = sueldo*1.15;
        } else {
            nuevoSueldo = sueldo*1.12;
        }

        System.out.println("El sueldo nuevo es: " + nuevoSueldo);

    }
}