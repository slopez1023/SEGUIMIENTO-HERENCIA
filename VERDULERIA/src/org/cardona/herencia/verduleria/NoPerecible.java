package org.cardona.herencia.verduleria;

public class NoPerecible extends Producto{
    private int contenido;
    private int calorias;

    public NoPerecible(int contenido, int calorias, String Nombre, double Precio){
        super(Nombre, Precio);
        this.contenido = contenido;
        this.calorias = calorias;
    }

    public int getContenido() {
        return contenido;
    }

    public int getCalorias() {
        return calorias;
    }
}
