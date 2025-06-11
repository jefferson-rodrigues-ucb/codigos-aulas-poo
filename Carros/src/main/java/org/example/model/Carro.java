package org.example.model;

public abstract class Carro {
    private float volumePortaMalas;

    public Carro(float volumeMalas) {
        this.volumePortaMalas = volumeMalas;
    }

    public float getVolumePortaMalas() {
        return volumePortaMalas;
    }
}
