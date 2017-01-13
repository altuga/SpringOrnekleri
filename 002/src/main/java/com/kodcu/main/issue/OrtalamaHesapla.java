package com.kodcu.main.issue;

import java.util.List;

/**
 * @author : Altug Bilgin Altintas - altug@kodcu.com
 */
public class OrtalamaHesapla {

    private int[] rakamlar;

    private String[] adlar;

    private List<SatisElemani> satisElemaniList ;


    public void hesapla() {
        int total = 0;
        for (int rakam : rakamlar) {
            total += rakam;
        }
        System.out.println(" " + total / rakamlar.length);

        // adlari ekrana basiyorum

        for (String ad : adlar) {
           System.out.println("-->  " + ad);
        }


    }

    public int[] getRakamlar() {
        return rakamlar;
    }

    public void setRakamlar(int[] rakamlar) {
        this.rakamlar = rakamlar;
    }

    public String[] getAdlar() {
        return adlar;
    }

    public void setAdlar(String[] adlar) {
        this.adlar = adlar;
    }

    public List<SatisElemani> getSatisElemaniList() {
        return satisElemaniList;
    }

    public void setSatisElemaniList(List<SatisElemani> satisElemaniList) {
        this.satisElemaniList = satisElemaniList;
    }
}
