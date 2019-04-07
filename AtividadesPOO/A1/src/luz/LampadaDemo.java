/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luz;

/**
 *
 * @author danpg
 */
public class LampadaDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        Lampada lp = new Lampada("Ligado",205);
        lp.setPotencia(500);
        lp.Ligar();
        lp.Desligar();
        System.out.println(""+lp.getPotencia()+"");
    }
    
}
