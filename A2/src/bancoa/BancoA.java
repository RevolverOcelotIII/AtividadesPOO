package bancoa;

public class BancoA {
    
    public static void main(String[] args) {
        
        Conta cont = new Conta("Marcos",505,200);
        cont.depositarValor(150);
        cont.retirarValor(40);
        System.out.println(cont.consultarValorDisponivel());  
    }
}
