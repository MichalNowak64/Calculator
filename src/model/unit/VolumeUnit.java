package model.unit;

import javafx.collections.FXCollections;

public class VolumeUnit extends Unit{
    public VolumeUnit() {
        super.add("m^3",1);
        super.add("dm^3",0.001);
        super.add("cm^3",0.000001);
        super.setUnitList(FXCollections.observableArrayList("m^3","dm^3","cm^3"));
    }
}
