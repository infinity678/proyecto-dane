package com.mycompany.proyectodane;

public class Departamento {
    private String nombre;
    private int numeroMunicipios;
    private double extension;
    private int numeroHabitantes;
    private double temperatura;
    private int indicativoTelefonico;

    public Departamento(String nombre, int numeroMunicipios, double extension, int numeroHabitantes, double temperatura, int indicativoTelefonico) {
        this.nombre = nombre;
        this.numeroMunicipios = numeroMunicipios;
        this.extension = extension;
        this.numeroHabitantes = numeroHabitantes;
        this.temperatura = temperatura;
        this.indicativoTelefonico = indicativoTelefonico;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroMunicipios() {
        return numeroMunicipios;
    }

    public double getExtension() {
        return extension;
    }

    public int getNumeroHabitantes() {
        return numeroHabitantes;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public int getIndicativoTelefonico() {
        return indicativoTelefonico;
    }
}
