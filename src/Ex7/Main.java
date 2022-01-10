package Ex7;

public class Main {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Bob", 3);
        System.out.println(cachorro);
        cachorro.deveEmitirSom();
        cachorro.deveCorrer();
        System.out.println();

        Cavalo cavalo = new Cavalo("Pé de Pano", 5);
        System.out.println(cavalo);
        cavalo.deveEmitirSom();
        cavalo.deveCorrer();
        System.out.println();

        Preguica preguica = new Preguica("Nanando", 7);
        System.out.println(preguica);
        preguica.deveEmitirSom();
        preguica.deveSubirEmArvores();

    }
}
