package Ex9;

import Ex7.Animal;

public class Veterinario {

    private Animal animal;

    public Veterinario(Animal animal) {

        this.animal = animal;
    }

    public void examinar() {

        this.animal.deveEmitirSom();
    }
}
