package model.formula;

import model.unit.MassUnit;

public class PercentMassConcentration extends Formula {

    @Override
    public double solution(String d1,String d2) {
        setSol((getData1()*getData1Unit().getUnitMap(d1)/getData2()/getData2Unit().getUnitMap(d2))*100);
        return getSol();
    }

    public PercentMassConcentration(double data1, double data2) {
        super(data1, data2);
        super.setName("Stężenie procentowe masowe");
        super.setData1Name("MASA SKŁADNIKA");
        super.setData2Name("MASA ROZTWORU");

    }

    public PercentMassConcentration() {
        super.setName("Stężenie procentowe masowe");
        super.setData1Name("MASA SKŁADNIKA");
        super.setData2Name("MASA ROZTWORU");
        super.setSolUnit("%");
        super.setData1Unit(new MassUnit());
        super.setData2Unit(new MassUnit());

    }
}
