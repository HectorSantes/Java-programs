package repaso1;

/**
 *
 * Hector Caleb Mosqueda Santes N° ocntrol 25260872
 */
public class Repaso1 {

    
    public static void main(String[] args) {
        long s;
        s=operacion(4);
        System.err.println(s);
    }
    public static int operacion(int n) {
    if (n == 0) {
        return 0;
    }
    return n + operacion(n - 1);
}
}