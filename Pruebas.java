package CursoJava_Hogward;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pruebas {

    public static void main(String[] args) {

        Scanner st = new Scanner(System.in);

        // CREO UN BUCLE INFINITO PARA PODER INGRESAR VARIAS VECES LA CONTRASEÑA.
        // DENTRO DEL BUCLE CREO UNA EXPRESION REGULAR EN CUAL SE PERMITE SOLO LETRAS
        // PEQUEÑAS GRANDES DE CARACTERES PRINCIPALES.
        while (true) {
            System.out.println("Pronuncia el hechizo Magico: ");
            String hechizo = st.nextLine();
            String expresion = "^[a-zA-ZÑñáéóúíÁÉÓÍÚ]+[sS]{1}\\ [a-zA-ZÑñáéóúíÁÉÓÍÚ]{3}$";
            Pattern p = Pattern.compile(expresion);
            Matcher m = p.matcher(hechizo);

            if (m.matches()) {
                System.out.println("Bien hecho! Puedes entrar");
                dataBases();
                return; // PARA CUANDO SE PONGA CONTRASEÑA CORRECTA TERMINE BUCLE
            } else {
                System.out.println("No es correcto");
            }
        }
    }

    private static void dataBases() {
        // CREAMOS LAS DOS SALAS Y UN RETRATO DESPUES IMPRIMO SALA DE BIBLIOTECA
        Salas sala1 = new Salas("Biblioteca", 91);
        Salas sala2 = new Salas("Comedor", 23);
        Retratos retrato1 = new Retratos("El Grand Lincoln Enano", 560, sala1);
        System.out.println(sala1.toString());

        // CREO DOS OBJETOS DE ASIGNATURAS Y DOS DE HECHIZOS
        Asignaturas asignatura1 = new Asignaturas("Conjuros Oscuros", 2);
        Asignaturas asignatura2 = new Asignaturas("Levitacion", 4);
        Hechizos hechizo1 = new Hechizos("Volador", 4);
        Hechizos hechizo2 = new Hechizos("BorrarRecuerdos", 3);

        // SE CREA DOS OBJETOS DE ALUMNOS
        Alumnos alumno1 = new Alumnos("Paco", 20, Escuelas.GRYFFINDOR);
        Alumnos alumno2 = new Alumnos("Alberto", 20, Escuelas.HUFFLEPUFF);

        // AL ALUMNO 1 SE ASIGNA SU SIGNATURA Y SU HECHIZO, DESPUES SE PROCEDE A
        // IMPRIMIR
        alumno1.agregarAsignaturas(asignatura2);
        alumno1.agregarHechizo(hechizo1);
        System.out.println(alumno1.toString());

        // SE LE AGREGA DE NUEVO EL MISMO, Y SE COMPRUEBA SI LO GUARDO
        alumno1.agregarHechizo(hechizo1);
        System.out.println(alumno1.toString());

        // SE AGREGA A SEGUNDO ALUMNO SU SIGNATURA Y HECHIZO POSTERIORMENTE SE IMPRIME
        // PARA COMPROBAR SI PUEDE SABER HECHIZO POR SU NIVEL
        alumno2.agregarAsignaturas(asignatura1);
        alumno2.agregarHechizo(hechizo1);
        System.out.println(alumno2.toString());

        // POR ULTIMO OBTENGO CONTADOS STATICO DEL PERSONAJE PARA SABER CUANTO SE CREO
        int numero = Personajes.getContador();
        System.out.println("En esta simulacion se ha imprimido: " + numero);

    }

}
