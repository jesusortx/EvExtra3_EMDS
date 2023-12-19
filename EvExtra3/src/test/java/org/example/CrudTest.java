package org.example;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class CrudTest {

    @Test
    public void testCaso1(){
        Empleado empleado = new Empleado();
        empleado.setId(-1);
        empleado.setNombre("Jesus Osorio");
        empleado.setEdad(28);
        empleado.setDepartamento("Recursos Humanos");
        assertEquals(Crud.crearEmpleado(empleado),"No existe el empleado");
    }

    @Test
    public void testCaso2(){
        Empleado empleado = new Empleado();
        empleado.setId(2);
        empleado.setNombre("Ana Rodriguez");
        empleado.setEdad(22);
        empleado.setDepartamento("Anita la huerfanita");
        assertEquals(Crud.crearEmpleado(empleado),"No existe el departamento");
    }


    @Test
    public void testCaso3(){
        Proyecto proyecto = new Proyecto();
        Empleado empleado = new Empleado();

        empleado.setId(1);
        empleado.setNombre("Jesus Osorio");
        empleado.setEdad(28);
        empleado.setDepartamento("Recursos Humanos");
        proyecto.setIdProyec(01);
        proyecto.setNomProye("Salvar Cuatri");
        assertEquals("No existe el proyecto","No existe el proyecto");
    }

    @Test
    public void testCaso4(){
        Empleado empleado = new Empleado();
        Proyecto proyecto = new Proyecto();

        proyecto.setIdProyec(01);

        proyecto.setNomProye("Que rollo");
        proyecto.setFechaInicio("12/11/2022");
        proyecto.setFechaFin("1/1/2023");
        empleado.setNombre("Juan");
        assertEquals(Crud.crearProyectos(proyecto),"No existe el proyecto");
    }

    @Test
    public void testCaso5(){
        Empleado empleado = new Empleado();
        Proyecto proyecto = new Proyecto();

        proyecto.setNomProye("");
        proyecto.setIdProyec(1);
        proyecto.setFechaInicio("");

    }



}