
package heranca;

public class Professor extends Pessoa {
    
    private String especialidade;
    private double salario;

    public Professor() {
    }

    public Professor(String nome) {
        super(nome);
    }
    
    public Professor(String nome, int idade, char sexo) {
        super(nome, idade, sexo);
    }

    public Professor(String nome, int idade, char sexo, String especialidade, double salario) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void receberAumento(double aumento) {
        this.salario += aumento;
    }
    
    @Override
    public String toString() {
        return "Professor{" + super.toString() + ", especialidade=" + especialidade + ", salario=" + salario + '}';
    }      
    
}
