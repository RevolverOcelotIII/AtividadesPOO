/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadinhoa;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author danpg
 */
public class MercadinhoA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Produto> ArrP = new ArrayList();
        Produto pr0 = new Produto("Salada",5,10);
        Produto pr1 = new Produto("Biscoito",3,11);
        Produto pr2 = new Produto("Bolacha",2,12);
        Produto pr3 = new Produto("Vassoura",7,13);
        Produto pr4 = new Produto("Chiclete",1,14);
        ArrP.add(pr0);
        ArrP.add(pr1);
        ArrP.add(pr2);
        ArrP.add(pr3);
        ArrP.add(pr4);
        String searchvalue;
        int i;
        do{
            searchvalue=JOptionPane.showInputDialog("Insira o nome do produto que deseja ver as informações, ou fim para sair");
            if(searchvalue.equalsIgnoreCase("fim")){
                continue;
            }
            int j=0;
            for(i=0;i<ArrP.size();i++){
                if(searchvalue.equalsIgnoreCase(ArrP.get(i).getDesc())){
                    JOptionPane.showMessageDialog(null, "Descrição: "+ArrP.get(i).getDesc()+"\nPreço: R$"+ArrP.get(i).getPreco()+"\nSaldo: "+ArrP.get(i).getSaldo()+"");
                    j=1;
                }
            }
            if(j==0){
                JOptionPane.showMessageDialog(null,"Não foi encontrado nenhum item com essa nomeclatura");
            }
        }while(!"fim".equalsIgnoreCase(searchvalue));
    }
}
