/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.pkg13;

/**
 *
 * //Hector Caleb Mosqueda Santes N° control:25260872
 */
public class Practica13 {

    public static void main(String[] args) {   
        long factorial = calcularFactorial(4);
                //4*3*2*1=24
        System.out.println("El factorial de 4 es:" + factorial + "\n");         
    }

    public static long calcularFactorial(int valor) {
        long resultado = 1;
        for (int i = 2; i <= valor; i++) {
            resultado *= i;
        }
        return resultado;
    }
}