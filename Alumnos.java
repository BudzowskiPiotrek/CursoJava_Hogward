package CursoJava_Hogward;

import java.util.HashSet;
import java.util.Set;

public class Alumnos extends Personajes {
    private Escuelas escuela;
    private Set<Asignaturas> asignaturas;
    private Set<Hechizos> hechizos;

    public Alumnos(String nombre, int edad, Escuelas escuela) {
        super(nombre, edad);
        this.escuela = escuela;
        this.asignaturas = new HashSet<>();
        this.hechizos = new HashSet<>();
    }

    public Escuelas getEscuela() {
        return escuela;
    }

    public void setEscuela(Escuelas escuela) {
        this.escuela = escuela;
    }

    public Set<Asignaturas> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(Set<Asignaturas> asignaturas) {
        this.asignaturas = asignaturas;
    }

    public Set<Hechizos> getHechizos() {
        return hechizos;
    }

    public void setHechizos(Set<Hechizos> hechizos) {
        this.hechizos = hechizos;
    }

    public boolean agregarAsignaturas(Asignaturas asignatura) {
        if (!asignaturas.contains(asignatura)) {
            asignaturas.add(asignatura);
            return true;
        }
        return false;
    }

    // PRIMERO RECORO EL CONJUNTO DE ASIGNATURAS PARA SABER EL NIVEL MAXIMO DE
    // HECHIZOS QUE PUEDE APRENDER POSTERIORMENTE SI EL NIVEL DE HECHIZO ES INFERIOR
    // AL QUE PUEDE POR LAS SIGNATURAS PUES SE LE AÑADE
    public boolean agregarHechizo(Hechizos hechizo) {
        int nivelAprendido = 0;
        for (Asignaturas a : asignaturas) {
            int nivel = a.getNivel();
            if (nivel > nivelAprendido) {
                nivelAprendido = a.getNivel();
            }
        }
        if (hechizo.getDificultad() <= nivelAprendido) {
            hechizos.add(hechizo);
            return true;
        }

        return false;

    }

    @Override
    public String toString() {
        return "Alumnos Escuela= " + escuela + ", asignaturas= " + asignaturas + ", hechizos= " + hechizos;
    }

}
