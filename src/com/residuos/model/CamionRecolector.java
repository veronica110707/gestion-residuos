package com.residuos.model;

/**
 * Camión especializado en la recogida de residuos.
 */
public class CamionRecolector extends Vehiculo {

    public CamionRecolector() {}

    public CamionRecolector(String matricula, double capacidad) {
        super(matricula, capacidad);
    }
}