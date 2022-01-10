package Ex7;

public class Preguica extends Animal {

    public Preguica(String nome, Integer idade) {
        super(nome, idade);
    }

    public void deveSubirEmArvores() {

        System.out.println("Deve subir em árvores!");
    }

    @Override
    public String toString() {
        return "Preguiça{" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                '}';
    }
}
