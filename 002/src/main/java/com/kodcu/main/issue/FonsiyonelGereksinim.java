package com.kodcu.main.issue;

/**
 * @author : Altug Bilgin Altintas - altug@kodcu.com
 */
public class FonsiyonelGereksinim implements Gereksinim {


    private String[] gereksinimler;

    public FonsiyonelGereksinim() {

        gereksinimler = new String[5];
        getGereksinimler()[0] = new String("Sistem musteri hesaplarini kontrol etmeli");
        getGereksinimler()[1] = new String("Sistem guvenligi saglamali");
        getGereksinimler()[2] = new String("Sistem herseyi kayit altina almali");
        getGereksinimler()[3] = new String("Sistem musteri hesaplarini raporlamali");
        getGereksinimler()[4] = new String("Sistem musteri hesaplarini dondurabilmeli");

    }

    public int gereksinimlerSayisiniVer() {
        return getGereksinimler().length;
    }


    public String[] getGereksinimler() {
        return gereksinimler;
    }


}
