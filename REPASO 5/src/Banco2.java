

/**
 *
 * Hector Caleb Mosqueda Santes N°control:25260872
 */
public class Banco2 {
    public static void main(String[] args) {
        REPASO5 banco = new REPASO5("MiBanco", 987);
        int saldo = banco.obtenerSaldo();
        System.out.println("Saldo: " + saldo);

        banco.realizaDeposito(300);
        banco.realizaDeposito(600);
        banco.consultaSaldo();
        banco.realizaDeposito(600);

        banco.consultaSaldo();

        banco.realizaRetiro(100);
        banco.consultaSaldo();

        banco.realizaRetiro(100);
        banco.consultaSaldo();
        banco.realizaRetiro(600);
        banco.consultaSaldo();

        banco.realizaRetiro(6000);
        banco.consultaSaldo();
    }
}