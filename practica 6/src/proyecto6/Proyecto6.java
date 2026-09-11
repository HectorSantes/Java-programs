
package proyecto6;
import java.math.BigInteger; 

public class Proyecto6 {

    
    public static void main(String[] args) {
       
        long suma=0;
        BigInteger producto=BigInteger.ONE;
        
        for (int i=20; i<=400; i = i+2)
        {
            suma = suma + i;
            producto = producto.multiply(BigInteger.valueOf(i));
        }
        
        System.out.println("Suma: " + suma);
        System.out.println("Producto: " + producto);
        
    }
    
}
