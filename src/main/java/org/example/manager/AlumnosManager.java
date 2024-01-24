package org.example.manager;

import org.example.entidades.Alumno;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.Scanner;

public class AlumnosManager {
    private static StandardServiceRegistry registry;
    private static SessionFactory sessionFactory;

    public static void setup() {

        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        try {
            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        } catch (Exception ex) {
            StandardServiceRegistryBuilder.destroy(registry);
            System.out.println(ex);

        }
    }

    // función para cerrar la sesión de hibernate
    public static void exit() {
        try {
            sessionFactory.close();
        }catch (Exception e){
            System.out.println("Error");

        }
    }

    // crear alumno
    public void create(){
        try {
            Scanner sc = new Scanner(System.in);
            Alumno alumno = new Alumno();
            System.out.println("Introduzca los siguientes datos del alumno.");
            System.out.println("Nombre:");
            String nombre = sc.nextLine();
            alumno.setNombre(nombre);
            System.out.println("Apellidos:");
            String apellidos = sc.nextLine();
            alumno.setApellidos(apellidos);
            System.out.println("Curso:");
            String curso = sc.nextLine();
            alumno.setCurso(curso);
            System.out.println("Número de asignaturas:");
            int numasignaturas = sc.nextInt();
            alumno.setNumeroasignaturas(numasignaturas);
            System.out.println("Edad");
            int edad = sc.nextInt();
            alumno.setEdad(edad);

            Session session = sessionFactory.openSession();
            session.beginTransaction();

            session.save(alumno);

            session.getTransaction().commit();
            session.close();
        }catch (Exception e){
            System.out.println("Error creating");
        }
    }

    //leer los datos del alumno

    protected void read(){

    }

    // actualizar los datos del alumno

    protected void update(){

    }

    //eliminar un alumno
    protected void delete(){

    }
}
