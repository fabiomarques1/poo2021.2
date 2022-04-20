package contacorrente;

public class Conta implements ContaBancaria{
    private int codigoBanco;
    private String nomeBanco;
    private int numeroAgencia;
    private int numeroConta;
    private long cpfTitular;
    private String nomeTitular;
    private double saldo = 0;
    
    @Override
    public boolean depositar(double valorDeposito) {
        if (valorDeposito > 0) {
            this.saldo = this.saldo + valorDeposito;
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public boolean sacar(double valorSaque) {
        if (valorSaque > 0 && this.saldo >= valorSaque) {
            this.saldo = this.saldo - valorSaque;
            return true;
        } else {
            return false;
        }
    }
    
    @Override
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

    public int getCodigoBanco() {
        return codigoBanco;
    }

    public void setCodigoBanco(int codigoBanco) {
        this.codigoBanco = codigoBanco;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public long getCpfTitular() {
        return cpfTitular;
    }

    public void setCpfTitular(long cpfTitular) {
        this.cpfTitular = cpfTitular;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}
