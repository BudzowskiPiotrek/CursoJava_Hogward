package CursoJava_Hogward;

import java.util.HashSet;
import java.util.Set;

public class Salas {
    private String nombre;
    private int id;
    private Set<Retratos> retratos;

    public Salas(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
        this.retratos = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<Retratos> getRetratos() {
        return retratos;
    }

    public void setRetratos(Set<Retratos> retratos) {
        this.retratos = retratos;
    }

    public boolean agregarRetrato(Retratos retrato) {
        if (!retratos.contains(retrato)) {
            retratos.add(retrato);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Nombre= " + nombre + ", id= " + id + ", retratos= " + retratos;
    }

}
