import controllers.Cola;
import controllers.ColaG;
import controllers.Stack;
import controllers.StackG;
import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        //Stack stack=new Stack();
        StackG<Integer> stack = new StackG<>();
        stack.push(10);
        stack.push(-1);
        stack.push(5);
        stack.push(8);
        System.out.println("pila para abajo");
        System.out.println("Tam:"+ stack.size());
        stack.printStack();
        stack.pop();
        stack.peek();
        System.out.println(" ");
        System.out.println("Tam:"+ stack.size());
        stack.printStack();


        StackG<String> stackString = new StackG<>();
        stackString.push("Sebas");
        stackString.push("soy");
        stackString.push("Hola");
        System.out.println(" ");
        System.out.println("Pila de strings:");
        stackString.printStack();
        stackString.pop();
        stackString.peek();
        
        System.out.println("Pila alreves");
        System.out.println("Tam:"+ stack.size());
        stackString.printStack();
        System.out.println("--------------------------------------------------------------------");

        Cola cola=new Cola();
        cola.add(5);
        cola.add(7);
        cola.add(10);
        System.out.println("Tam="+cola.size);
        cola.printCola();
        cola.remove();
        System.out.println("Tam="+cola.size);
        cola.printCola();

        Persona p1=new Persona("Pablo");
        Persona p2=new Persona("Juan");
        Persona p3=new Persona("Maria");


        ColaG<Persona> colaPersonas=new ColaG<Persona>();
        colaPersonas.add(p1);
        colaPersonas.add(p2);
        colaPersonas.add(p3);
        System.out.println((colaPersonas.size()));
        colaPersonas.printCola();
        System.out.println("Atiene a la persona =>"+colaPersonas.remove());
        System.out.println(colaPersonas.size());
        colaPersonas.printCola();
    }
}
