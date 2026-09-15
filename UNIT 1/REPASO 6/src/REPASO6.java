/**
 * Hector Caleb Mosqueda Santes N° control:25260872
 */
public class REPASO6 {
    private String marca;
    private String modelo;
    private int año;
    private String color;
    private int memoria;

    public REPASO6(String marca, String modelo, int año, String color, int memoria) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
        this.memoria = memoria;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Año: " + this.año);
        System.out.println("Color: " + this.color);
        System.out.println("Memoria: " + this.memoria + " GB");
    }

    public int calcularAntiguedad(int añoActual) {
        int antiguedad = añoActual - this.año;
        return antiguedad;
    }

    public void verificarMemoria() {
        if (this.memoria > 128) {
            System.out.println("El celular tiene suficiente memoria");
        } else {
            System.out.println("El celular no tiene suficiente memoria");
        }
    }
}