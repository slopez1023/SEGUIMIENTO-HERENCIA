package org.cardona.herencia;

public class Perecederos extends Alimentos{
    private int Stock;
    private String fechaVencimiento;

    public Perecederos(int Stock, String fechaVencimiento, String fabricante, String Origen,String tipoAlimento, String codigo, String nombre, double precio){
        super(fabricante,Origen,tipoAlimento,codigo,nombre,precio);
        this.Stock = Stock;
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getStock() {
        return Stock;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }
}
