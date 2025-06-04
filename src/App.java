import controllers.Stack;
import controllers.StackG;

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
    }
}
