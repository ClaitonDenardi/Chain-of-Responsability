package model;

import enumeracao.Moedas;

public class UmCentavo extends Chain{

    @Override
    public float tipoDeMoeda(Moedas moeda) {
        if(Moedas.UMCENTAVO.equals(moeda)){
            System.out.println("Moeda de R$0,01 inserida!");
            return 0.01f;
        } else if(next != null) {
            return next.tipoDeMoeda(moeda);
        } else {
            System.out.println("Somente R$0,01, R$0,05, R$0,10, R$0,25, R$0,50, e R$1,00");
            return 0.0f;
        }
    }
    
}
