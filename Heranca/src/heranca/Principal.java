
package heranca;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Principal {
    

    public static void main(String[] args) {
    
        Visitante vist = new Visitante();
        vist.setIdade(25);
        System.out.println(vist.getIdade());
        
        
        Funcionario f1 = new Funcionario("Alessandro");
        f1.setSetor("Almoxarifado");
       
        
        Funcionario f2 = new Funcionario("Rogério");
        f2.setSetor("Financeiro");
        
        System.out.println("Setor de " + f1.getNome() + ": " + f1.getSetor());
        System.out.println("Setor de " + f2.getNome() + ": " + f2.getSetor());
        
        
        
        
        ArrayList<Aluno> alunos = new ArrayList<>();
        ArrayList<Professor> professores = new ArrayList<>();
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        
        String teclado;
        int opcao;

        loop:
        do {
            teclado = JOptionPane.showInputDialog("Informe a opção desejada:\n1- Aluno\n2- Professor"
                    + "\n3- Funcionário\n0- Sair");
            opcao = Integer.parseInt(teclado);

            switch (opcao) {
                case 0:
                    break loop;
                case 1:
                    alunos.add(aluno());
                    break;
                case 2:
                    professores.add(professor());
                    break;
                case 3:
                    funcionarios.add(funcionario());
                    break;
                default:
                    System.out.println("Opção Inválida");
            }

        } while (true);
        
        
        System.out.println("Imprimindo as listas...");
        
        for (Aluno a: alunos) {
            System.out.println(a);
        }
        
        for (Professor f: professores) {
            System.out.println(f);
        }
        
        for(Funcionario f: funcionarios) {
            System.out.println(f);
        }
        
        System.out.println("Encerrando o sistema.\nAté mais...");
        
    }
    
    public static Aluno aluno() {
        Aluno aluno = new Aluno();

        aluno.setNome(JOptionPane.showInputDialog("Informe o nome do(a) aluno(a):"));
        aluno.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do(a) aluno(a):")));
        aluno.setSexo(JOptionPane.showInputDialog("Informe o sexo do(a) aluno(a) [M ou F]:").toUpperCase().charAt(0));
        aluno.setMatricula(Long.parseLong(JOptionPane.showInputDialog("Informe a matrícula do(a) aluno(a):")));
        aluno.setCurso(JOptionPane.showInputDialog("Informe o nome do curso:"));

        System.out.println(aluno);

        System.out.println(aluno.cancelarMatricula());

        aluno.fazerAniversario();

        System.out.println(aluno.getNome() + " está completando " + aluno.getIdade() + " anos.");
        
        return aluno;

    }
    
    public static Professor professor() {
        Professor prof = new Professor();
        
        prof.setNome(JOptionPane.showInputDialog("Informe o nome do(a) professor(a):"));
        prof.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do(a) professor(a):")));
        prof.setSexo(JOptionPane.showInputDialog("Informe o sexo do(a) professor(a) [M ou F]:").toUpperCase().charAt(0));
        prof.setEspecialidade(JOptionPane.showInputDialog("Informe a especialidade do(a) professor(a):"));
        prof.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Informe o salário do(a) professor(a):")));

        System.out.println(prof);
        
        prof.receberAumento(Double.parseDouble(JOptionPane.showInputDialog("Informe o aumento do(a) professor(a):")));
        
        prof.fazerAniversario();
        
        System.out.println(prof.getNome() + " está completando " + prof.getIdade() + " anos.");
        
        return prof;
        
    }
    
    public static Funcionario funcionario() {
        Funcionario func = new Funcionario();
        
        func.setNome(JOptionPane.showInputDialog("Informe o nome do(a) funcionário(a):"));
        func.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do(a) funcionário(a):")));
        func.setSexo(JOptionPane.showInputDialog("Informe o sexo do(a) funcionário(a) [M ou F]:").toUpperCase().charAt(0));
        func.setSetor(JOptionPane.showInputDialog("Informe o setor do(a) funcionário(a):"));
        func.setTrabalhando(true);

        System.out.println(func);
        
        func.mudarSituacao();
        
        func.fazerAniversario();
        
        System.out.println(func.getNome() + " está completando " + func.getIdade() + " anos.");
        
        return func;
        
    }
    
    
}
