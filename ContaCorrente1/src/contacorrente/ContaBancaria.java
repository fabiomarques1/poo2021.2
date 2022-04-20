/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package contacorrente;

/**
 *
 * @author fabiomacz
 */
public interface ContaBancaria {
    public boolean depositar(double valorDeposito);
    public boolean sacar(double valorSaque) ;
    public boolean transferir(double valorTransferencia, Conta contaDestino);
    
}
