package org.example;

import java.util.SplittableRandom;

public class Proyecto {
    public int idProyec;
    public String nomProye;
    public  String fechaInicio;
    public String fechaFin;

    public Proyecto(int idProyec, String nomProye, String fechaInicio, String fechaFin) {
        this.idProyec = idProyec;
        this.nomProye = nomProye;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Proyecto() {
    }

    public int getIdProyec() {
        return idProyec;
    }

    public void setIdProyec(int idProyec) {
        this.idProyec = idProyec;
    }

    public String getNomProye() {
        return nomProye;
    }

    public void setNomProye(String nomProye) {
        this.nomProye = nomProye;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        return "Proyecto{" +
                "idProyec=" + idProyec +
                ", nomProye='" + nomProye + '\'' +
                ", fechaInicio='" + fechaInicio + '\'' +
                ", fechaFin='" + fechaFin + '\'' +
                '}';
    }
}
