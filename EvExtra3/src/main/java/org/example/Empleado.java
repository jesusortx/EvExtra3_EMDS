package org.example;

public class Empleado {
    public int id;
    public String nombre;
    public int edad;
    public String departamento;

    public Empleado() {
    }

    public Empleado(int id, String nombre, int edad, String departamento) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.departamento = departamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", departamento='" + departamento + '\'' +
                '}';
    }
}
