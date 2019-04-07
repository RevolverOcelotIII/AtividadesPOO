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
class ContaEspecial extends Conta {
    private final double limite;
    public ContaEspecial(String nome, int nconta, double saldo, double limite) {
        super(nome, nconta, saldo);
        this.limite = limite;
    }
    @Override
    public boolean retirarValor(int valor){
        if(this.saldo-valor<0&&(this.saldo-valor)*-1>limite){
            return false;
        }
        this.saldo-=valor;
        return true;
    }
    
    @Override
    public double consultarValorDisponivel(){
        return this.saldo+this.limite;
    }
}
