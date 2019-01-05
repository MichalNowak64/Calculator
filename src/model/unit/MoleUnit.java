package model.unit;

import javafx.collections.FXCollections;

public class MoleUnit extends Unit{
    public MoleUnit() {
        super.add("mol",1);
        super.setUnitList(FXCollections.observableArrayList("mol"));
    }

}
