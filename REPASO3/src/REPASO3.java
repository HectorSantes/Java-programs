import java.util.Scanner;
/**
 * Nombre del Alumno: HECTOR CALEB MOSQUEDA SANTES
 * Número de Control: 25260872
 */
public class REPASO3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] temps = new double[7];
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        System.out.println("=== INGRESO DE TEMPERATURAS DE LA SEMANA ===");
        for (int i = 0; i < 7; i++) {
            System.out.print("Ingrese la temperatura para el día " + dias[i] + " (°C): ");
            temps[i] = scanner.nextDouble();
        }

        System.out.println("\n==========================================");
        System.out.printf("Promedio de temperatura de la semana: %.2f °C\n", calcularPromedio(temps));
        System.out.print("\nIngrese el límite de temperatura para consultar días calurosos (°C): ");
        double limite = scanner.nextDouble();
        int diasSuperados = contarDiasCalurosos(temps, limite);
        System.out.println("Cantidad de días que superaron los " + limite + " °C: " + diasSuperados);
        System.out.println("\n------------------------------------------");
        mostrarTemperaturas(temps);
        System.out.println("==========================================");

        scanner.close();
    }
    public static double calcularPromedio(double[] temps) {
        double suma = 0;
        for (double temp : temps) {
            suma += temp;
        }
        return temps.length > 0 ? suma / temps.length : 0;
    }

    public static int contarDiasCalurosos(double[] temps, double limite) {
        int contador = 0;
        for (double temp : temps) {
            if (temp > limite) {
                contador++;
            }
        }
        return contador;
    }

    public static void mostrarTemperaturas(double[] temps) {
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        System.out.println("LISTADO COMPLETO DE TEMPERATURAS:");
        for (int i = 0; i < temps.length; i++) {
            System.out.println(dias[i] + ": " + temps[i] + " °C");
        }
    }
}