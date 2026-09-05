
package practica.clase;

/**
 *
 * Hector Caleb Mosqueda Santes N°control 
 */
public class PRACTICACLASE {
 private String numControl;
 private String nombre;
 private String apellido;
 private String carrera;
 private int edad;
 private String materias[];
 private int  contadorMaterias;

    public PRACTICACLASE(String numControl, String nombre, String apellido,int edad) {
    this.numControl =numControl;
    this.nombre=nombre;
    this.apellido=apellido;
    this.carrera="no asignado";
    this.edad= edad;
    this.materias =new String[4];
    this.contadorMaterias= 0;
    }
 
    public void mostarDatos(){
        System.out.println( "Nombre:"+this.nombre+""+this.apellido);
        System.out.println("Numero de control:"+this.numControl);
        System.out.println("Carrera"+this.carrera);
        System.out.println("Edad:"+edad);
    }
    
 public void cambiarCarrera(String carrera){
 this.carrera=carrera;
 }
   public String devuelveNumCOntrol(){
   return this.numControl;}
public void agregarMaterias(String materia){
if(contadorMaterias<this.materias.length){
materias[contadorMaterias]= materia;
contadorMaterias++;
    System.out.println("Materia agregada correctamente");
}
}
    public void mostarMaterias(){
        for (int i=0;i<this.materias.length; i++) {
            System.out.println("Materia:"+materias[i]);  
        }
    }
    
    
    
    
    
    
}
