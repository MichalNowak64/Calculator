package model.formula;

import model.unit.MoleUnit;
import model.unit.VolumeUnit;

public class MoleConcentration extends Formula {

    @Override
    public double solution(String d1,String d2) {
        setSol(getData1()*getData1Unit().getUnitMap(d1)/getData2()/getData2Unit().getUnitMap(d2));
        return getSol();
    }

    public MoleConcentration(double data1, double data2) {
        super(data1, data2);
        super.setName("Stężenie molowe");
        super.setData1Name("LICZBA MOLI SKŁADNIKA");
        super.setData2Name("OBJĘTOŚĆ ROZTWORU");

    }

    public MoleConcentration() {
        super.setName("Stężenie molowe");
        super.setData1Name("LICZBA MOLI SKŁADNIKA");
        super.setData2Name("OBJĘTOŚĆ ROZTWORU");
        super.setSolUnit("mol/m^3");
        super.setData1Unit(new MoleUnit());
        super.setData2Unit(new VolumeUnit());

    }

}
