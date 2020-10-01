package main;

public class Contrato {
    
    private Persona persona;
    
    private String tipo;
    
    private String funciones;
    
    private int duracion;
    
    private double salario;
    
    private String datosEmpresa;

    public Contrato() {
    }

    public Contrato(Persona persona, String tipo, String funciones, int duracion, double salario, String datosEmpresa) {
        this.persona = persona;
        this.tipo = tipo;
        this.funciones = funciones;
        this.duracion = duracion;
        this.salario = salario;
        this.datosEmpresa = datosEmpresa;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFunciones() {
        return funciones;
    }

    public void setFunciones(String funciones) {
        this.funciones = funciones;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDatosEmpresa() {
        return datosEmpresa;
    }

    public void setDatosEmpresa(String datosEmpresa) {
        this.datosEmpresa = datosEmpresa;
    }

    @Override
    public String toString() {
        return "Contrato \n" + "Persona: " + persona + "\nTipo: " + tipo + "\nFunciones: " + funciones + "\nDuracion: " + duracion + "\nSalario: " + salario + "\nDatos empresa: " + datosEmpresa;
    }
}
