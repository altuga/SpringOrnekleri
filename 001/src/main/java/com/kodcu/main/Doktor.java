package com.kodcu.main;

/**
 * Created by altuga on 06/01/17.
 */
public class Doktor implements Memur {

    private Gorev gorev;

    public Doktor(Gorev gorev) {
        this.gorev = gorev;
    }

    @Override
    public void calis() {
        gorev.gorevlendirmeYap();
    }
}
