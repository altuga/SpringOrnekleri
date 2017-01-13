package com.kodcu.robot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("voltran-application.xml")
public class AnnotationConfigTest {


    @Autowired
    private Voltran voltran;

    @Test
    public void shouldVoltranWorks() {
        assertNotNull(voltran);
        voltran.calis();

    }
}
