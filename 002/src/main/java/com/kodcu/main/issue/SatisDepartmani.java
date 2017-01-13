package com.kodcu.main.issue;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Altug Bilgin Altintas - altug@kodcu.com
 */
public class SatisDepartmani {

    private List<SatisElemani> satisElemani = new ArrayList<SatisElemani>();

    public SatisDepartmani() {
        SatisElemani richard = new SatisElemani("richard", "mov", 37);
        SatisElemani ellen = new SatisElemani("ellen", "go", 23);
        SatisElemani fod = new SatisElemani("fod", "gosling", 45);
        SatisElemani pele = new SatisElemani("pele", "inno", 19);

        getSatisElemani().add(richard);
        getSatisElemani().add(ellen);
        getSatisElemani().add(fod);
        getSatisElemani().add(pele);
    }



    public List<SatisElemani> getSatisElemani() {
        return satisElemani;
    }

    public void setSatisElemani(List<SatisElemani> satisElemani) {
        this.satisElemani = satisElemani;
    }
}
