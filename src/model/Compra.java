package model;

import enumeracao.Moedas;

public class Compra {
    
    private float preco;
    private Chain primeiroSlot;
    private float total;

    public Compra(Produto produto) {
        this.preco = produto.getPreco();
        this.total = 0.0f;

        System.out.printf("Preço: R$ %.2f\n", this.preco);

        this.primeiroSlot = new UmCentavo();
        Chain cinco = new CincoCentavos();
        Chain dez = new DezCentavos();
        Chain vinteecinco = new VinteCincoCentavos();
        Chain cinquenta = new CinquentaCentavos();
        Chain umreal = new UmReal();
        primeiroSlot.setNext(cinco);
        cinco.setNext(dez);
        dez.setNext(vinteecinco);
        vinteecinco.setNext(cinquenta);
        cinquenta.setNext(umreal);
    }
  
    public void depositar(Moedas moeda) {
        
        this.total += primeiroSlot.tipoDeMoeda(moeda);
        
        if(Math.round(this.total * 100.0) / 100.0 < Math.round(this.preco * 100.0) / 100.0) {
            System.out.printf("Deposite R$%.2f\n", this.preco - this.total);
        } else if(Math.round(this.total * 100.0) / 100.0 == Math.round(this.preco * 100.0) / 100.0) {
            System.out.println("Pagamento efetuado com sucesso!");
            System.out.printf("Troco = R$0.00\n");
            System.out.println("Retire seu pedido...");
        } else if(Math.round(this.total * 100.0) / 100.0 > Math.round(this.preco * 100.0) / 100.0) {
            System.out.println("Retire seu pedido.");
            System.out.printf("Troco = R$%.2f\n", this.total - this.preco);
            System.out.println("Bom lanche!");
        }
    }
}
