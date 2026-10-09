package e1.java;
//import java.util.Stack;
//Hector Caleb Mosqueda Santes N° control: 25260872
public class E1 {

    public static void main(String[] args) {
        // TODO code application logic here
        pila p1 = new pila(5);
       
        p1.showPila();
        p1.push(35);
        p1.push(100);
        p1.push(10);
       
       System.out.println("\n"+p1.pop());
       
        p1.isEmpty();
        p1.isFull();
        p1.showPila();
       
        p1.showPila();
       
        // Forma 2
       /* Stack pila = new Stack();
       
        p1.push(33);
        p1.push(14);
        p1.push(64);
        p1.push(10);
        p1.push(10);
        p1.showPila();*/
    }
   
}