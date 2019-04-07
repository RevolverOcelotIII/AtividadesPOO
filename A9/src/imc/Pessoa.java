/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

/**
 *
 * @author danpg
 */
public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private double peso;
    private char sexo;
    private double imc;
    private String descIMC;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public String getDescIMC() {
        return descIMC;
    }

    public void setDescIMC(String descIMC) {
        this.descIMC = descIMC;
    }
    
    public void calcIMC(){
        this.imc = this.peso/(this.altura*this.altura);
        if(this.imc<=18.5){
            this.descIMC = "Abaixo do peso normal";
        }else if(this.imc<=25){
            this.descIMC = "Peso normal";
        }else if(this.imc<=30){
            this.descIMC = "Acima do peso normal";
        }else{
            this.descIMC = "Obesidade";
        }
    }
    public Pessoa(String nome, int idade, double altura, double peso, char sexo){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
    }
    
    @Override
    public String toString() {

        return "Nome: " +this.nome + "\nIMC: " + this.imc +"\nDescrição: "+this.descIMC+" ";

    }
}
