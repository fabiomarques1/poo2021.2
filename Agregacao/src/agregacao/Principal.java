
package agregacao;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Principal {


    public static void main(String[] args) {
        
        String nome;
        int resposta;
        
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        
        do {
            nome = JOptionPane.showInputDialog("Informe o nome: ");
            Pessoa pessoa = new Pessoa(validarCPF(), nome);

            JOptionPane.showMessageDialog(null, "A seguir, informe o Endereço de Cobrança");
            pessoa.setEnderecoCobranca(preencherEndereco());

            resposta = JOptionPane.showConfirmDialog(null,"O Endereço de Entrega é o mesmo de Cobrança?", "Pergunta", JOptionPane.YES_NO_OPTION);
            
            if (resposta == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "A seguir, informe o Endereço de Entrega");
                pessoa.setEnderecoEntrega(preencherEndereco());
            } else {
                pessoa.setEnderecoEntrega(pessoa.getEnderecoCobranca());
            }
            
            pessoas.add(pessoa);

            System.out.println(pessoa);

            resposta = JOptionPane.showConfirmDialog(null,"Deseja cadastrar outra pessoa?", "Aviso", JOptionPane.YES_NO_OPTION);
        } while (resposta == JOptionPane.YES_OPTION);
        
        System.out.println("Imprimindo a lista...");
        for(Pessoa p : pessoas) {
            System.out.println(p);
        }
        
    }

    public static long validarCPF() {
        boolean erro;
        String teclado;
        long cpf = 0;
        
        erro = true;
        do {
            try {
                teclado = JOptionPane.showInputDialog("Informe o cpf (somente dígitos): ");
                if (teclado.length() == 11) {
                    cpf = Long.parseLong(teclado);
                    erro = false;
                } else {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "CPF inválido");
            }

        } while (erro);
        
        return cpf;
    }

    public static int validarCEP() {
        boolean erro;
        int cep = 0;
        String teclado;

        erro = true;
        do {
            try {
                teclado = JOptionPane.showInputDialog("Informe o cep: ");
                if (teclado.length() == 8) {
                    cep = Integer.parseInt(teclado);
                    erro = false;
                } else {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "CEP inválido");
            }
        } while (erro);

        return cep;
    }
    
    public static Endereco preencherEndereco() {
        Endereco end = new Endereco();

        end.setRua(JOptionPane.showInputDialog("Informe a rua: "));
        end.setComplemento(JOptionPane.showInputDialog("Informe o complemento: "));
        end.setBairro(JOptionPane.showInputDialog("Informe o bairro: "));
        end.setCidade(JOptionPane.showInputDialog("Informe a cidade: "));
        end.setEstado(JOptionPane.showInputDialog("Informe o estado: "));
        end.setCep(validarCEP());
        return end;
    }
}
