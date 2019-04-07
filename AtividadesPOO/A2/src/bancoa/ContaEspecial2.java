/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoa;

import java.io.IOException;

/**
 *
 * @author danpg
 */
public class ContaEspecial2 {
    public static void main (String [] args) throws IOException{
        ContaEspecial espcont = new ContaEspecial("João",1234,100,500);
        espcont.depositarValor(400);
        System.out.println(espcont.consultarValorDisponivel());
        espcont.retirarValor(50);
        System.in.read();
        espcont.retirarValor(900);
        System.out.println(espcont.consultarValorDisponivel());
        System.in.read();
        espcont.retirarValor(100);
        espcont.depositarValor(50);
        System.out.println(espcont.consultarValorDisponivel());
        System.in.read();
        espcont.retirarValor(100);
        System.out.println(espcont.consultarValorDisponivel());
    }
}
