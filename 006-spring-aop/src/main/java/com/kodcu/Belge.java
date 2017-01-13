package com.kodcu;

/**
 * Created with IntelliJ IDEA.
 * User: hakdogan
 */

import java.util.HashMap;

public class Belge {

    public HashMap<String, Double> kalemListesi;

    public Belge() {}

    public HashMap<String, Double> getKalemListesi() {
        return kalemListesi;
    }

    public void setKalemListesi(HashMap<String, Double> kalemListesi) {
        this.kalemListesi = kalemListesi;
    }

    public void kaydet(){}

    public void sil(){}

    public void yazdir(){}
}
