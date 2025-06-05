package com.mycompany.proyectodane;

import java.util.ArrayList;

public class ProyectoDANE {

    public static void ejecutar() {
        ArrayList<Departamento> departamentos = new ArrayList<>();

        departamentos.add(new Departamento("Antioquia", 125, 630000.0, 6500000, 22.0, 4));
        departamentos.add(new Departamento("Cundinamarca", 116, 240000.0, 2900000, 18.5, 1));
        departamentos.add(new Departamento("Amazonas", 11, 1100000.0, 76000, 27.0, 8));

        System.out.println("===== DATOS DEPARTAMENTALES =====");
        for (Departamento d : departamentos) {
            System.out.println("Departamento: " + d.getNombre());
            System.out.println("  Municipios: " + d.getNumeroMunicipios());
            System.out.println("  Extensión: " + d.getExtension() + " m²");
            System.out.println("  Habitantes: " + d.getNumeroHabitantes());
            System.out.println("  Temperatura: " + d.getTemperatura() + " °C");
            System.out.println("  Indicativo: +" + d.getIndicativoTelefonico());
            System.out.println("----------------------------------------");
        }

        Departamento mayorExtension = departamentos.get(0);
        Departamento menorTemperatura = departamentos.get(0);
        Departamento mayorHabitantes = departamentos.get(0);
        Departamento menorExtension = departamentos.get(0);

        for (Departamento d : departamentos) {
            if (d.getExtension() > mayorExtension.getExtension()) {
                mayorExtension = d;
            }
            if (d.getTemperatura() < menorTemperatura.getTemperatura()) {
                menorTemperatura = d;
            }
            if (d.getNumeroHabitantes() > mayorHabitantes.getNumeroHabitantes()) {
                mayorHabitantes = d;
            }
            if (d.getExtension() < menorExtension.getExtension()) {
                menorExtension = d;
            }
        }

        System.out.println("\n--- RESULTADOS DEL ANÁLISIS ---");
        System.out.println("📏 Departamento con mayor extensión: " + mayorExtension.getNombre() + " (" + mayorExtension.getExtension() + " m²)");
        System.out.println("❄️ Departamento con menor temperatura: " + menorTemperatura.getNombre() + " (" + menorTemperatura.getTemperatura() + " °C)");
        System.out.println("👥 Departamento con mayor número de habitantes: " + mayorHabitantes.getNombre() + " (" + mayorHabitantes.getNumeroHabitantes() + ")");
        System.out.println("📐 Departamento con menor extensión: " + menorExtension.getNombre() + " (" + menorExtension.getExtension() + " m²)");
    }
}
