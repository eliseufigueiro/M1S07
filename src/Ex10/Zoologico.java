package Ex10;

import Ex7.Animal;
import Ex7.Cachorro;
import Ex7.Cavalo;
import Ex7.Preguica;

import java.util.Arrays;

public class Zoologico {

    private Animal[] jaulas;

    public Zoologico() {

        this.jaulas = new Animal[10];
    }

    public void colocaAnimalJaula() {

        jaulas[0] = new Cachorro("Bob", 9);
        jaulas[1] = new Cachorro("Tom", 11);
        jaulas[2] = new Cavalo("Tornado", 6);
        jaulas[3] = new Cavalo("Alazão", 5);
        jaulas[4] = new Preguica("Dormindo", 8);
        jaulas[5] = new Cachorro("Dog", 5);
        jaulas[6] = new Cavalo("Bagual", 2);
        jaulas[7] = new Preguica("Soneca", 1);
        jaulas[8] = new Cachorro("Marley", 7);
        jaulas[9] = new Preguica("Farofa", 4);
    }

    public void qualAnimalTemNaJaula() {

        for (Animal animal : jaulas) {
            System.out.println("\nNO ZOO " + animal);
            animal.deveEmitirSom();
            if (animal instanceof Cachorro) {
                ((Cachorro) animal).deveCorrer();
            }

            if (animal instanceof Cavalo) {
                ((Cavalo) animal).deveCorrer();
            }
        }
    }
}
