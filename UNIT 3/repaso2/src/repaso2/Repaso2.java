package repaso2;

/**
 *
 * Hector Caleb Mosqueda Santes N° control:25260872
 */
public class Repaso2 {

    /**
     * 
     * 
     */
    public static void main(String[] args) {
        mostrar(3);
    }
   public static void mostrar(int n) {
    if (n == 0) {
        return;
    }
    System.out.print(n + " ");
    mostrar(n - 1);
} 
}