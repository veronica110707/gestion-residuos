package com.residuos.model;

/**
 * Clase que representa un contenedor de basura.
 */
public class Contenedor {

    private int id;
    private String ubicacion;
    private int nivelLlenado;

    /**
     * Actualiza el nivel de basura del contenedor.
     */
    public void actualizarNivel(int nivel) {
        this.nivelLlenado = nivel;
    }
}