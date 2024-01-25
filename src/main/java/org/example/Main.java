package org.example;

import org.example.entidades.Alumno;
import java.util.List;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //empezar la conexión
        Acceso.setup();

        //pedir datos del alumno
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserte los datos del alumno:");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Apellidos: ");
        String apellidos = scanner.nextLine();

        System.out.print("Curso: ");
        String curso = scanner.nextLine();

        System.out.print("Número de asignaturas: ");
        int numasignaturas = scanner.nextInt();

        System.out.print("Edad: ");
        int edad = scanner.nextInt();

        //crear el alumno con los datos introducidos por consola
        Alumno nuevoalumno = new Alumno();
        nuevoalumno.setNombre(nombre);
        nuevoalumno.setApellidos(apellidos);
        nuevoalumno.setCurso(curso);
        nuevoalumno.setNumeroasignaturas(numasignaturas);
        nuevoalumno.setEdad(edad);

        //insertar alumno

        Acceso.insertarAlumno(nuevoalumno);

        // Listar alumnos
        List<Alumno> listaAlumnos = Acceso.listarAlumnos();
        System.out.println("\nLista de Alumnos:");
        for (Alumno alumno : listaAlumnos) {
            System.out.println(alumno.getNombre() + " " + alumno.getApellidos()
            + " " + alumno.getCurso() + " " + alumno.getNumeroasignaturas() + " " +
                    alumno.getEdad());
        }
        Acceso.exit();

    }
}