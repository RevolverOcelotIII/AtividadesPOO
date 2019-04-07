/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresaa;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author danpg
 */
public class EmpresaA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Empresa> ArrE = new ArrayList();
        Empresa e1 = new Empresa("Ricardo Eletro",5000000,200);
        Empresa e2 = new Empresa("Insinuante",200000,200);
        Empresa e3 = new Empresa("Casas Bahia",1000000,300);
        Empresa e4 = new Empresa("Magazine Luiza",3000000,100);
        Empresa e5 = new Empresa("EletroGen",3000000,40);
        
        ArrE.add(e1);
        ArrE.add(e2);
        ArrE.add(e3);
        ArrE.add(e4);
        ArrE.add(e5);
        int Menor=e1.getFunc();
        double Maior=e1.getCapital();
        String Nmenor=e1.getNome(),Nmaior=e1.getNome();
        for(int i=0;i<ArrE.size();i++){
            if(ArrE.get(i).getCapital()>Maior){
                Maior = ArrE.get(i).getCapital();
                Nmaior = ArrE.get(i).getNome();
            }
            if(ArrE.get(i).getFunc()<Menor){
                Menor = ArrE.get(i).getFunc();
                Nmenor = ArrE.get(i).getNome();
            }
        }
        JOptionPane.showMessageDialog(null,"A empresa de menor numero de funcionários é: "+Nmenor+"\nA empresa de maior capital é: "+Nmaior+"");
    }
}
