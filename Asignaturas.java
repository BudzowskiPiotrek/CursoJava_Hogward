package CursoJava_Hogward;

import java.util.Objects;

public class Asignaturas {
    private String nombre;
    private int nivel;

    public Asignaturas(String nombre, int nivel) {
        this.nombre = nombre;
        setNivel(nivel);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    // SI ES INFERIOR DE 0, SE PREDEFINIRA QUE ES DE NIVEL 0
    public void setNivel(int nivel) {
        if (nivel < 0) {
            this.nivel = 0;
        } else {
            this.nivel = nivel;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(nivel, nombre);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Asignaturas other = (Asignaturas) obj;
        return nivel == other.nivel && Objects.equals(nombre, other.nombre);
    }

    @Override
    public String toString() {
        return "\n- Nombre= " + nombre + ", nivel= " + nivel;
    }
}
