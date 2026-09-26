
package practica.pkg5;

/**
 *
 * //Hector Caleb Mosqeuda Santes N°25260872
 */
public class Practica5 {
  
    public static void main(String[] args) {
     //forma1   
        MostrarDescendente(5);
        mostrarAscendente(1, 20);
    }
    
    //1er recursivo
 public static void MostrarDescendente(int numero){
     if(numero<=0){ //caso base
         //caso recursivo
         System.out.println("Programa terminado");
     }else{
         System.out.println(numero);
         MostrarDescendente(numero-1);
         
     }
 
 }
 //2do recursivo
 public static void mostrarAscendente(int numero, int limite){
 if (numero>limite){
 System.out.println("Terminado");
 }else{
     System.out.println(numero);
     mostrarAscendente(numero +1, limite);
 
 }
     }
}
