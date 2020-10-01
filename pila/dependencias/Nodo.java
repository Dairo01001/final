package pila.dependencias;

import main.Dependencia;

public class Nodo {

    private Dependencia dato;

    private Nodo siguiente;

    public Nodo() {
    }

    public Nodo(Dependencia dato) {
        this.dato = dato;
    }

    public Nodo(Dependencia dato, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public Dependencia getDato() {
        return dato;
    }

    public void setDato(Dependencia dato) {
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
