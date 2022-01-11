package Ex7;

public class Cavalo extends Animal {

    public Cavalo(String nome, Integer idade) {

        super(nome, idade);
    }

    @Override
    public void deveEmitirSom() {

        System.out.println("Relincha!");
    }

    public void deveCorrer() {

        System.out.println("Sempre Corre!");
    }

    @Override
    public String toString() {
        return "O CAVALO " + getNome() + " de " + getIdade() + " anos";
    }
}
