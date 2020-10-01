package main;

import pila.dependencias.Pila;

public class Universidad {

    private Pila dependencias;

    public Universidad() {
    }

    public Universidad(Pila dependencias) {
        this.dependencias = dependencias;
    }

    public Pila getDependencias() {
        return dependencias;
    }

    public void setDependencias(Pila dependencias) {
        this.dependencias = dependencias;
    }
    
    public void addDependencia(Dependencia dependencia){
        if (null  == this.dependencias.Buscar(dependencia.getNombre())) {
            this.dependencias.Apilar(dependencia);
        } else {
            System.out.println("La Dependencia ya Existe!");
        }
    }

    @Override
    public String toString() {
        return "Universidad [" + "Dependencias: " + dependencias + ']';
    }
    
    
}
