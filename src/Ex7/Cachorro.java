package Ex7;

public class Cachorro extends Animal{

    public Cachorro(String nome, Integer idade) {

        super(nome, idade);
    }

    @Override
    public void deveEmitirSom() {
        System.out.println("Late au au!");
    }

    public void deveCorrer() {

        System.out.println("Sempre Corre!");
    }

    @Override
    public String toString() {
        return "O CACHORRO " + getNome() + " de " + getIdade() + " anos";
    }
}
