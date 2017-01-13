package com.kodcu.main;


import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

/**
 * @author : Altug Bilgin Altintas - altug@kodcu.com
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("kodcu.xml");

        Memur memur = (Memur) context.getBean("memur");
        memur.calis();

        Doktor doktor = (Doktor) context.getBean("doktor");
        doktor.calis();
    }
}
