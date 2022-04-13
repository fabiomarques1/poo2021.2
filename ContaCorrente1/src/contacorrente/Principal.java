
package contacorrente;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Principal {
    
    static Conta minhaConta;
    static Conta outraConta;

    public static void main(String[] args) {
        
        UIManager.put("OptionPane.noButtonText" , "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");
        
        String teclado;
        
        loopMenu : do {
            int opcao;
            teclado = JOptionPane.showInputDialog("Informe a opção desejada: \n"
                    + "1- Casdastrar Conta\n"
                    + "2- Depósito\n"
                    + "3- Saque\n"
                    + "4- Transferência\n"
                    + "5- Saldo\n"
                    + "6- Sair");
            
            opcao = Integer.parseInt(teclado);
            
            switch(opcao) {
                case 1 : minhaConta = cadastrarConta();
                         break;
                case 2 : depositar();
                         break;
                case 3 : sacar();
                         break;
                case 4 : transferir();
                         break;
                case 5 : mostrarSaldo();
                         break;
                case 6 : int resposta = JOptionPane.showConfirmDialog(null, 
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
        conta.codigoBanco = Integer.parseInt(teclado);
        teclado = JOptionPane.showInputDialog("Informe o nome do banco:");
        conta.nomeBanco = teclado;
        teclado = JOptionPane.showInputDialog("Informe o número da agência:");
        conta.numeroAgencia = Integer.parseInt(teclado);
        teclado = JOptionPane.showInputDialog("Informe o número da conta:");
        conta.numeroConta = Integer.parseInt(teclado);
        teclado = JOptionPane.showInputDialog("Informe o cpf do titular:");
        conta.cpfTitular = Long.parseLong(teclado);
        teclado = JOptionPane.showInputDialog("Informe o nome do titular");
        conta.nomeTitular = teclado;
        
        return conta;

    }
    
    public static void depositar() {
        String teclado;
        double valorMonetario;
        
        teclado = JOptionPane.showInputDialog("Informe o valor do depósito:");
        valorMonetario = Double.parseDouble(teclado);
        minhaConta.depositar(valorMonetario);
    }
    
    public static void sacar() {
        String teclado;
        double valorMonetario;
        
        teclado = JOptionPane.showInputDialog("Informe o valor do saque:");
        valorMonetario = Double.parseDouble(teclado);
        minhaConta.sacar(valorMonetario);
    }
    
    public static void transferir() {
        String teclado;
        double valorMonetario;
        outraConta = cadastrarConta();
        
        teclado = JOptionPane.showInputDialog("Informe o valor do transferência:");
        valorMonetario = Double.parseDouble(teclado);
        minhaConta.transferir(valorMonetario, outraConta);
        
    }
    
    public static void mostrarSaldo() {
        System.out.println("Minha conta" + minhaConta);
        System.out.println("Outra conta" + outraConta);

    }
}
