package Ex2;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Programa Cadastro Fornecedor teste! \n");

        System.out.print("Nome Fornecedor: ");
        String nome = sc.nextLine();

        System.out.print("Endereço Fornecedor: ");
        String endereco = sc.nextLine();

        System.out.print("Telefone Fornecedor: ");
        String telefone = sc.next();

        System.out.print("Limite de crédito: ");
        Double valorCredito = sc.nextDouble();

        System.out.print("Fornecedor possui Dívida? (s/n): ");
        String possuiDivida = sc.next();
        if (possuiDivida.charAt(0) == 's') {
            System.out.print("Dívida atual: ");
            Double valorDivida = sc.nextDouble();

            Fornecedor fornecedor = new Fornecedor(nome, endereco, telefone, valorCredito, valorDivida);
            System.out.println(fornecedor);
        } else {
            Fornecedor fornecedor = new Fornecedor(nome, endereco, telefone, valorCredito);
            System.out.println(fornecedor);
        }
    }
}
