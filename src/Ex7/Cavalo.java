package Ex7;

public class Cavalo extends Animal {

    public Cavalo(String nome, Integer idade) {
        super(nome, idade);
    }

    public void deveCorrer() {

        System.out.println("Deve correr!");
    }

    @Override
    public String toString() {
        return "Cavalo{" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                '}';
    }
}
