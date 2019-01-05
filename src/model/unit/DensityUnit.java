package model.unit;

import javafx.collections.FXCollections;

public class DensityUnit extends Unit {
    public DensityUnit() {
        super.add("kg/m^3",1);
        super.setUnitList(FXCollections.observableArrayList("kg/m^3"));
    }
}
