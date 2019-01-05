package model.unit;

import javafx.collections.FXCollections;

public class MassUnit extends Unit {

    public MassUnit() {
        super.add("kg",1);
        super.add("dag",0.01);
        super.add("g",0.001);
        super.setUnitList(FXCollections.observableArrayList("kg","dag","g"));
    }
}
