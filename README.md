# 🧙‍♂️ Curso Java - Hogwarts 🎓
Examen Programación : Aplicación sobre pelicula "Harry Potter"
La célebre escuela de magia y hechicería de Hogwarts ha decidido modernizar
su sistema de gestión de la información mágica y tú has sido convocado para
desarrollar una aplicación en Java que capture la esencia mágica de la institución.

En primer lugar, vamos a informarte de cómo funciona el registro administrativo. En
Hogwarts encontramos un gran número de personajes, que por supuesto tienen un nombre y una edad,
algunos algo avanzada por cierto. Necesitamos saber cuántos personajes habitan en Hogwarts y cada uno debe
tener asignado un código que se irá generando automáticamente. Entre los personajes que conforman el mundo
mágico encontramos:

- Retratos (sí, retratos son personajes que viven en cuadros y están distribuidos por todo el recinto,
necesitamos conocer la sala en la que se encuentran para, en un momento determinado, ir a hablar con
ellos). Por su parte, las salas tienen un nombre y un id y, por supuesto, una lista de retratos.
Implementar la lógica necesaria para que cuando se cree un retrato automáticamente pase a formar parte del listado
de retratos de la sala a la que pertenezca.

- Profesores que tienen un área de especialización mágica y son
los encargados de enseñar asignaturas. Implementa los métodos necesarios
dentro de esta clase para ir añadiendo asignaturas al listado, un profesor puede
impartir la misma asignatura a varios cursos.

- Tenemos también alumnos, ¿qué sería de una escuela sin alumnos? Los alumnos pertenecen a
una escuela de las cuatro que conforman la gran familia Hogwarts (Gryffindor, Hufflepuff,
Ravenclaw, Slytherin) y, por supuesto, estudian asignaturas y aprenden hechizos. Las
asignaturas tienen un nombre y un nivel mágico, los hechizos tienen un nivel de dificultad y los
estudiantes solo podrán aprender un hechizo si han cursado una asignatura con un nivel igual o
superior que la dificultad del hechizo.

En la clase principal o de pruebas: Ya sabemos cómo funciona la estructura de Hogwarts, pero no todo
el mundo puede acceder a este registro. Para poder acceder, deberemos introducir un hechizo mágico
que validaremos mediante una expresión regular. Este hechizo estará compuesto por dos palabras,
no puede contener números ni caracteres especiales, la primera palabra debe terminar en "s" y la segunda
debe estar formada por tres caracteres exclusivamente. Si la palabra es correcta, se nos debe mostrar por consola un
mensaje con "Acceso Concedido", si la palabra no es correcta el programa debe finalizar.

Si el acceso es concedido se creará automáticamente una prueba que consistirá en:

- Crear una sala llamada biblioteca y otra comedor.

- Crear el retrato bibliotecario que preside la biblioteca.

- Llamaremos al toString de la sala de la biblioteca para comprobar que el retrato se ha
insertado correctamente.

- Crearemos la asignatura de Conjuros Oscuros de Nivel 2.

- Crearemos la asignatura de Levitación de Nivel 4.

- Crearemos el hechizo Volador de dificultad 4.

- Crearemos el hechizo BorrarRecuerdos de dificultad 3.

- Crearemos dos alumnos. Al primero lo matricularemos en la asignatura de levitación y le añadiremos
el conjuro Volador, imprimiremos a este alumno para ver si se ha matriculado correctamente. Volveremos a
matricularlo en la asignatura de levitación y lo imprimiremos de nuevo para comprobar que no se
duplican las asignaturas.

- Al segundo alumno lo matricularemos en la asignatura de Conjuros Oscuros y le añadiremos
el conjuro Volador y el de BorrarRecuerdos, imprimiremos a este alumno para ver que no debe
matricularse en el hechizo Volador porque su dificultad es mayor que el nivel de la asignatura.

- Imprime cuántos personajes se han creado en esta simulación.
