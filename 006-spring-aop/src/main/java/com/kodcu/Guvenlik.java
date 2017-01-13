package com.kodcu;

import org.aspectj.lang.ProceedingJoinPoint;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: hakdogan
 */

public class Guvenlik {

    public void ilkKontrol(){

        System.out.println("\nilk kontrol gerceklestirildi\n");
    }

    public void sonKontrol(){

        System.out.println("\nson kontrol gerceklestirildi\n");
    }

    public boolean kalemKontrol(){

        boolean sifirKalem = false;
        for(Map.Entry<String, Double> liste: Carihareket.belge.getKalemListesi().entrySet()){
            if(liste.getValue() < 0.01) {
                sifirKalem = true;
                break;
            }
        }

        return sifirKalem;

    }

    public Object aroundKontrol(ProceedingJoinPoint joinPoint){

        try {

            if(Carihareket.belge instanceof Fatura && kalemKontrol())  {
                System.out.println("Fatura sifir tutarli kalem iceremez...\n");
            } else
                return joinPoint.proceed();


        } catch (Throwable throwable) {
            throwable.printStackTrace();  
        }

        return null;
    }

    public void yordamDonusu(){
        System.out.println("yordamdan donuldu...");
    }

    public void hataYakala(){
        System.out.println("bir hata meydana geldi...");
    }
}
