package com.kodcu;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: hakdogan
 */

public class Fatura extends Belge{

    public Fatura() {

        this.kalemListesi = new HashMap<String, Double>();

        kalemListesi.put("Ekmek", 0.75);
        kalemListesi.put("Peynir", 9.00);
        kalemListesi.put("Zeytin", 3.00);
        kalemListesi.put("Yogurt", 1.25);
        kalemListesi.put("Cikolata", 0.00);
    }

    @Override
    public void kaydet() {

        System.out.println("Fatura kayit edildi...");
    }

    @Override
    public void sil() {
        System.out.println("Fatura silindi...");
    }

    @Override
    public void yazdir(){
        for(Map.Entry<String, Double> liste: kalemListesi.entrySet()){
            System.out.println(liste.getKey() + " " + liste.getValue());
        }
    }

}
