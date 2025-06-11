package org.example.model;

public class SW4 extends SUV {

    public SW4(float volumeMalas, boolean seteLugares) {
        super(volumeMalas, seteLugares);
    }

    @Override
    public String toString() {
        return "SUV SW4" +
                "\nQuantidade de Lugares: " + (seteLugares() ? 7 : 5) +
                "\nLitros Porta-malas: " + getVolumePortaMalas() + "L\n";
    }
}
