package org.cardona.herencia.verduleria;

public class Lacteo extends Producto{
    private int cantidad;
    private int proteinas;

    public Lacteo(int cantidad, int proteinas, String Nombre, double Precio){
        super(Nombre, Precio);
        this.cantidad = cantidad;
        this.proteinas = proteinas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getProteinas() {
        return proteinas;
    }
}
