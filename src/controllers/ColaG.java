package controllers;

import java.util.EmptyStackException;
import models.NodeGeneric;
import models.Persona;

public class ColaG<T> {
    private NodeGeneric<T> primero;
    private NodeGeneric<T> ultimo;
    private int size;

    public ColaG() {
        this.primero = null;
        this.ultimo = null;
        this.size = 0;
    }

    public void add(T value) {
        NodeGeneric<T> newNode = new NodeGeneric<>(value);
        if (isEmpty()) {
            primero = newNode;
            ultimo = newNode;
        } else {
            ultimo.setNext(newNode);
            ultimo = newNode;
        }
        size++;
    }

    public T remove() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T value = primero.getValue();
        primero = primero.getNext();
        size--;
        return value;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return primero.getValue();
    }

    public boolean isEmpty() {
        return primero == null;
    }

    public int size() {
        return size;
    }

    public void printCola() {
        NodeGeneric<T> current = primero;
        while (current != null) {
            System.out.print(current.getValue() + "|");
            current = current.getNext();
        }
        System.out.println();
    }

    public Persona findByName(String nombre) {
    NodeGeneric<T> current = primero;
    while (current != null) {
        Persona p = (Persona) current.getValue();
        if (p.getNombre().equals(nombre)) {
            return p;
        }
        current = current.getNext();
    }
    return null;
}

public Persona removeByName(String nombre) {
    if (isEmpty()) return null;

    NodeGeneric<T> current = primero;
    NodeGeneric<T> prev = null;

    while (current != null) {
        Persona p = (Persona) current.getValue();
        if (p.getNombre().equals(nombre)) {
            if (current == primero) {
                primero = primero.getNext();
                if (primero == null) {
                    ultimo = null;
                }
            } else {
                prev.setNext(current.getNext());
                if (current == ultimo) {
                    ultimo = prev;
                }
            }
            size--;
            return p;
        }
        prev = current;
        current = current.getNext();
    }

    return null;
}
}