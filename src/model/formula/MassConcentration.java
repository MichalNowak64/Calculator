package model.formula;

import model.unit.MassUnit;
import model.unit.VolumeUnit;

public class MassConcentration extends Formula {

    @Override
    public double solution(String d1,String d2) {
        setSol(getData1()*getData1Unit().getUnitMap(d1)/getData2()/getData2Unit().getUnitMap(d2));
        return getSol();
    }


    public MassConcentration() {
        super.setName("Stężenie masowe");
        super.setData1Name("MASA SKŁADNIKA");
        super.setData2Name("OBJĘTOŚĆ ROZTWORU");
        super.setSolUnit("kg/m^3");
        super.setData1Unit(new MassUnit());
        super.setData2Unit(new VolumeUnit());
    }
}
