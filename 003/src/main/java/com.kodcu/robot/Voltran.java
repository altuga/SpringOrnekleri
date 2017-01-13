package com.kodcu.robot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


/**
 * @author : Altug Bilgin Altintas - altug@kodcu.com
 */


public class Voltran {

    @Autowired
    @Qualifier("demirKafa")
    private Kafa kafa;

    public Voltran() {
        System.out.println("Voltran olusturuluyor");

    }

    public void calis() {
        kafa.calis();
    }
}
