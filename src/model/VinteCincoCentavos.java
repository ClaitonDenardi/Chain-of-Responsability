package model;

import enumeracao.Moedas;

public class VinteCincoCentavos extends Chain{

    @Override
    public float tipoDeMoeda(Moedas moeda) {
        if(Moedas.VINTEECINCO.equals(moeda)){
            System.out.println("Moeda de R$0,25 inserida!");
            return 0.25f;
        } else if(next != null) {
            return next.tipoDeMoeda(moeda);
        } else {
            System.out.println("Somente R$0,01, R$0,05, R$0,10, R$0,25, R$0,50, e R$1,00");
            return 0.0f;
        }
    }
    
}
