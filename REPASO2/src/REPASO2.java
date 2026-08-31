import java.util.Scanner;
/**
 * Nombre del Alumno: HECTOR CALEB MOSQUEDA SANTES
 * Número de Control: 25260872
 */
public class REPASO2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de estudiantes a registrar: ");
        int n = scanner.nextInt();
        double[] calificaciones = new double[n];
        for (int i = 0; i < n; i++) {
            do {
                System.out.print("Ingrese la calificación del estudiante " + (i + 1) + " (0 - 10): ");
                calificaciones[i] = scanner.nextDouble();
                if (calificaciones[i] < 0 || calificaciones[i] > 10) {
                    System.out.println("⚠️ Calificación inválida. Debe estar entre 0 y 10.");
                }
            } while (calificaciones[i] < 0 || calificaciones[i] > 10);
        }
        mostrarResultados(calificaciones);
        scanner.close();
    }
    public static double calcularPromedio(double[] calificaciones) {
        double suma = 0;
        for (double cal : calificaciones) {
            suma += cal;
        }
        return calificaciones.length > 0 ? suma / calificaciones.length : 0;
    }
    public static double obtenerMaximo(double[] calificaciones) {
        double max = calificaciones[0];
        for (double cal : calificaciones) {
            if (cal > max) {
                max = cal;
            }
        }
        return max;
    }
    public static double obtenerMinimo(double[] calificaciones) {
        double min = calificaciones[0];
        for (double cal : calificaciones) {
            if (cal < min) {
                min = cal;
            }
        }
        return min;
    }
    public static void mostrarResultados(double[] calificaciones) {
        System.out.println("\n==========================================");
        System.out.println("         RESUMEN DE CALIFICACIONES        ");
        System.out.println("==========================================");
        System.out.printf("El promedio del grupo es: %.2f\n", calcularPromedio(calificaciones));
        System.out.println("La calificación más alta es: " + obtenerMaximo(calificaciones));
        System.out.println("La calificación más baja es: " + obtenerMinimo(calificaciones));
        System.out.println("==========================================");
    }
}