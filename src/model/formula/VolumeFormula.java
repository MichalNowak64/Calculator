package model.formula;

import model.unit.DensityUnit;
import model.unit.MassUnit;
import model.unit.VolumeUnit;

public class VolumeFormula extends Formula {
    @Override
    public double solution(String d1,String d2) {
        setSol(getData1()*getData1Unit().getUnitMap(d1)/getData2()/getData2Unit().getUnitMap(d2));
        return getSol();
    }

    /*public MassFraction(double data1, double data2) {
        super(data1, data2);
        super.setName("Ułamek masowy");
        super.setData1Name("MASA SKŁADNIKA");
        super.setData2Name("MASA ROZTWORU");
    }*/

    public VolumeFormula() {
        super.setName("objetosc");
        super.setData1Name("MASA SKŁADNIKA");
        super.setData2Name("MASA ROZTWORU");
        super.setSolUnit("m^3");
        super.setData1Unit(new MassUnit());
        super.setData2Unit(new DensityUnit());
    }
}
