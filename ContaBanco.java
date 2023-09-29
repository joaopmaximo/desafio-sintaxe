package contabanco;

import java.util.Scanner;

public class ContaBanco {

    public static void main(String[] args) {
        int numero = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = .0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, digite seu nome!");
        nomeCliente = scan.nextLine();
        System.out.println("Por favor, digite o número da conta!");
        numero = scan.nextInt();
        System.out.println("Por favor, digite o número da agência!");
        agencia = scan.next();
        System.out.println("Por favor, digite o valor do saldo!");
        saldo = scan.nextDouble();

        ContaTerminal conta1 = new ContaTerminal(numero, agencia, nomeCliente, saldo);
        conta1.exibirDetalhesConta();
    }

}
