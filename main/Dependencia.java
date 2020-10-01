package main;

import pila.Pila;

public class Dependencia {

    private String nombre;

    private Pila empleados;

    public Dependencia() {
    }

    public Dependencia(String nombre, Pila empleados) {
        this.nombre = nombre;
        this.empleados = empleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pila getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Pila empleados) {
        this.empleados = empleados;
    }

    @Override
    public String toString() {
        return "Dependencia [" + "Nombre: " + nombre + ", Empleados: " + empleados + ']';
    }
}
