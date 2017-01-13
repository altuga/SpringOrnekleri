package com.kodcu.main.issue;

/**
 * @author : Altug Bilgin Altintas - altug@kodcu.com
 */
public class FonsiyonelOlmayanGereksinim implements Gereksinim {

    private String[] gereksinimler;

    public FonsiyonelOlmayanGereksinim() {
        gereksinimler = new String[3];
        getGereksinimler()[0] = new String("Sistem ayni anda 1000 kullanici desteklemeli");
        getGereksinimler()[1] = new String("Sistem cokmemeli");
        getGereksinimler()[2] = new String("Sistem musteriye 10ms altinda cevap vermeli");

    }

    public int gereksinimlerSayisiniVer() {
        return gereksinimler.length;
    }


    public String[] getGereksinimler() {
        return gereksinimler;
    }


}
