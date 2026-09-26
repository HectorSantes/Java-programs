package practica.pkg12;

/**
 *
 * //Hector Caleb Mosqueda Santes N°25260872
 */
public class Practica12 {

    public static void main(String[] args) {
        
        //descendente
        int numero = 5;
        if (numero <= 0) {
            System.out.println("Programa terminado");
        } else {
            for (int i = 0; i <= numero; i++) {
                int operacionDescendente = numero - i;
                System.out.println(operacionDescendente);
            }
        }

        //ascendente (1, 20)
        int numero2 = 1;
        int limite = 20;
        if (numero2 > limite) {
            System.out.println("Programa terminado");
        } else {
            for (int i2 = numero2; i2 <= limite; i2++) {
                System.out.println(i2);
            }
        }
    }
}