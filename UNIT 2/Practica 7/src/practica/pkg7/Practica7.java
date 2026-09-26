package practica.pkg7;
import java.util.Scanner;

/**
 *
 * //Hector Caleb Mosqueda Santes N° control:25260872
 */
public class Practica7 {

    
    public static void main(String[] args) {
        String P ;
     Scanner scan=new Scanner(System.in);
        System.out.println("Agrega una palabra");P= scan.nextLine();
        //int t= P.length();       
        System.out.println(P);
        System.out.println("Caracteristicas\n"+P );
        System.out.println(""+P.length());
        System.out.println(""+P.charAt(0));
        System.out.println(""+P.charAt(1));
        System.out.println(""+P.charAt(2));
        System.out.println(""+P.charAt(3));
        System.out.println(""+P.charAt(4));
        System.out.println(""+P.charAt(P.length()-1));
        
    }
    
}
