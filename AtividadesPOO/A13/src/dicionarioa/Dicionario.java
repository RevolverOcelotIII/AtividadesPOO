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
public class Dicionario {
    ArrayList <String> Palavras;
    ArrayList <String> Significados;
    
    public Dicionario(ArrayList Palavras,ArrayList Significados){
        this.Palavras = Palavras;
        this.Significados = Significados;
    }
    
    public String Pesquisar(){
        return this.Significados.get(0);
    }
    public String Pesquisar(String Palavra){
        for(int i=0;i<this.Palavras.size();i++){
            if(Palavra.equalsIgnoreCase(this.Palavras.get(i))){
                return this.Significados.get(i);
            }
        }
        return null;
    }
    public String Pesquisar(int Ind){
        if(Ind>=this.Significados.size()||Ind<0){
            return null;
        }
        return this.Significados.get(Ind);
    }
    public boolean validarPalavra(String palavra){
        for(int i=0;i<this.Palavras.size();i++){
            if(palavra.equalsIgnoreCase(this.Palavras.get(i))){
                System.out.println("Palavra já existente no dicionário");
                return false;
            }
        }
        return true;
    }
}
