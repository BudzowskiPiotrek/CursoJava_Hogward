package CursoJava_Hogward;

import java.util.Objects;

public class Personajes {
    private String nombre;
    private int edad;
    private int codigoPersonaje;
    public static int contador = 0;

    public Personajes(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.codigoPersonaje = contador;
        contador++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCodigoPersonaje() {
        return codigoPersonaje;
    }

    public void setCodigoPersonaje(int codigoPersonaje) {
        this.codigoPersonaje = codigoPersonaje;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Personajes.contador = contador;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoPersonaje, edad, nombre);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Personajes other = (Personajes) obj;
        return codigoPersonaje == other.codigoPersonaje && edad == other.edad && Objects.equals(nombre, other.nombre);
    }

    @Override
    public String toString() {
        return "Nombre= " + nombre + ", edad= " + edad + ", codigoPersonaje= " + codigoPersonaje;
    }

}
