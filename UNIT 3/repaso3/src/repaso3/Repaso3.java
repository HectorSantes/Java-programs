
package repaso3;

/**
 *
 * Hector Caleb Mosqueda Santes N° control:25260872
 */
public class Repaso3 {

    
    public static void main(String[] args) {
        mostrar(1);
    }
    public static void mostrar(int n) {
    System.out.print(n + " ");
    if (n > 1)
        mostrar(n - 1);
    else
        mostrar(n);
}
}
