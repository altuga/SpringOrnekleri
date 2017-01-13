package com.kodcu.main;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author : Altug Bilgin Altintas - altug@kodcu.com
 */
public class Audit {

    public void ilkKontrol() {
       System.out.println("Ilk kontrol yapildi ");
    }

    public void sonKontrol() {
        System.out.println("Son kontrol yapildi ");
    }


    public void hataYakala() {
         System.out.println("Hata var ! Araba i$e yaramaz");
    }

    public void yordamDonusu() {
        System.out.println("Donus yapildi");
    }




}
