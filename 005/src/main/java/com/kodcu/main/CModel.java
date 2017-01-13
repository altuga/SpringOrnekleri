package com.kodcu.main;

/**
 * @author : Altug Bilgin Altintas - altug@kodcu.com
 */
public class CModel extends Araba {

    private double torqueMeasure = 1;

    public static CModel getCModel() {
        return new CModel();
    }

    public CModel() {
        System.out.println(" C-Model yapilandici");
    }

    @Override
    public void modelBilgisiniAl() {
        System.out.println(" C-Model");
        icHesaplama();

    }


    public void vitesKontrol(double vites) {
        System.out.println(" vitesKontrol " + vites);
    }

    public void icHesaplama() {
        for (int i = 0; i < 10; i++) {
            torqueMeasure += torqueMeasure * (Math.random() * 10);
        }
        System.out.println(" torqueMeasure " + torqueMeasure);


    }
}
