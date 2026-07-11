package com.mycompany.inventario;

public class Profesor {

    // Atributos
    private String nombre;

    // Constructor vacío
    public Profesor() {
    }

    // Constructor con nombre
    public Profesor(String nombre) {
        this.nombre = nombre;
    }

    // Getter
    public String getNombre() {
        return nombre;
    }

    // Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método útil para mostrar
    @Override
    public String toString() {
        return nombre != null ? nombre : "Sin nombre";
    }
}