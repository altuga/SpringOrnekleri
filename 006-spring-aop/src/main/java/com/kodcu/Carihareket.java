package com.kodcu;

/**
 * Created with IntelliJ IDEA.
 * User: hakdogan
 */
public class Carihareket {

    public static Belge belge;

    public Carihareket() {}

    public Carihareket(Belge belge) {
        this.belge = belge;
    }

    public static Belge getBelge() {
        return belge;
    }

    public static void setBelge(Belge belge) {
        Carihareket.belge = belge;
    }
}
