package Ex9;

import Ex7.Cachorro;
import Ex7.Cavalo;
import Ex7.Preguica;

public class Main {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Dog", 3);
        Cavalo cavalo = new Cavalo("Alazão", 4);
        Preguica preguica = new Preguica("Dormente", 5);

        Veterinario veterinario = new Veterinario(cachorro);
        Veterinario veterinario1 = new Veterinario(cavalo);
        Veterinario veterinario2 = new Veterinario(preguica);

        System.out.println(cachorro);
        veterinario.examinar();
        System.out.println();
        System.out.println(cavalo);
        veterinario1.examinar();
        System.out.println();
        System.out.println(preguica);
        veterinario2.examinar();
    }
}
