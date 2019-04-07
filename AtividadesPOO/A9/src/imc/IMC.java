/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author danpg
 */
public class IMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Pessoa> ArrP = new ArrayList();
        Pessoa p1 = new Pessoa("Fulano",22,1.80,55,'M');
        p1.calcIMC();
        Pessoa p2 = new Pessoa("Fulana",18,1.61,50,'F');
        p2.calcIMC();
        Pessoa p3 = new Pessoa("Beltrano",20,1.50,60,'M');
        p3.calcIMC();
        Pessoa p4 = new Pessoa("Beltrana",17,1.50,70,'F');
        p4.calcIMC();
        
        ArrP.add(p1);
        ArrP.add(p2);
        ArrP.add(p3);
        ArrP.add(p4);
        
        for(int i=0;i<ArrP.size();i++){
            JOptionPane.showMessageDialog(null,ArrP.get(i).toString());
        }
    }
    
}
