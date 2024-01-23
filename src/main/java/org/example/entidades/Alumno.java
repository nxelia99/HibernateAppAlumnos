package org.example.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="lumno")
@Table(name="alumnos")

public class Alumno{
    @Id
    private int id;
    private String nombre;
    private String apellidos;
    private String curso;
    private int numeroasignaturas;
    private int edad;

    public Alumno(){}

    public Alumno(String nombre, String apellidos, String curso, int numeroasignaturas, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.curso = curso;
        this.numeroasignaturas = numeroasignaturas;
        this.edad = edad;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getNumeroasignaturas() {
        return numeroasignaturas;
    }

    public void setNumeroasignaturas(int numeroasignaturas) {
        this.numeroasignaturas = numeroasignaturas;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
