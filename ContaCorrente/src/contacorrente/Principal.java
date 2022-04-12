
package contacorrente;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        String teclado;
        double valorMonetario;
        Conta minhaConta = new Conta();
        
        teclado = JOptionPane.showInputDialog("Informe o código do banco:");
        minhaConta.codigoBanco = Integer.parseInt(teclado);
        teclado = JOptionPane.showInputDialog("Informe o nome do banco:");
        minhaConta.nomeBanco = teclado;
        teclado = JOptionPane.showInputDialog("Informe o número da agência:");
        minhaConta.numeroAgencia = Integer.parseInt(teclado);
        teclado = JOptionPane.showInputDialog("Informe o número da conta:");
        minhaConta.numeroConta = Integer.parseInt(teclado);
        teclado = JOptionPane.showInputDialog("Informe o cpf do titular:");
        minhaConta.cpfTitular = Long.parseLong(teclado);
        teclado = JOptionPane.showInputDialog("Informe o nome do titular");
        minhaConta.nomeTitular = teclado;
        
        teclado = JOptionPane.showInputDialog("Informe o valor do depósito:");
        valorMonetario = Double.parseDouble(teclado);
        minhaConta.depositar(valorMonetario);
        
        Conta outraConta = new Conta();
        teclado = JOptionPane.showInputDialog("Informe o código do banco:");
        outraConta.codigoBanco = Integer.parseInt(teclado);
        teclado = JOptionPane.showInputDialog("Informe o nome do banco:");
        outraConta.nomeBanco = teclado;
        teclado = JOptionPane.showInputDialog("Informe o número da agência:");
        outraConta.numeroAgencia = Integer.parseInt(teclado);
        teclado = JOptionPane.showInputDialog("Informe o número da conta:");
        outraConta.numeroConta = Integer.parseInt(teclado);
        teclado = JOptionPane.showInputDialog("Informe o cpf do titular:");
        outraConta.cpfTitular = Long.parseLong(teclado);
        teclado = JOptionPane.showInputDialog("Informe o nome do titular");
        outraConta.nomeTitular = teclado;
        
        teclado = JOptionPane.showInputDialog("Informe o valor do transferência:");
        valorMonetario = Double.parseDouble(teclado);
        minhaConta.transferir(valorMonetario, outraConta);
        
        System.out.println("Minha conta" + minhaConta);
        System.out.println("Outra conta" + outraConta);
        
    }
}
