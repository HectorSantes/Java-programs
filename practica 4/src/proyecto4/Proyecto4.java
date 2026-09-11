
package proyecto4;

import java.util.Scanner;
//
public class Proyecto4 {

   
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        int horas = 0;
        double tarifa, salario;
        
        System.out.print("Ingrese la tarifa por hora: ");
        tarifa = scanner.nextDouble();
        
        for (int dia =1; dia<=5; dia++ )
        {
            System.out.println("Horas trabajadas al dia " + dia + ":");
            horas = horas + scanner.nextInt();
        }
        
        if (horas <= 40)
        {
            salario = horas * tarifa;
        }
        
        else {
            int horasNormales = 40;
            int horasExtra = horas - 40;
            
            salario = (horasNormales * tarifa) + (horasExtra * tarifa * 2);
        }
        
        System.out.println("Horas trabajadas: " + horas);
        System.out.println("Salario semanal: " + salario);
    
        
    }
    
}
