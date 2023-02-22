package org.cardona.herencia;

public class Persona {
    private String Nombre;
    private String Apellido;

    public Persona(String Nombre, String Apellido){
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }
}
