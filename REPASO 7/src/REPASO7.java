
/**
 * Hector Caleb Mosqueda Santes N° control:25260872
 */
public class REPASO7 {

    private String nombre;
    private String genero;
    private int año;
    private String plataforma;
    private double precio;
    private double calificacion;

    public REPASO7(String nombre, String genero, int año, String plataforma, double precio, double calificacion) {
        this.nombre = nombre;
        this.genero = genero;
        this.año = año;
        this.plataforma = plataforma;
        this.precio = precio;
        this.calificacion = calificacion;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Genero: " + this.genero);
        System.out.println("Año: " + this.año);
        System.out.println("Plataforma: " + this.plataforma);
        System.out.println("Precio: $" + this.precio);
        System.out.println("Calificacion: " + this.calificacion);
    }

    public void calcularClasico() {
        if (this.año < 2010) {
            System.out.println("Es un juego clasico");
        } else {
            System.out.println("No es un juego clasico");
        }
    }

    public void aplicarDescuento() {
        this.precio = this.precio * 0.90;
        System.out.println("Nuevo precio con 10% de descuento: $" + this.precio);
    }

    public void verificarOferta() {
        if (this.precio < 500) {
            System.out.println("El juego esta en oferta");
        } else {
            System.out.println("El juego no esta en oferta");
        }
    }
}