/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadinhoa;

/**
 *
 * @author danpg
 */
public class Produto {
    private String desc;
    private double preco;
    private int saldo;
    
    public Produto(String desc, double preco, int saldo){
        this.desc = desc;
        this.preco = preco;
        this.saldo = saldo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
