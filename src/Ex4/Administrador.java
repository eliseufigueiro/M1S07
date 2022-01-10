package Ex4;

import Ex3.Empregado;

public class Administrador extends Empregado {

    private Double ajudaDeCusto;

    public Administrador() {

    }

    public Administrador(String nome, String endereco, Integer codigoSetor, Double salarioBase, Double imposto, Double ajudaDeCusto) {
        super(nome, endereco, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public Administrador(String nome, String endereco, String telefone, Integer codigoSetor, Double salarioBase, Double imposto, Double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public Double getAjudaDeCusto() {

        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(Double ajudaDeCusto) {

        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public Double calcularSalario() {

        return super.calcularSalario() + getAjudaDeCusto();
    }

    @Override
    public String toString() {
        return "\n" +
                "------------------------------\n" +
                "        ADMINISTRADOR         \n" +
                "------------------------------\n" +
                "Nome: " + getNome() + "\n" +
                "Endereço: " + getEndereco() + "\n" +
                "Telefone: " + getTelefone() + "\n" +
                "Código Setor: " + getCodigoSetor() + "\n" +
                "Salário Base: " + String.format("%.2f", getSalarioBase()) + "\n" +
                "Porcentagem de impostos: " + String.format("%.2f", getImposto()) + "%" + "\n" +
                "Ajuda de Custo: " + String.format("%.2f", getAjudaDeCusto()) + "%" + "\n" +
                "Salário a Receber: " + String.format("%.2f", calcularSalario()) + "\n"
                ;
    }
}
