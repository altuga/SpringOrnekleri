package com.kodcu.main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : Altug Bilgin Altintas - altug@kodcu.com
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("kodcu.xml");

        Voltran voltran = (Voltran) context.getBean("voltran2");


        voltran.calis();
    }
}
