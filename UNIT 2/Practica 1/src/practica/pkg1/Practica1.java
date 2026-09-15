package practica.pkg1;
import java.util.Scanner;

//Hector Caleb MOsqueda Santes N°control:25260872
public class Practica1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double n1, n2;
        double suma, resta, division, multi;

        int operacion, numero = 0;

        do {
            System.out.println("Bienvenido a la calculadora \n");
             System.out.println("Ingrese sus dos numeros para continuar");
            System.out.println("Ingresa el numero 1:");
            n1 = entrada.nextDouble();

            System.out.println("Ingrese el numero 2:");
            n2 = entrada.nextDouble();

            System.out.println("Ingrese la operacion que desee realizar \n 1 + Suma , 2 + Resta, 3 + Multiplicacion, 4 + Division");
            operacion = entrada.nextInt();

            switch (operacion) {
                case 1:
                    suma =n1 + n2;
                    System.out.println("El resultado es: " + suma);
                    break;
                case 2:
                    resta =n1 - n2;
                    System.out.println("El resultado es: " + resta);
                    break;
                case 3:
                    multi =n1 * n2;
                    System.out.println("El resultado es: " + multi);
                    break;
                case 4:
                    division =n1 / n2;
                    System.out.println("El resultado es: " + division);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

            System.out.println("Desea seguir continuado?");
            numero=entrada.nextInt();

        } while (numero == 1);

    }
}