package org.cardona.herencia.verduleria;

public class Fruta extends Producto{
    private double peso;
    private String color;

    public Fruta(double peso, String color, String Nombre, double Precio){
        super(Nombre, Precio);
        this.peso = peso;
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public String getColor() {
        return color;
    }
}
