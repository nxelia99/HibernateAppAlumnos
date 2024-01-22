En una pequeña academia se quiere crear una aplicación para la gestión de alta de alumnos en la base de datos. Para ello, 
se plantea usar Hibernate y MySQL.

La aplicación pedirá usuarios por consola y los dará de alta en la base de datos siendo necesarios ciertos datos.
La columna id es la clave primaria y autoincrement.
Dicha aplicación deberá poder almacenar nuevos datos de alumnos. 

RESUELVE

- Crea una tabla en la base de datos para almacenar los alumnos.
- Crea un proyecto en Eclipse o Netbeans mediante Maven y configura las dependencias de Hibernate.
- Crea el archivo de configuración para tu base de datos.
- Crea una clase POJO llamada Alumno que sirva para almacenar los datos de un alumno y anótala para poder realizar la persistencia en sesiones de Hibernate.
- Crea una clase Java llamada Acceso para gestionar las sesiones de hibernate y que implemente los siguientes métodos públicos.

-Acceso.insertarAlumno(Alumno): Este método inserta un nuevo alumno  que recibe como parámetro en la base de datos.
-Acceso.listarAlumnos(): Este método lista todos los alumnos que hay en la base de datos.
