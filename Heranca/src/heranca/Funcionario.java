package heranca;

public class Funcionario extends Pessoa {
    
    private static String setor;
    private boolean trabalhando;

    public Funcionario() {
    }

    public Funcionario(String nome) {
        super(nome);
    }

    public Funcionario(String setor, boolean trabalhando, String nome, int idade, char sexo) {
        super(nome, idade, sexo);
        this.setor = setor;
        this.trabalhando = trabalhando;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
   
    public void mudarSituacao() {
        this.trabalhando = !this.trabalhando;
    }
    
    @Override
    public String toString() {
        return "Funcionario{" + super.toString() + ", setor=" + setor + ", trabalhando=" + trabalhando + '}';
    }
    
}
