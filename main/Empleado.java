package main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Empleado {

    private String cargo;

    private Persona persona;

    private Contrato contrato;

    public Empleado() {
    }

    public Empleado(String cargo, Persona persona, Contrato contrato) {
        this.cargo = cargo;
        this.persona = persona;
        this.contrato = contrato;
        this.contrato.setPersona(persona);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public void generarTXT() {
        try {
            String contenido = this.contrato.toString();
            File file = new File("src\\data\\" + this.persona.getIdentificacion() + ".txt");

            if (!file.exists()) {
                file.createNewFile();
            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
                bw.write(contenido);
            }
        } catch (IOException e) {
        }
    }

    @Override
    public String toString() {
        return "Empleado [\n" + "Cargo: " + cargo + ", Persona: " + persona + ", Contrato: " + contrato + ']';
    }

}
