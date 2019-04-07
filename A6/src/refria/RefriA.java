/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refria;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author danpg
 */
public class RefriA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Refrigerante> ArrR = new ArrayList();
        Refrigerante r1 = new Refrigerante("CocaCola",1.50,40);
        Refrigerante r2 = new Refrigerante("FantaUva",0.90,10);
        Refrigerante r3 = new Refrigerante("FantaLaranja",0.90,8);
        Refrigerante r4 = new Refrigerante("Sprite",0.80,20);
        Refrigerante r5 = new Refrigerante("Kuat",1,100);
        
        ArrR.add(r1);
        ArrR.add(r2);
        ArrR.add(r3);
        ArrR.add(r4);
        ArrR.add(r5);
        
        double dinheiro = 5;
        
        dinheiro = r1.efetuarVenda(dinheiro);
        dinheiro = r2.efetuarVenda(dinheiro);
        
        for(int i=0;i<ArrR.size();i++){
            JOptionPane.showMessageDialog(null, "Nome: "+ArrR.get(i).getNome()+"\nSaldo: "+ArrR.get(i).getQtd()+"");
        }
        JOptionPane.showMessageDialog(null,"O troco foi: "+dinheiro+"");
    }
    
}
