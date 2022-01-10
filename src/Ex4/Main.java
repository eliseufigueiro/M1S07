package Ex4;

import Ex3.Empregado;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Programa Cadastro Empregado Administrador teste! \n");

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

        System.out.print("Porcentagem Impostos: ");
        Double porcentagemImpostos = sc.nextDouble();

        System.out.print("Valor Ajuda de Custo: ");
        Double ajudaDeCusto = sc.nextDouble();

        Administrador administrador = new Administrador(nome, endereco, telefone, codigoSetor, salarioBase, porcentagemImpostos, ajudaDeCusto);

        System.out.println(administrador);
    }
}
