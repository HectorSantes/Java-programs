/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.pkg6;

/**
 *
 * //Hector Caleb Mosqueda Santes N° control:25260872
 */
public class Practica6 {

   
    public static void main(String[] args) {   
        long factorial =calcularFactorial(4);
                //4*3*2*1=24
        System.out.println("El factorial de 4 es:"+factorial+"\n");         
                
    }
    public static long calcularFactorial(int valor){
      if(valor==0 || valor==1){
      return 1;
      }else{
      return valor*calcularFactorial(valor-1);
              }
       
    
    }
}
