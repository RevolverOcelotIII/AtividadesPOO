/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicionarioa;

import java.util.ArrayList;

/**
 *
 * @author danpg
 */
public class DicionarioA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList Pl = new ArrayList();
        ArrayList Si = new ArrayList();
        
        Pl.add("Java");
        Si.add("Linguagem de Programação");
        Pl.add("Funcionário");
        Si.add("Pessoa que trabalha");
        Pl.add("Aluno");
        Si.add("Pessoa que estuda");
        Pl.add("Futebol");
        Si.add("Modalidade de esporte");
        
        Dicionario di = new Dicionario(Pl,Si);
        
        System.out.println(di.Pesquisar());
        System.out.println(di.Pesquisar("Futebol"));
        System.out.println(di.Pesquisar(3));
        
        di.validarPalavra("Abacate");
        di.validarPalavra("futebol");
    }
    
}
