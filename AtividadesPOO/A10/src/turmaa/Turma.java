/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turmaa;

import java.util.ArrayList;

/**
 *
 * @author danpg
 */
public class Turma {
    ArrayList <String> ArrAl;
    ArrayList<Float> ArrNt;
    float TotalNt;
    public float Media(){
        for(int i=0;i<ArrNt.size();i++){
            this.TotalNt += this.ArrNt.get(i);
        }
        return this.TotalNt/ArrNt.size();
    }
    public String relacaoAlunos(int num){
        return "Aluno: "+ArrAl.get(num)+"\nNota: "+ArrNt.get(num)+"";
    }
}