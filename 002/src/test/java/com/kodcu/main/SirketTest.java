package com.kodcu.main;

import com.kodcu.main.issue.OrtalamaHesapla;
import com.kodcu.main.issue.Programci;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:com/kodcu/main/sirket.xml"})
public class SirketTest {

    @Autowired
    ApplicationContext context;

    @Test
    public void shouldProgrammerdoThat() {
        Programci nuri = (Programci) context.getBean("nuri");
        assertNotNull(nuri);
        nuri.isYap();

    }

    @Test
    public void shouldProgrammerdoThis() {
        Programci osman = (Programci) context.getBean("osman");
        assertNotNull(osman);
        osman.isYap();
    }

    @Test
    public void shouldCalculate() {
        OrtalamaHesapla ortalamaHesapla = (OrtalamaHesapla)
                context.getBean("ortalamaHesapla");
        assertNotNull(ortalamaHesapla);
        ortalamaHesapla.hesapla();
    }

}
