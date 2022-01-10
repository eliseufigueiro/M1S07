package Ex5;

import Ex3.Empregado;

public class Operario extends Empregado {

    private Double valorProducao;
    private Double comissao;

    public Operario() {

    }

    public Operario(String nome, String endereco, Integer codigoSetor, Double salarioBase, Double imposto, Double valorProducao, Double comissao) {
        super(nome, endereco, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public Operario(String nome, String endereco, String telefone, Integer codigoSetor, Double salarioBase, Double imposto, Double valorProducao, Double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public Double getValorProducao() {

        return valorProducao;
    }

    public void setValorProducao(Double valorProducao) {

        this.valorProducao = valorProducao;
    }

    public Double getComissao() {

        return comissao;
    }

    public void setComissao(Double comissao) {

        this.comissao = comissao;
    }

    public Double calculaComissao() {

        return (getComissao() / 100) * getValorProducao();
    }

    @Override
    public Double calcularSalario() {

        return (getSalarioBase() + calculaComissao()) - ((getImposto() / 100) * (getSalarioBase() + calculaComissao()));
    }

    @Override
    public String toString() {

        return "\n" +
                "------------------------------\n" +
                "           OPERARIO           \n" +
                "------------------------------\n" +
                "Nome: " + getNome() + "\n" +
                "Endereço: " + getEndereco() + "\n" +
                "Telefone: " + getTelefone() + "\n" +
                "Código Setor: " + getCodigoSetor() + "\n" +
                "Salário Base: " + String.format("%.2f", getSalarioBase()) + "\n" +
                "Comissão por Produção: " + String.format("%.2f", calculaComissao()) + "\n" +
                "Porcentagem de impostos: " + String.format("%.2f", getImposto()) + "%" + "\n" +
                "Salário a Receber: " + String.format("%.2f", calcularSalario()) + "\n"
                ;
    }
}
