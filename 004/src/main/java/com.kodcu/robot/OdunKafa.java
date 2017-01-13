package com.kodcu.robot;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author : Altug Bilgin Altintas - altug@kodcu.com
 */
@Component("odunKafa")
public class OdunKafa implements Kafa{
    public void calis() {
        System.out.println("Odun  Kafa monte edildi");
    }
}
