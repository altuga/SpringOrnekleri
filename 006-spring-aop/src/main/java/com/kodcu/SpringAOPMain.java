package com.kodcu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: hakdogan
 */
public class SpringAOPMain {

    public static void main(String args[]){

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Carihareket carihareket = (Carihareket) context.getBean("carihareket");

        carihareket.getBelge().kaydet();
        carihareket.getBelge().yazdir();

    }
}
