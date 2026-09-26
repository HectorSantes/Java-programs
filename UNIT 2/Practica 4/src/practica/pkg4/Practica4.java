
package practica.pkg4;

/**
 *
 * //Hector Caleb Mosqeuda Santes N°25260872
 */
public class Practica4 {

    public static void main(String[] args) {
        MostrarNumeros(5);
    }
 public static void MostrarNumeros(int numero){
     if(numero<=0){
         System.out.println("Programa terminado");
     }else{
         System.out.println(numero);
         MostrarNumeros(numero-1);
         
     }
 
 }
}
