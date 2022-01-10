package Ex7;

public class Cachorro extends Animal{

    public Cachorro(String nome, Integer idade) {
        super(nome, idade);
    }

    public void deveCorrer() {

        System.out.println("Deve correr!");
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                '}';
    }
}
