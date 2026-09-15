package proyecto5;

public class Proyecto5 {

    
    public static void main(String[] args) {
        
        int sumaPares = 0;
        int sumaImpares = 0;
        
        for (int i=1; i<=200; i++)
        {
            if (i%2==0)
            {
                sumaPares = sumaPares + i;
                
            }
            else {
                sumaImpares = sumaImpares + i;
            }
        }
        
        System.out.println("Suma de pares: " + sumaPares);
        System.out.println("Suma de impares: " + sumaImpares);
        
    }
    
}
