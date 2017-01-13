package com.kodcu.robot;

import javax.inject.Inject;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("application-config.xml")
public class AnnotationConfigTest {


  @Inject
  private Voltran voltran;
  


  @Test
  public void shouldWireWithAtInject() {
    voltran.calis();
  }
  

}
