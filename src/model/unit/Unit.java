package model.unit;

import javafx.collections.ObservableList;

import java.util.HashMap;
import java.util.Map;

public abstract class Unit {

    private ObservableList<String> unitList;

    private Map<String, Double> unitMap = new HashMap<>();

    public double getUnitMap(String key) {
        return unitMap.get(key);
    }

    public void setUnitMap(Map<String, Double> unitMap) {
        this.unitMap = unitMap;
    }

    public void add(String key,double value){
        unitMap.put(key,value);
    }

    public ObservableList<String> getUnitList() {
        return unitList;
    }

    public void setUnitList(ObservableList<String> unitList) {
        this.unitList = unitList;
    }
}
