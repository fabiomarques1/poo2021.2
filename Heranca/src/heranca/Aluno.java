
package heranca;

public class Aluno extends Pessoa {
    private long matricula;
    private String curso;

    public Aluno() {
    }

    public Aluno(String nome) {
        super(nome);
    }

    public Aluno(String nome, int idade, char sexo, long matricula, String curso) {
        super(nome, idade, sexo);
        this.matricula = matricula;
        this.curso = curso; 
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public String cancelarMatricula() {
        return "Cancelando a matrícula";
    }

    @Override
    public String toString() {
        return "Aluno{" + super.toString() + ", matricula=" + matricula + ", curso=" + curso + '}';
    }
    
    
}
