
package agregacao;

public class Pessoa {
    private long cpf;
    private String nome;
    private Endereco enderecoCobranca;
    private Endereco enderecoEntrega;
    
    public Pessoa(long cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }
    
    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEnderecoCobranca() {
        return enderecoCobranca;
    }

    public void setEnderecoCobranca(Endereco enderecoCobranca) {
        this.enderecoCobranca = enderecoCobranca;
    }

    public Endereco getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(Endereco enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "cpf=" + cpf + ", nome=" + nome + ", enderecoCobranca=" + enderecoCobranca + ", enderecoEntrega=" + enderecoEntrega + '}';
    }
    
    
    
}
