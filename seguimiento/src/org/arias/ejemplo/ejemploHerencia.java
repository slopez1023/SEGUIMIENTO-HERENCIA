package org.arias.ejemplo;

import org.arias.heremcia.AlumnoInternacional;
import org.arias.heremcia.alumno;
import org.arias.heremcia.profesor;

public class ejemploHerencia {
    public static void main(String[] args) {
        alumno alumno = new alumno();
        alumno.setNombre("Camilo");
        alumno.setApellido("Arias");
        alumno.setInstitucion("Cue");
        alumno.setNotaMatematicas(4.9);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaCatellano(5.5);

        AlumnoInternacional alumnoInternacional = new AlumnoInternacional();


        profesor profesor = new profesor();
        profesor.setNombre("Santiago");
        profesor.setApellido("Lopez");
        profesor.setAsignatura("Matemáticas");

        System.out.println(alumno.getNombre() + " " + alumno.getApellido());
        System.out.println("Profesor " + profesor.getAsignatura() + ":" +  profesor.getNombre() +  " " + profesor.getApellido());
    }
}
