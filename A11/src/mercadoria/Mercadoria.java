/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadoria;

/**
 *
 * @author danpg
 */
public class Mercadoria {
    String nome;
    double valor;
    int qtdEs;
    
    public Mercadoria(String nome, double valor, int qtdEs){
        this.nome = nome;
        this.valor = valor;
        this.qtdEs = qtdEs;
    }
    public double Comprar(){
        this.qtdEs--;
        return this.valor;
    }
    public double Comprar(int qtd){
        this.qtdEs-=qtd;
        return this.valor*qtd;
    }
    public double Comprar(int qtd, double desc){
        this.qtdEs-=qtd;
        desc=-1*((desc/100)-1);
        return (this.valor*desc)*qtd;
    }
}
