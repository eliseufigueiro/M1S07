package Ex7;

public class Preguica extends Animal {

    public Preguica(String nome, Integer idade) {

        super(nome, idade);
    }

    @Override
    public void deveEmitirSom() {

        System.out.println("Geme!");
    }

    public void deveSubirEmArvores() {

        System.out.println("Deve subir em árvores!");
    }

    @Override
    public String toString() {
        return "A PREGUIÇA " + getNome() + " de " + getIdade() + " anos";
    }
}
