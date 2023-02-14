package org.arias.heremcia;

public class alumno extends persona {
    private String institucion;
    private double notaMatematicas;
    private double notaCatellano;
    private double notaHistoria;


    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMatematicas() {
        return notaMatematicas;
    }

    public void setNotaMatematicas(double notaMatematicas) {
        this.notaMatematicas = notaMatematicas;
    }

    public double getNotaCatellano() {
        return notaCatellano;
    }

    public void setNotaCatellano(double notaCatellano) {
        this.notaCatellano = notaCatellano;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }
}
