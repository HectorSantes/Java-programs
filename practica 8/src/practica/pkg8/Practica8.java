
package practica.pkg8;
import java.util.Scanner;
/**
 *
 * Hector Caleb Mosqueda Santes N° control:25260872
 */
public class Practica8 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
      double [] numeros= new double[50];
     double sumatotal =0;
     
     for(int  i=0;i<50;i++){
     System.out.println("Ingrese el numero:"+(i+1)+":");
     numeros[i]=scanner.nextInt();
     sumatotal+=numeros[i];
     }
     double promedio=sumatotal/50;
     System.out.println("El promedio de la suma de sus numeros es:"+promedio);
    }
    
}
