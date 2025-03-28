package CursoJava_Hogward;

import java.util.Objects;

public class Hechizos {
    private String nombre;
    private int dificultad;

    public Hechizos(String nombre, int dificultad) {
        super();
        this.nombre = nombre;
        setDificultad(dificultad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDificultad() {
        return dificultad;
    }

    // SI ES INFERIOR DE 0, SE PREDEFINIRA QUE ES DE NIVEL 0
    public void setDificultad(int dificultad) {
        if (dificultad < 0) {
            this.dificultad = 0;
        } else {
            this.dificultad = dificultad;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(dificultad, nombre);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Hechizos other = (Hechizos) obj;
        return dificultad == other.dificultad && Objects.equals(nombre, other.nombre);
    }

    @Override
    public String toString() {
        return "\n- Nombre= " + nombre + ", dificultad= " + dificultad;
    }

}
