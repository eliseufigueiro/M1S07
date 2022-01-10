package Ex6;

import Ex3.Empregado;

public class Vendedor extends Empregado {

    private Double valorVendas;
    private Double comissao;

    public Vendedor(Double valorVendas, Double comissao) {
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public Vendedor(String nome, String endereco, Integer codigoSetor, Double salarioBase, Double imposto, Double valorVendas, Double comissao) {
        super(nome, endereco, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public Vendedor(String nome, String endereco, String telefone, Integer codigoSetor, Double salarioBase, Double imposto, Double valorVendas, Double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public Double getValorVendas() {

        return valorVendas;
    }

    public void setValorVendas(Double valorVendas) {

        this.valorVendas = valorVendas;
    }

    public Double getComissao() {

        return comissao;
    }

    public void setComissao(Double comissao) {

        this.comissao = comissao;
    }

    public Double calculaComissao() {

        return (getComissao() / 100) * getValorVendas();
    }

    @Override
    public Double calcularSalario() {
        return (getSalarioBase() + calculaComissao()) - ((getImposto() / 100) * (getSalarioBase() + calculaComissao()));
    }

    @Override
    public String toString() {

        return "\n" +
                "------------------------------\n" +
                "           VENDEDOR           \n" +
                "------------------------------\n" +
                "Nome: " + getNome() + "\n" +
                "Endereço: " + getEndereco() + "\n" +
                "Telefone: " + getTelefone() + "\n" +
                "Código Setor: " + getCodigoSetor() + "\n" +
                "Salário Base: " + String.format("%.2f", getSalarioBase()) + "\n" +
                "Comissão por Vendas: " + String.format("%.2f", calculaComissao()) + "\n" +
                "Porcentagem de impostos: " + String.format("%.2f", getImposto()) + "%" + "\n" +
                "Salário a Receber: " + String.format("%.2f", calcularSalario()) + "\n"
                ;
    }
}
