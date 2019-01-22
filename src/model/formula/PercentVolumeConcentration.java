package model.formula;

import model.unit.VolumeUnit;

public class PercentVolumeConcentration extends Formula {
    @Override
    public double solution(String d1,String d2) {
        setSol((getData1()*getData1Unit().getUnitMap(d1)/getData2()/getData2Unit().getUnitMap(d2))*100);
        return getSol();
    }



    public PercentVolumeConcentration() {
        super.setName("Ułamek objętościowy");
        super.setData1Name("OBJĘTOŚĆ SKŁADNIKA");
        super.setData2Name("OBJĘTOŚĆ ROZTWORU");
        super.setSolUnit("%");
        super.setData1Unit(new VolumeUnit());
        super.setData2Unit(new VolumeUnit());

    }
}
