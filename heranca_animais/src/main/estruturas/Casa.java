package main.estruturas;

import main.animais.Animal;
import main.animais.Domestico;

public class Casa {
    Animal animais[] = new Animal[20];

    public void adicionarAnimal(Domestico animal) {
        for (int i = 0; i < animais.length; i++) {
            if (animais[i] == null) {
                animais[i] = (Animal) animal;
                break;
            }
        }
    }

    public void mostrarAnimais() {
        for (int i = 0; i < animais.length; i++) {
            if (animais[i] != null) {
                System.out.println(animais[i]);
            }
        }
    }

}
