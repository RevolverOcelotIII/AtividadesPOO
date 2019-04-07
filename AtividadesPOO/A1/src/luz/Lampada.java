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
public class Lampada {
    private double potencia;
    private String estado;
    
    public void Ligar(){
        this.estado="Ligado";
    }
    public void Desligar(){
            this.estado="Desligado";
    }
    public Lampada(){
        this.estado="Desligado";
    }
    
    public Lampada(String estado,double Potencia){
        this.estado=estado;
        this.potencia=Potencia;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
