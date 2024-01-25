package org.example;

import org.example.entidades.Alumno;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.List;


public class Acceso {
    private static StandardServiceRegistry registry;
    private static SessionFactory sessionFactory;

    public static void setup() {

        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        try {
            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        } catch (Exception e) {
            StandardServiceRegistryBuilder.destroy(registry);
            System.out.println(e.getMessage());

        }
    }

    // función para cerrar la sesión de hibernate
    public static void exit() {
        try {
            sessionFactory.close();
        }catch (Exception e){
            System.out.println(e.getMessage());

        }
    }

    // crear alumno
    public static void insertarAlumno(Alumno alumno){

        try {

            Session session = sessionFactory.openSession();
            session.beginTransaction();

            session.persist(alumno);

            session.getTransaction().commit();
            session.close();

        }catch (Exception e){
            System.out.println("Error al crear: " + e.getMessage());
            e.printStackTrace();
        }
    }

    //listar los datos del alumno

    public static List<Alumno> listarAlumnos() {
        try{
            Session session = sessionFactory.openSession();
            return (session.createQuery("FROM Alumno", Alumno.class).list());
        }catch(Exception e){
            System.out.println("Error al listar" + e.getMessage());
        }
        return null;
    }



}
