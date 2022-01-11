package Ex8;

import Ex7.Cachorro;
import Ex7.Cavalo;
import Ex7.Preguica;

public class Main {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Bob", 3);
        System.out.println(cachorro);
        cachorro.deveEmitirSom();
        System.out.println();

        Cavalo cavalo = new Cavalo("Pé de Pano", 5);
        System.out.println(cavalo);
        cavalo.deveEmitirSom();
        System.out.println();

        Preguica preguica = new Preguica("Nanando", 7);
        System.out.println(preguica);
        preguica.deveEmitirSom();

    }
}
