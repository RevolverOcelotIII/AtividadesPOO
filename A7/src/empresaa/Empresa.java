/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresaa;

/**
 *
 * @author danpg
 */
public class Empresa {
    private String Nome;
    private double capital;
    private int Func;
    
    public Empresa(String nome, double capital, int func){
        this.Nome = nome;
        this.capital = capital;
        this.Func = func;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public int getFunc() {
        return Func;
    }

    public void setFunc(int Func) {
        this.Func = Func;
    }
}
