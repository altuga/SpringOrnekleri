package com.kodcu.main;

/**
 * @author : Altug Bilgin Altintas - altug@kodcu.com
 */
public class Polis implements Memur {
    private Gorev gorev;

    public Polis(Gorev gorev) {
        this.gorev = gorev;
    }


    public void calis() {
        gorev.gorevlendirmeYap();
    }
}

