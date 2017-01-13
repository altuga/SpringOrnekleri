package com.kodcu.main;

/**
 * @author : Altug Bilgin Altintas - altug@kodcu.com
 */
public class Voltran {

    private IGucKaynagi gucKaynagi;

    private ISilah iSilah;

    public Voltran(IGucKaynagi gucKaynagi) {
        this.gucKaynagi = gucKaynagi;

    }

    public Voltran( ISilah iSilah) {
        this.gucKaynagi = gucKaynagi;

    }

    public void calis() {
        gucKaynagi.gucVer();
        System.out.println(" Hazir");
        iSilah.atesEt();
    }

}
