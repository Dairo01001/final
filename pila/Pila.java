package pila;

import main.Empleado;

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

    public void Apilar(Empleado dato) {
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

    public Empleado Buscar(String identificacion) {
        Nodo aux = inicio;
        boolean existe = false;
        Empleado auxE = null;
        while (existe != true && aux != null) {
            if (identificacion.equals(aux.getDato().getPersona().getIdentificacion())) {
                existe = true;
                auxE = aux.getDato();
            } else {
                aux = aux.getSiguiente();
            }
        }
        return auxE;
    }

    public void Remover(String identificacion) {
        Empleado referencia = Buscar(identificacion);
        if (referencia == null) {
            Nodo pilaAux = null;
            while (referencia != inicio.getDato()) {
                Nodo temp = new Nodo();
                temp.setDato(inicio.getDato());
                if (pilaAux == null) {
                    pilaAux = temp;
                } else {
                    temp.setSiguiente(pilaAux);
                    pilaAux = temp;
                }
                this.Desapilar();
            }
            this.Desapilar();
            while (pilaAux != null) {
                this.Apilar(pilaAux.getDato());
                pilaAux = pilaAux.getSiguiente();
            }
        } else {
            System.out.println("El empleado no existe!");
        }
    }

    @Override
    public String toString() {
        String s = "Dependencia: [\n";
        for (Nodo aux = this.inicio; aux != null; aux = aux.getSiguiente()) {
            s += "[" + aux.getDato() + "]\n";
        }
        s += "]";
        return s;
    }
}
