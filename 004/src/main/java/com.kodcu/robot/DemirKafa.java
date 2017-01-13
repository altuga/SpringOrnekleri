package com.kodcu.robot;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author : Altug Bilgin Altintas - altug@kodcu.com
 */
@Component("demirKafa")
public class DemirKafa implements Kafa{
    public void calis() {
        System.out.println("Demir Kafa monte edildi");
    }
}
