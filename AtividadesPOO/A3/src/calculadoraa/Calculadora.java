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
public class Calculadora {
    public double somar(double vA,double vB){
        return vA+vB;
    }
    public double subtrair(double vA,double vB){
        return vA-vB;
    }
    public double multiplicar(double vA,double vB){
        return vA*vB;
    }
    public double dividir(double vA,double vB){
        if(vB==0){
            System.out.println("Operação não realizada, favor entrar com um divisor válido");
            return 0;
        }
        return vA/vB;
    }
}
