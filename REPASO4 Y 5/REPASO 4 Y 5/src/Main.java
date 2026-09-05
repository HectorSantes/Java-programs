
import practica.clase.PRACTICACLASE;


/**
 *
 * Hector Caleb Mosqueda Santes N°25260872
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Helllo world");
        PRACTICACLASE alumno=new PRACTICACLASE("19000000","Hector","Mosqueda",19);
        String numero= alumno.devuelveNumCOntrol();
        System.out.println("NUMERO DE CONTROL:"+numero);
        alumno.mostarDatos();
        alumno.mostarMaterias();
        alumno.agregarMaterias("Fisica");
        alumno.agregarMaterias("Quimica");
        System.out.println("---------------");
        alumno.mostarMaterias();
        alumno.agregarMaterias("Calculo");
        alumno.agregarMaterias("Programacion");
        alumno.agregarMaterias("Quimica");
        alumno.agregarMaterias("Derecho");
        alumno.agregarMaterias("Lenguaje de progrmacion");
        System.out.println("---------------");
        alumno.mostarMaterias();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
