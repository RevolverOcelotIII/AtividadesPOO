/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carroa;

/**
 *
 * @author danpg
 */
public class Motor {
    private String Nome;
    private double Potencia;
    private boolean ligado;
    
    public void ligar(){
        this.ligado=true;
    }
    public void desligar(){
        this.ligado=false;
    }
    public Motor(String nome, double potencia){
        this.Nome=nome;
        this.Potencia = potencia;
        this.ligado=false;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public double getPotencia() {
        return Potencia;
    }

    public void setPotencia(double Potencia) {
        this.Potencia = Potencia;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
}
