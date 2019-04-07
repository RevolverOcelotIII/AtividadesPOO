/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livroa;

import java.util.ArrayList;

/**
 *
 * @author danpg
 */
public class LivroA {
    String titulo;
    int qtPa;
    public LivroA(String titulo,int qtPa){
        this.titulo = titulo;
        this.qtPa = qtPa;
    }
    
    public static void main(String[] args) {
        ArrayList <LivroA> ArrL = new ArrayList();
        LivroA l1 = new LivroA("Introdução em C#",700);
        LivroA l2 = new LivroA("Introdução em JAVA",550);
        LivroA l3 = new LivroA("Introdução em PHP",400);
        LivroA l4 = new LivroA("Introdução em C++",500);
        LivroA l5 = new LivroA("Introdução em Phyton",650);
        
        ArrL.add(l1);
        ArrL.add(l2);
        ArrL.add(l3);
        ArrL.add(l4);
        ArrL.add(l5);
    }
}
