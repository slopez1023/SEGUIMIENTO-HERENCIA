package org.cardona.herencia;

public class Vendedor1 extends Persona{
    private int Id;
    private int edad;
    private String Genero;
    private String email;

    public Vendedor1(int Id, int edad, String Genero, String email, String Nombre, String Apellido){
        super(Nombre,Apellido);
        this.Id = Id;
        this.edad = edad;
        this.Genero = Genero;
        this.email = email;
    }

    public int getId() {
        return Id;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return Genero;
    }

    public String getEmail() {
        return email;
    }
}
