package org.cardona.herencia;

public class Limpieza extends Producto{
    private String Marca;
    private String Tipo;

    public Limpieza(String Marca, String Tipo, String codigo, String nombre, double precio){
        super(codigo, nombre, precio);
        this.Marca = Marca;
        this.Tipo = Tipo;
    }

    public String getMarca() {
        return Marca;
    }

    public String getTipo() {
        return Tipo;
    }
}
