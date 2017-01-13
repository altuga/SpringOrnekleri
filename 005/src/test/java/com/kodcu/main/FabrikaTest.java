package com.kodcu.main;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author : Altug Bilgin Altintas - altug@kodcu.com
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"kodcu-com.xml"})
public class FabrikaTest {

    @Autowired
    AModel aModel;

    @Autowired
    BModel bModel;

    @Autowired
    CModel cModel;

    @Test
    public void arabaKontrol() throws Exception {
        cModel.vitesKontrol(7);
    }


}
