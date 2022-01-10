package Ex5;

import Ex4.Administrador;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Programa Cadastro Empregado Operario teste! \n");

        System.out.print("Nome Empregado: ");
        String nome = sc.nextLine();

        System.out.print("Endereço Empregado: ");
        String endereco = sc.nextLine();

        System.out.print("Telefone Empregado: ");
        String telefone = sc.next();

        System.out.print("Informe o Códido do Setor: ");
        Integer codigoSetor = sc.nextInt();

        System.out.print("Salário Base: ");
        Double salarioBase = sc.nextDouble();

        System.out.print("Valor de Produção: ");
        Double valorProducao = sc.nextDouble();

        System.out.print("Porcentagem Comissão: ");
        Double valorComissao = sc.nextDouble();

        System.out.print("Porcentagem Impostos: ");
        Double porcentagemImpostos = sc.nextDouble();

        Operario operario = new Operario(nome, endereco, telefone, codigoSetor, salarioBase, porcentagemImpostos, valorProducao, valorComissao);

        System.out.println(operario);
    }
}
