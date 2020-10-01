package main;

public class Persona {

    private String nombre;

    private String tipo;

    private String identificacion;

    private int edad;

    private String fechaNacimiento;

    public Persona() {
    }

    public Persona(String nombre, String tipo, String identificacion, int edad, String fechaNacimiento) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.identificacion = identificacion;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona [" + "Nombre: " + nombre + ", Tipo: " + tipo + ", Identificacion: " + identificacion + ", Edad: " + edad + ", Fecha de Nacimiento: " + fechaNacimiento + ']';
    }
}
