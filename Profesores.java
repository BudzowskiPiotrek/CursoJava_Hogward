package CursoJava_Hogward;

import java.util.HashMap;
import java.util.Map;

public class Profesores extends Personajes {
    private Map<Asignaturas, Integer> asignaturas;

    public Profesores(String nombre, int edad) {
        super(nombre, edad);
        this.asignaturas = new HashMap<>();
    }

    public Map<Asignaturas, Integer> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(Map<Asignaturas, Integer> asignaturas) {
        this.asignaturas = asignaturas;
    }

    public boolean agregarAsignatura(Asignaturas asignatura, int numero) {
        if (!asignaturas.containsKey(asignatura)) {
            asignaturas.put(asignatura, numero);
            return true;
        }
        return false;

    }

}
