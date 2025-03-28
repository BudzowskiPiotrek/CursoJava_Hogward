package CursoJava_Hogward;

public class Retratos extends Personajes {

    // DENTRO DE CONSTRUCTOR INVOCAMOS EL METODO AGREGARRETRARO DE CLASE SALA PARA
    // NADIRLO DIRECTAMENTE
    public Retratos(String nombre, int edad, Salas sala) {
        super(nombre, edad);
        sala.agregarRetrato(this);
    }

    @Override
    public String toString() {
        return "\n- Nombre= " + getNombre() + ", Edad= " + getEdad() + ", CodigoPersonaje)= " + getCodigoPersonaje();
    }

}
