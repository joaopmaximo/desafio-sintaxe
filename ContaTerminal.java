package contabanco;

public class ContaTerminal {
    public int numero;
    public String agencia;
    public String nomeCliente;
    public double saldo;

    public ContaTerminal() {

    }

    public ContaTerminal(int num, String agencia, String nomeCliente, double saldo) {
        this.numero = num;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public void exibirDetalhesConta() {
        System.out.println("Olá " + this.nomeCliente + ", "
                + "obrigado por criar uma conta em nosso banco, "
                + "sua agência é " + this.agencia + ", "
                + "conta " + this.numero + " e seu saldo R$" + this.saldo + " "
                + "já está disponível para saque.");
    }
}
