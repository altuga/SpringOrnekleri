package com.kodcu.main;


/**
 * @author : Altug Bilgin Altintas - altug@kodcu.com
 */

public class Ogretmen implements Memur{


    private Gorev gorev;

    public Ogretmen(Gorev gorev) {
        this.gorev = gorev;
    }


    public void calis() {
        gorev.gorevlendirmeYap();
    }
}
