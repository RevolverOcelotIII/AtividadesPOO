/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionárioa;
class ConsultordeVendas extends Funcionario {
    private double valorBonusM;
    @Override
    public double calcularSalario(){
        double salario = 0;
        switch(this.nivel){
            case 'T':
                salario = 2000;
                break;
            case 'P':
                salario = 3500;
                break;
            case 'S':
                salario = 5000;
                break;
        }
        return salario + this.valorBonusM;
    }
}
