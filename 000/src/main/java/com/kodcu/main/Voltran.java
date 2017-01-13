package com.kodcu.main;

/**
 * @author : Altug Bilgin Altintas - altug@kodcu.com
 */
public class Voltran {

    private GucKaynagi kaynak; // komposizyon

    public Voltran() {
        kaynak = new GucKaynagi();
    }

    public void calis() {
        kaynak.gucVer();
        System.out.println(" Hazir");
    }
}
