package com.kodcu.main.issue;

/**
 * @author : Altug Bilgin Altintas - altug@kodcu.com
 */
public class Muhasebeci implements Calisan{

    private int evrakSayisi;

    public Muhasebeci(int evrakSayisi) {
         this.setEvrakSayisi(evrakSayisi);
    }
    public void isYap() {
        System.out.println("Muhasebeci is yapiyor, iste evrak sayisi  " + getEvrakSayisi());
    }

    public int getEvrakSayisi() {
        return evrakSayisi;
    }

    public void setEvrakSayisi(int evrakSayisi) {
        this.evrakSayisi = evrakSayisi;
    }
}
