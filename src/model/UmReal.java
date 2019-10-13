package model;

import enumeracao.Moedas;

public class UmReal extends Chain{

    @Override
    public float tipoDeMoeda(Moedas moeda) {
        if(Moedas.UMREAL.equals(moeda)){
            System.out.println("Moeda de R$1,00 inserida!");
            return 1.0f;
        } else if(next != null) {
            return next.tipoDeMoeda(moeda);
        } else {
            System.out.println("Somente R$0,01, R$0,05, R$0,10, R$0,25, R$0,50, e R$1,00");
            return 0.0f;
        }
    }
    
}
