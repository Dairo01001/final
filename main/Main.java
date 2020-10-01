package main;

public class Main {
    
    public static void main(String[] args) {
        
        Universidad un = new Universidad(new pila.dependencias.Pila());
        
        un.getDependencias().Apilar(new Dependencia("Aseo", new pila.Pila()));
        
        un.getDependencias().Buscar("Aseo").getEmpleados().Apilar(new Empleado("Jefe", new Persona(), new Contrato()));
        
        System.out.println(un);
    }
}
