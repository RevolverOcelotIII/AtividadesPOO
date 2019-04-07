/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoa;

/**
 *
 * @author danpg
 */
public class Conta {
    protected String nomecliente;
    protected int nconta;
    protected double saldo;
    
    public void depositarValor(int deposito){
        this.saldo+=deposito;
    }
    
    public boolean retirarValor(int valor){
        if(this.saldo<valor){
            return false;
        }
        else{
            this.saldo-=valor;
            return true;
        }
    }
    
    public double consultarValorDisponivel(){
        return this.saldo;
    }
    
    public Conta(String nome,int nconta, double saldo){
        this.nomecliente=nome;
        this.nconta=nconta;
        this.saldo=saldo;
    }
}
