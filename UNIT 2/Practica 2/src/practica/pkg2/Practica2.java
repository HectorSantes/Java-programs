package practica.pkg2;

import java.util.Scanner;

//Hector Caleb Mosqueda Santes N°control:25260872
public class Practica2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String contraseña;
        int intentos = 0;
do {
  System.out.println("Ingresa la contrasena: ");
    contraseña= entrada.nextLine();
       intentos++;

    if (contraseña.equals("tecMatamoros")) {
      System.out.println("Contraseña Correcta");
          break;
     } 
    else {
   System.out.println("Contrasena incorrecta");
            }

        } 
    while (intentos < 3);
     if (intentos == 3) {
            if (!contraseña.equals("tecMatamoros")) {
                System.out.println("Demasiados intentos fallidos, usted no es el dueño original");
            }
        }

    }
}