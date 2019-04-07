/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refria;

/**
 *
 * @author danpg
 */
public class Refrigerante {
    private String nome;
    private double preco;
    private int qtd;
    
    public double efetuarVenda(double valor){
        if(valor>=this.preco){
            this.qtd-=1;
            if(valor>this.preco){
                return valor-this.preco;
            }
            return 0;
        }
        return valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    
    public Refrigerante(String nome, double preco, int qtd){
        this.nome = nome;
        this.preco=preco;
        this.qtd = qtd;
    }
}
