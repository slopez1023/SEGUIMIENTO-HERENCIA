package org.cardona.herencia.verduleria;

public class Limpieza extends Producto{
    private String componentes;
    private double litros;

    public Limpieza(String componentes, double litros, String Nombre, double Precio){
        super(Nombre, Precio);
        this.componentes = componentes;
        this.litros = litros;
    }

    public String getComponentes() {
        return componentes;
    }

    public double getLitros() {
        return litros;
    }
}
