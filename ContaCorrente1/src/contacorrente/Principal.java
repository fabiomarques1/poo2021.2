
package contacorrente;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Principal {

    public static void main(String[] args) {   
        String teclado;
        double valorMonetario;
        
        Conta minhaConta = cadastrarConta();
        
        loopMenu : do {
            int opcao;
            teclado = JOptionPane.showInputDialog("Informe a opção desejada: \n"
                    + "1- Depósito\n"
                    + "2- Saque\n"
                    + "3- Transferência\n"
                    + "4- Saldo\n"
                    + "5- Sair");
            
            opcao = Integer.parseInt(teclado);
            switch(opcao) {
                case 1 : teclado = JOptionPane.showInputDialog("Informe o valor do depósito:");
                         valorMonetario = Double.parseDouble(teclado);
                         minhaConta.depositar(valorMonetario);
                         break;
                case 2 : teclado = JOptionPane.showInputDialog("Informe o valor do saque:");
                         valorMonetario = Double.parseDouble(teclado);
                         minhaConta.sacar(valorMonetario);
                         break;
                case 3 : Conta outraConta = cadastrarConta();
                         teclado = JOptionPane.showInputDialog("Informe o valor do transferência:");
                         valorMonetario = Double.parseDouble(teclado);
                         minhaConta.transferir(valorMonetario, outraConta);
                         System.out.println("Minha conta " + minhaConta);
                         System.out.println("Outra conta " + outraConta);
                         break;
                case 4 : System.out.println("Minha conta " + minhaConta);
                         break;
                case 5 : int resposta = JOptionPane.showConfirmDialog(null, 
                        "Deseja realmente sair?", "Aviso", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                        if (resposta == JOptionPane.YES_OPTION) {
                            break loopMenu;
                        }
                        break;
                default : System.out.println("Opção Inválida!");        
            } 
        
        } while(true);
        
        System.out.println("Encerrando o acesso a conta...");
    }
    
    public static Conta cadastrarConta() {
        Conta conta = new Conta();
        String teclado;
        teclado = JOptionPane.showInputDialog("Informe o código do banco:");
        conta.setCodigoBanco(Integer.parseInt(teclado));
        teclado = JOptionPane.showInputDialog("Informe o nome do banco:");
        conta.setNomeBanco(teclado);
        teclado = JOptionPane.showInputDialog("Informe o número da agência:");
        conta.setNumeroAgencia(Integer.parseInt(teclado));
        teclado = JOptionPane.showInputDialog("Informe o número da conta:");
        conta.setNumeroConta(Integer.parseInt(teclado));
        teclado = JOptionPane.showInputDialog("Informe o cpf do titular:");
        conta.setCpfTitular(Long.parseLong(teclado));
        teclado = JOptionPane.showInputDialog("Informe o nome do titular");
        conta.setNomeTitular(teclado);
        
        return conta;

    }
    
}
