package practica10;
import java.util.Scanner;

/**
 *
 * //Hector Caleb Mosqueda Santes N° control:25260872
 */
public class Practica10{

    public static void main(String[] args) {
        String P ;
        Scanner scan=new Scanner(System.in);
        System.out.println("Agrega una palabra");
        P= scan.nextLine();
        
        // Llamada al método para comprobar si empieza y termina con vocal
        verificarVocales(P);

        int c=P.length();
        invertir(P, c-1);
    }
    
    // Método agregado para cumplir con la condicional de las vocales
    public static void verificarVocales(String P) {
        if (P != null && !P.isEmpty()) {
            char inicio = Character.toLowerCase(P.charAt(0));
            char fin = Character.toLowerCase(P.charAt(P.length() - 1));
            
            if ((inicio == 'a' || inicio == 'e' || inicio == 'i' || inicio == 'o' || inicio == 'u') &&
                (fin == 'a' || fin == 'e' || fin == 'i' || fin == 'o' || fin == 'u')) {
                System.out.println("La palabra empieza y termina con vocal.");
            } else {
                System.out.println("La palabra NO empieza y termina con vocal.");
            }
        }
    }

    public static void invertir (String P,int num_letras){
        if(num_letras==0){
            System.out.print(P.charAt(num_letras));
        }else{
            System.out.println(P.charAt(num_letras));
            invertir(P, num_letras-1);
        }
    }
}
