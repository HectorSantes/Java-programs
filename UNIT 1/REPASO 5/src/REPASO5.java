/**
 * Hector Caleb Mosqueda Santes N° control:25260872
 */
public class REPASO5 {
    private int cuenta;
    private int saldo;
    private String nombreBanco;
    private int maxRetiros = 3;
    private int retirosRealizados = 0;

    REPASO5(String nombre, int cuentaBanco) {
        this.cuenta = cuentaBanco;
        this.nombreBanco = nombre;
        System.out.println("Bievenido a la banca electronica " + "de " + nombre);
        System.out.println("Numero de cuenta " + cuentaBanco);
    }

    public int obtenerSaldo() {
        return saldo;
    }

    public void consultaSaldo() {
        System.out.println("Su saldo es: " + this.saldo);
    }

    public void realizaDeposito(int cantidad) {
        this.saldo += cantidad;
        System.out.println("Deposito realizado correctamente");
    }

    public void realizaRetiro(int cantidad) {
        if (this.retirosRealizados >= this.maxRetiros) {
            System.out.println("Ya se ha excedido la cantidad de retiros");
            return;
        }

        if (cantidad <= this.saldo) {
            this.saldo -= cantidad;
            this.retirosRealizados++;
            System.out.println("Retiro realizado correctamente");
        } else {
            System.out.println("La cantidad a retirar no puede ser mayor a " + this.saldo);
        }
    }
}