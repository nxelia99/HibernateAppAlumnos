package org.example;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Acceso {
    private static final String URL = "jdbc:mysql://localhost: ";
    private static final String USER = "root";
    private static final String PASSWORD = " ";
    private static Connection connection;

    public static void conectar() {
        try {
            // datos para la conexión
            String url = "jdbc:mysql://localhost:3306/alumnosdb";
            String usuario = "root";
            String contraseña = "";

            connection = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("Conexión establecida con la base de datos");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void desconectar() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Conexión cerrada");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static <Alumno> void insertarAlumno(Alumno) {
        try {
            Statement statement = connection.createStatement();
            Scanner sc = new Scanner(System.in);
            System.out.println("Inserte los siguientes datos del alumno:");
            System.out.println("Nombre:");
            String nombrealumno = sc.nextLine();
            System.out.println("Apellidos:");
            String apellidosalumno = sc.nextLine();
            System.out.println("Curso:");
            String cursoalumno = sc.nextLine();
            System.out.println("Número de asignaturas:");
            String numasignaturasalumno = sc.nextLine();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void listarAlumnos(){
        ResultSet resultset = null;
        Statement statement = null;
        try{
        statement = connection.createStatement();
        resultset = statement.executeQuery("SELECT * FROM alumnos;");
        // Insertar el alumno
        List<Alumno> alumnos = new ArrayList<>();
        while(resultset.next()){
            Integer id = resultset.getInt("id");
            String nombre = resultset.getString("nombre");
            String apellidos = resultset.getString("apellidos");
            String curso = resultset.getString("curso");
            int numasignaturas = resultset.getInt("numasignaturas");
            int edad = resultset.getInt("edad");
        }
        statement.close();
    }catch (SQLException e){
            e.printStackTrace();
        }

} }
