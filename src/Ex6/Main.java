package Ex6;

import Ex5.Operario;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Programa Cadastro Empregado Vendedor teste! \n");

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

        System.out.print("Valor de Vendas: ");
        Double valorVendas = sc.nextDouble();

        System.out.print("Porcentagem Comissão: ");
        Double valorComissao = sc.nextDouble();

        System.out.print("Porcentagem Impostos: ");
        Double porcentagemImpostos = sc.nextDouble();

        Vendedor vendedor = new Vendedor(nome, endereco, telefone, codigoSetor, salarioBase, porcentagemImpostos, valorVendas, valorComissao);

        System.out.println(vendedor);
    }
}
