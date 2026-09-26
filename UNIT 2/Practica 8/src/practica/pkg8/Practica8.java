package practica.pkg8;
import java.util.Scanner;

/**
 *
 * //Hector Caleb Mosqueda Santes N° control:25260872
 */
public class Practica8 {

    
    public static void main(String[] args) {
        String P ;
     Scanner scan=new Scanner(System.in);
        System.out.println("Agrega una palabra");P= scan.nextLine();
        //int t= P.length();       
        /*
        System.out.println(P);
        System.out.println("Caracteristicas\n"+P );sau
        System.out.println(""+P.length());
        System.out.println(""+P.charAt(0));
        System.out.println(""+P.charAt(1));
        System.out.println(""+P.charAt(2));
        System.out.println(""+P.charAt(3));
        System.out.println(""+P.charAt(4));
        System.out.println(""+P.charAt(P.length()-1));
*/
        int c=P.length();
        invertir(P, c-1);
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
