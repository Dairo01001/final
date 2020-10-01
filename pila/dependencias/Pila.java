package pila.dependencias;

import main.Dependencia;

public class Pila {

    private Nodo inicio;
    private int tamanio;

    public Pila() {
    }

    public boolean isVacia() {
        return this.inicio == null;
    }

    public int getTamanio() {
        return this.tamanio;
    }

    public void Apilar(Dependencia dato) {
        if (this.isVacia()) {
            this.inicio = new Nodo(dato);
        } else {
            this.inicio = new Nodo(dato, inicio);
        }
        this.tamanio++;
    }

    public void Desapilar() {
        if (!this.isVacia()) {
            this.inicio = inicio.getSiguiente();
            this.tamanio--;
        }
    }

    public Dependencia Buscar(String nombre) {
        Nodo aux = inicio;
        boolean existe = false;
        Dependencia auxD = null;
        while (existe != true && aux != null) {
            if (nombre.equals(aux.getDato().getNombre())) {
                existe = true;
                auxD = aux.getDato();
            } else {
                aux = aux.getSiguiente();
            }
        }
        return auxD;
    }

    @Override
    public String toString() {
        String s = "Universidad: [\n";
        for (Nodo aux = this.inicio; aux != null; aux = aux.getSiguiente()) {
            s += "[" + aux.getDato() + "]\n";
        }
        s += "]";
        return s;
    }
}
