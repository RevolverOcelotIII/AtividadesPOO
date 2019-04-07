/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turmaa;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author danpg
 */
public class TurmaA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Turma tur = new Turma();
        tur.ArrAl = new ArrayList();
        tur.ArrNt = new ArrayList();
        double media;
        tur.ArrAl.add("Alan");
        tur.ArrNt.add(7f);
        tur.ArrAl.add("Marcos");
        tur.ArrNt.add(8f);
        tur.ArrAl.add("Jobson");
        tur.ArrNt.add(5.5f);
        tur.ArrAl.add("Luzia");
        tur.ArrNt.add(4.7f);
        tur.ArrAl.add("Lendi");
        tur.ArrNt.add(9.9f);
        tur.ArrAl.add("Luana");
        tur.ArrNt.add(7.2f);
        tur.ArrAl.add("Luiz");
        tur.ArrNt.add(6.5f);
        tur.ArrAl.add("Lopez");
        tur.ArrNt.add(7.7f);
        tur.ArrAl.add("Lenildo");
        tur.ArrNt.add(3.4f);
        tur.ArrAl.add("Lenilda");
        tur.ArrNt.add(8.7f);
        
        media=tur.Media();
        for(int i=0;i<tur.ArrAl.size();i++){
            JOptionPane.showMessageDialog(null,tur.relacaoAlunos(i));
        }
        JOptionPane.showMessageDialog(null,"Média: "+media+"");
    }
}
