package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        /*
        * Una empresa necesita desarrolar un crud con arrayList de empleados y proyectos,
        * Atributos empleado: id, nombre, edad, deoartamento
        *Atributos proyecto: id, nombre proyecto, fecha de incio, fecha de fin.
        *
        * como puedo desarrollar un crud para ambos, con funcionalidades:
        * Asignar empleado a proyecto
        * Listar empleados por proyecto
        * Listar proyectos por empleado
        *
        * Requisitos especificos:
        * El id del empleado y proyecto son unicos
        * el nombre del empleado y del proyecto no pueden estar vacios
        * La edad del empleado debe ser un numero positivo
        * El sistema debe usar ciclos repetitivos para el crud

        * private boolean empleadoValido(Empleado empleado) {
        return empleado != null &&
               empleado.getEdad() >= 0 &&
               !empleado.getNombre().isEmpty();
    }

    private boolean existeEmpleado(int id) {
        for (Empleado empleado : empleados) {
            if (empleado.getId() == id) {
                return true;
            }
        }
        return false;
        *
        *
        *
        * debo seguir las buenas practicas de TDD, así como haré casos de prueba y usare JUnit 4
        **/
    }
}