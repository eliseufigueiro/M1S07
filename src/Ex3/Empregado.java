package Ex3;

import Ex1.Pessoa;

public class Empregado extends Pessoa {

    private Integer codigoSetor;
    private Double salarioBase;
    private Double imposto;

    public Empregado() {

    }

    public Empregado(String nome, String endereco, Integer codigoSetor, Double salarioBase, Double imposto) {
        super(nome, endereco);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public Empregado(String nome, String endereco, String telefone, Integer codigoSetor, Double salarioBase, Double imposto) {
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public Integer getCodigoSetor() {

        return codigoSetor;
    }

    public void setCodigoSetor(Integer codigoSetor) {

        this.codigoSetor = codigoSetor;
    }

    public Double getSalarioBase() {

        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Double getImposto() {

        return imposto;
    }

    public void setImposto(Double imposto) {

        this.imposto = imposto;
    }

    public Double calcularSalario() {

        return getSalarioBase() - ((getImposto() / 100) * getSalarioBase());
    }

    @Override
    public String toString() {

        return "\n" +
                "------------------------------\n" +
                "          EMPREGADO           \n" +
                "------------------------------\n" +
                "Nome: " + getNome() + "\n" +
                "Endereço: " + getEndereco() + "\n" +
                "Telefone: " + getTelefone() + "\n" +
                "Código Setor: " + codigoSetor + "\n" +
                "Salário Base: " + String.format("%.2f", salarioBase) + "\n" +
                "Porcentagem de impostos: " + String.format("%.2f", imposto) + "%" + "\n" +
                "Salário a Receber: " + String.format("%.2f", calcularSalario()) + "\n"
                ;
    }
}
