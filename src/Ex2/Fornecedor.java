package Ex2;

import Ex1.Pessoa;

public class Fornecedor extends Pessoa {

    private Double valorCredito;
    private Double valorDivida;

    public Fornecedor() {

    }

    public Fornecedor(String nome, String endereco, String telefone, Double valorCredito) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
    }

    public Fornecedor(String nome, String endereco, String telefone, Double valorCredito, Double valorDivida) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
        obterSaldo();
    }

    public Double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(Double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(Double valorDivida) {
        this.valorDivida = valorDivida;
    }

    //Metodo para obter o Saldo
    public Double obterSaldo() {
        return getValorCredito() - getValorDivida();
    }

    @Override
    public String toString() {
        return "\n" +
                "------------------------------\n" +
                "          FORNECEDOR          \n" +
                "------------------------------\n" +
                "Nome: " + getNome() + "\n" +
                "Endereço: " + getEndereco() + "\n" +
                "Telefone: " + getTelefone() + "\n" +
                "Limite Crédito Total: " + String.format("%.2f", valorCredito) + "\n" +
                "Valor Dívida: " + String.format("%.2f", valorDivida) + "\n" +
                "Limite Crédito Disponivél: " + String.format("%.2f", obterSaldo()) + "\n"
                ;
    }
}
