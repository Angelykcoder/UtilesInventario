package com.mycompany.inventario;

import java.util.ArrayList;

public class Nivel {

    private String codigo;
    private String nombre;

    private static final ArrayList<Nivel> NIVELES = new ArrayList<>();

    // Constructor privado
    private Nivel(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    // Inicializar todos los niveles
    public static void inicializarNiveles() {
        NIVELES.clear();

        // Stages
        NIVELES.add(new Nivel("S5", "Stage 5"));
        NIVELES.add(new Nivel("S6", "Stage 6"));

        // Grados con formato inglés
        NIVELES.add(new Nivel("1st", "1st"));
        NIVELES.add(new Nivel("2nd", "2nd"));
        NIVELES.add(new Nivel("3rd", "3rd"));
        NIVELES.add(new Nivel("4th", "4th"));
        NIVELES.add(new Nivel("5th", "5th"));
        NIVELES.add(new Nivel("6th", "6th"));
    }

    public static ArrayList<Nivel> getTodosLosNiveles() {
        return NIVELES;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}