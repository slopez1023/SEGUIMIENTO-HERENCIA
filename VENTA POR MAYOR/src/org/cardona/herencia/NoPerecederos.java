package org.cardona.herencia;

public class NoPerecederos extends Alimentos{
    private String tipoConservacion;

    public NoPerecederos(String tipoConservacion, String fabricante, String Origen, String tipoAlimento, String codigo, String nombre, double precio){
        super(fabricante,Origen,tipoAlimento,codigo,nombre,precio);
        this.tipoConservacion = tipoConservacion;
    }

    public String getTipoConservacion() {
        return tipoConservacion;
    }
}
