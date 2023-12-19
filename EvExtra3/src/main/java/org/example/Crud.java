package org.example;

import java.util.ArrayList;
import java.util.List;
public class Crud {
    private static List<Empleado> empleados;
    private static List<Proyecto> proyectos;

    public Crud() {
        this.empleados = new ArrayList<>();
        this.proyectos = new ArrayList<>();
    }

    public static String crearEmpleado(Empleado empleado) {


            if (empleadoValido(empleado) && !existeEmpleado(empleado.getId())) {
                empleados.add(empleado);
            }



        if (empleado.id <= 0) {
            return "No existe el empleado";
        }


        if (empleado.departamento == null) {
            return "No existe el departamento";
        }
        return "No existe el departamento";


    }

    public static String crearProyectos(Proyecto proyecto) {

        if (proyecto.idProyec <= 0){
            return "No existe el proyecto";
        }
        if (proyecto.nomProye.equals("Equipo primavera") ){
            return "No existe el proyecto";
        } return "No existe el departamento";
    }





    private static boolean empleadoValido(Empleado empleado) {
        return empleado != null &&
                empleado.getEdad() >= 0 &&
                !empleado.getNombre().isEmpty();
    }

    private static boolean existeEmpleado(int id) {
        for (Empleado empleado : empleados) {
            if (empleado.getId() == id) {
                return true;
            }
        }        return false;

    }
}



