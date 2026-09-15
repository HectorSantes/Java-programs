package Medialistindef;
    import java.util.Scanner;

public class Num11 {
     public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int contador = 0;

        System.out.println("Introduce numeros positivos, termina con uno negativo:");
        int numero = scanner.nextInt();

        while(numero >= 0){
            suma += numero;
            contador++;
            numero=scanner.nextInt();
        }

        if (contador > 0){
            double media =(double) suma / contador;
            System.out.println("la media de los numeros positivos introducidos es: " + media);
        }else{
            System.out.println("no se introdujeron numeros positivos para calcular la media");
        }
        scanner.close();
     }
}
