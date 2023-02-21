package org.cardona.herencia.verduleria;

public class Producto {
    private String Nombre;
    private double Precio;

    public Producto(String Nombre, double Precio){
        this.Nombre = Nombre;
        this.Precio = Precio;
    }

    public String getNombre() {
        return Nombre;
    }
    public double getPrecio() {
        return Precio;
    }
}
