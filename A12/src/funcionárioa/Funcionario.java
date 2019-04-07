/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionárioa;

import java.util.ArrayList;

/**
 *
 * @author danpg
 */
public class Funcionario {
    protected String nome;
    protected char sexo;
    protected char nivel;
    protected ArrayList <String> Arrdep;
    
    public Funcionario(String nome, char sexo, char nivel){
        this.nome = nome;
        this.sexo = sexo;
        this.nivel = nivel;
        this.Arrdep = new ArrayList();
    }
    public Funcionario(){
    }
    public double calcularSalario(){
        switch(this.nivel){
            case 'T':
                return 2000;
            case 'P':
                return 3500;
            case 'S':
                return 5000;
        }
        return 0;
    }
    
    public String mostrarDependentes(int cont){
        return Arrdep.get(cont);
    }
    
    public boolean validaSexo(){
        switch(this.sexo){
            case 'M':
                return true;
            case 'F':
                return true;
        }
        System.out.println("Sexo Inválido");
        return false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public char getNivel() {
        return nivel;
    }

    public void setNivel(char nivel) {
        this.nivel = nivel;
    }

    public ArrayList<String> getArrdep() {
        return Arrdep;
    }

    public void setArrdep(ArrayList<String> Arrdep) {
        this.Arrdep = Arrdep;
    }
}
