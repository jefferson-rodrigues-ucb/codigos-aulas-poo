package org.example.model;

public abstract class SUV extends Carro {
    private boolean seteLugares;
    private boolean recolheuLugares;

    public SUV(float volumeMalas) {
        super(volumeMalas);
        seteLugares = false;
        recolheuLugares = true;
    }

    public SUV(float volumeMalas, boolean seteLugares) {
        super(volumeMalas);
        this.seteLugares = seteLugares;
        recolheuLugares = false;
    }

    public float getVolumePortaMalas() {
        if (seteLugares && recolheuLugares) {
            return super.getVolumePortaMalas() * 2;
        }
        return super.getVolumePortaMalas();
    }

    public void alterarLugares() {
        recolheuLugares = !recolheuLugares;
    }

    protected boolean seteLugares() {
        return seteLugares;
    }
}
