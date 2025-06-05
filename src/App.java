import Ejercicio_01_sign.SignValidator;
import Ejercicio_02_sorting.StackSorter;
import controllers.Cola;
import controllers.ColaG;
import controllers.Stack;
import controllers.StackG;
import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        /*
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
        Persona p2=new Persona("David");
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

        Persona encontrada = colaPersonas.findByName("David");
        if (encontrada != null) {
            System.out.println("Persona encontrada: " + encontrada);
        } else {
            System.out.println("No se encontró a David");
        }
        Persona pEliminada = colaPersonas.removeByName("David");
        if (pEliminada != null) {
            System.out.println("Persona eliminada: " + pEliminada);
            colaPersonas.printCola();
        } else {
             System.out.println("No se pudo eliminar porque no se encontró a David");
            }*/
        System.out.println("-------------------------Ejercicio1------------------------------");
        SignValidator validador = new SignValidator();

        System.out.println("([]){} es " + validador.isValid("([]){}")); 
        System.out.println("({)} es " + validador.isValid("({)}"));     
        System.out.println("()[]{} es " + validador.isValid("()[]{}"));   


        StackG<Integer> pilaE2 = new StackG<>();
        System.out.println("-------------------------Ejercicio1------------------------------");
        pilaE2.push(10);
        pilaE2.push(2);
        pilaE2.push(5);
        pilaE2.push(8);

        System.out.println("Pila inicial:");
        pilaE2.printStack();  

        StackSorter sorter = new StackSorter();
        sorter.sortStack(pilaE2);

        System.out.println("Despues de ordenar:");
        pilaE2.printStack(); 




        }
    
}
