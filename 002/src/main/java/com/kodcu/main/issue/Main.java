package com.kodcu.main.issue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : Altug Bilgin Altintas - altug@kodcu.com
 */
public class Main {

    public static void main(String args[]) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/kodcu/main/sirket.xml");

        Programci nuri  = (Programci) applicationContext.getBean("nuri");
        nuri.isYap();

        Programci osman = (Programci) applicationContext.getBean("osman");
        osman.isYap();

        Muhasebeci muhasebeci  = (Muhasebeci) applicationContext.getBean("muhasebeci") ;
        muhasebeci.isYap(); // 1 adim  : 5
        muhasebeci.setEvrakSayisi(10);
        muhasebeci.isYap(); //  2 adim  : 10

        Muhasebeci muhasebeci2  = (Muhasebeci) applicationContext.getBean("muhasebeci") ;
        muhasebeci2.isYap();    //  3 adim  : 5

        OrtalamaHesapla ortalamaHesapla  = (OrtalamaHesapla)
                applicationContext.getBean("ortalamaHesapla");

        ortalamaHesapla.hesapla();





    }
}
