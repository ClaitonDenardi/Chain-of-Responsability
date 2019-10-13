package app;

import enumeracao.Moedas;
import model.Compra;
import model.Produto;

public class MaquinaVendas {
    
    public static void main(String[] args) {
        //Para testar com diferentes valores basta
        //trocar o valor da variável abaixo!!!
        Produto p1 = new Produto(2.46f);
        Compra c1 = new Compra(p1);
        c1.depositar(Moedas.UMREAL);
        c1.depositar(Moedas.CINQUENTA);
        c1.depositar(Moedas.CINQUENTA);
        c1.depositar(Moedas.DEZ);
        c1.depositar(Moedas.DEZ);
        c1.depositar(Moedas.CINCO);
        c1.depositar(Moedas.VINTEECINCO);
    }
    
}
