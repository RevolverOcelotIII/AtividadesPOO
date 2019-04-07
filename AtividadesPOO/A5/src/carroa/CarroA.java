/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carroa;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author danpg
 */
public class CarroA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Motor> ArrM = new ArrayList();
        Motor m1 = new Motor("Motorzão",500);
        Motor m2 = new Motor("Motorzinho",200);
        Motor m3 = new Motor("Motor",350);
        Motor m4 = new Motor("Motorzasso",700);
        Motor m5 = new Motor("Motorzito",100);
        
        m1.ligar();
        m2.ligar();
        m3.ligar();
        
        ArrM.add(m1);
        ArrM.add(m2);
        ArrM.add(m3);
        ArrM.add(m4);
        ArrM.add(m5);
        
        
        for(int i=0;i<ArrM.size();i++){
            JOptionPane.showMessageDialog(null,"Nome: "+ArrM.get(i).getNome()+"\n Potência: "+ArrM.get(i).getPotencia()+"");
        }
    }
    
}
