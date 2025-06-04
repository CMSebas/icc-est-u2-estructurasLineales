package controllers;

import java.util.EmptyStackException;

import models.Node;

public class Stack {
    private Node top;
    private int size;

    public Stack() {
        this.top=null;
        this.size=0;
    }


    //metodo que igrese un valor int
    public void push(int Value){
        Node newNode=new Node(Value);
        newNode.setNext(top);
        top=newNode;
        size++;

    }

    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int value=top.getValue();
        top=top.getNext();
        size--;
        return value;
        


    }

    public boolean isEmpty(){
        return top==null;
    }

    public int peek(){
        if(isEmpty())
            throw new EmptyStackException();
        return top.getValue();

    }

    public void printStack(){
        
        
        Node current = top;
        while (current != null) {
            System.out.print(current.getValue());
            System.out.print("|");
            current = current.getNext();
        }
        
    }

    public int size(){
        return size;
    }


    
}
