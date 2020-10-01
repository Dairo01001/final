package pila;

import main.Empleado;

public class Nodo {

    private Empleado dato;

    private Nodo siguiente;

    public Nodo() {
    }

    public Nodo(Empleado dato) {
        this.dato = dato;
    }

    public Nodo(Empleado dato, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public Empleado getDato() {
        return dato;
    }

    public void setDato(Empleado dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "Nodo [" + "Dato: " + dato + ", Siguiente: " + siguiente + ']';
    }
}
