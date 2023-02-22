package org.cardona.herencia;

public class Alimentos extends Producto{
    private String fabricante;
    private String Origen;
    private String tipoAlimento;

    public Alimentos(String fabricante,String Origen, String tipoAlimento, String codigo, String nombre, double precio){
        super(codigo, nombre, precio);
        this.fabricante = fabricante;
        this.Origen = Origen;
        this.tipoAlimento = tipoAlimento;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getOrigen() {
        return Origen;
    }

    public String getTipoAlimento() {
        return tipoAlimento;
    }
}
