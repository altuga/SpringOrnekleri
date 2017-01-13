package com.kodcu.robot;

import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;


/**
 * @author : Altug Bilgin Altintas - altug@kodcu.com
 */
@Component
public class Voltran {

    @Inject
    @Named("demirKafa")
    private Kafa kafa;

    public Voltran() {
        System.out.println("Voltran olusturuluyor");

    }

    public void calis() {
        kafa.calis();
    }
}
