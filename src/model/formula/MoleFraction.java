package model.formula;

import model.unit.MoleUnit;

public class MoleFraction extends Formula {


    @Override
    public double solution(String d1,String d2) {
        setSol(getData1()*getData1Unit().getUnitMap(d1)/getData2()/getData2Unit().getUnitMap(d2));
        return getSol();
    }

    public MoleFraction(double data1, double data2) {
        super(data1, data2);
        super.setName("Ułamek molowy");
        super.setData1Name("LICZBA MOLI SKŁADNIKA");
        super.setData2Name("LICZBA MOLI ROZTWORU");

    }

    public MoleFraction() {
        super.setName("Ułamek molowy");
        super.setData1Name("LICZBA MOLI SKŁADNIKA");
        super.setData2Name("LICZBA MOLI ROZTWORU");
        super.setSolUnit("");
        super.setData1Unit(new MoleUnit());
        super.setData2Unit(new MoleUnit());

    }
}
