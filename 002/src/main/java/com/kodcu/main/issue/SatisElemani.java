package com.kodcu.main.issue;

/**
 * @author : Altug Bilgin Altintas - altug@kodcu.com
 */
public class SatisElemani {
    private String ad;
    private String soyad;
    private int yas;

    public SatisElemani(String ad, String soyad, int yas) {
        this.setAd(ad);
        this.setSoyad(soyad);
        this.setYas(yas);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}
