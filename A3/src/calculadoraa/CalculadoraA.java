/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraa;

/**
 *
 * @author danpg
 */
public class CalculadoraA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double vA=10,vB=15;
        Calculadora cl = new Calculadora();
        System.out.println(cl.somar(vA, vB));
        System.out.println(cl.subtrair(vA, vB));
        System.out.println(cl.multiplicar(vA, vB));
        System.out.println(cl.dividir(vA, vB));
        
    }
    
}
