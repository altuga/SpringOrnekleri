package com.kodcu.main.issue;

/**
 * @author : Altug Bilgin Altintas - altug@kodcu.com
 */
public class Programci implements Calisan {

    private Gereksinim gereksinim;
    private String[] gereksinimler;

    public Programci(Gereksinim gereksinim) {
        this.gereksinim = gereksinim;
        this.gereksinimler = this.gereksinim.getGereksinimler();
    }

    public Programci(String[] gereksinimler) {
        this.gereksinimler = gereksinimler;
    }

    public void isYap() {
        System.out.println("Programci is yapiyor");
        for (String gereksinim : gereksinimler) {
            System.out.println(" gereksinim : " + gereksinim);
        }
    }
}
