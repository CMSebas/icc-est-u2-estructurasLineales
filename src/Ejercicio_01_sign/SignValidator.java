package Ejercicio_01_sign;
import controllers.Stack;
import controllers.StackG;;

public class SignValidator {

    public boolean isValid(String cadena){

        StackG<Character> pila = new StackG<>();
        

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (c == '(' || c == '{' || c == '[') {//primero es de apertura o cierre
                pila.push(c);//si es true agrego a pila
            } else {
                if (pila.isEmpty()) return false;

                char top = pila.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return pila.isEmpty();


    }
    
}
