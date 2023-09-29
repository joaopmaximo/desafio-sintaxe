package contabanco;

public class ContaTerminal {
    public int numero;
    public String agencia;
    public String nomeCliente;
    public float saldo;
    
    public ContaTerminal() {
        
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public void exibirDetalhesConta() {
        System.out.println("Olá " + this.nomeCliente + ", "
                + "obrigado por criar uma conta em nosso banco, "
                + "sua agência é " + this.agencia + ", "
                + "conta " + this.numero + " e seu saldo " + this.saldo + ", "
                + "já está disponível para saque");
    }
}
