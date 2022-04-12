package contacorrente;

public class Conta {
    int codigoBanco;
    String nomeBanco;
    int numeroAgencia;
    int numeroConta;
    long cpfTitular;
    String nomeTitular;
    double saldo = 0;
    
    public boolean depositar(double valorDeposito) {
        if (valorDeposito > 0) {
            this.saldo = this.saldo + valorDeposito;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean sacar(double valorSaque) {
        if (valorSaque > 0 && this.saldo >= valorSaque) {
            this.saldo = this.saldo - valorSaque;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean transferir(double valorTransferencia, Conta contaDestino) {
        if (valorTransferencia > 0 && this.saldo >= valorTransferencia) {
            this.saldo = this.saldo - valorTransferencia;
            contaDestino.depositar(valorTransferencia);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Conta{" + "codigoBanco=" + codigoBanco + ", nomeBanco=" + nomeBanco + ", numeroAgencia=" + numeroAgencia + ", numeroConta=" + numeroConta + ", cpfTitular=" + cpfTitular + ", nomeTitular=" + nomeTitular + ", saldo=" + saldo + '}';
    }
    
    
}
