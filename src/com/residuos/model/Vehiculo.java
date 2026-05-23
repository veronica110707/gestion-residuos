package com.residuos.model;

/**
 * Clase que representa un vehículo del sistema de recogida de residuos.
 */
public class Vehiculo {

    private String matricula;
    private double capacidad;

    public Vehiculo() {}

    public Vehiculo(String matricula, double capacidad) {
        this.matricula = matricula;
        this.capacidad = capacidad;
    }

    /**
     * Método para iniciar la ruta del vehículo.
     * De momento no está implementado.
     */
    public void iniciarRuta() {
        // pendiente de implementar la lógica
        throw new UnsupportedOperationException("No implementado todavía");
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }
}