package Ejercicio_02_sorting;

import controllers.StackG;

public class StackSorter {

    public void sortStack(StackG<Integer> pila){
        StackG<Integer> auxiliar = new StackG<>();

        while (!pila.isEmpty()) {
            int temp = pila.pop();

            
            while (!auxiliar.isEmpty() && auxiliar.peek() > temp) {
                pila.push(auxiliar.pop());
            }

            auxiliar.push(temp);
        }

        while (!auxiliar.isEmpty()) {
            pila.push(auxiliar.pop());
        }

    }

    
}
