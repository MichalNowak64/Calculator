package model.history;

public class FormulaValue {
    private String name;
    private double value;
    private String unit;

    public FormulaValue(String name, double value, String unit) {
        this.name = name;
        this.value = value;
        this.unit=unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getString(){
        String str=name+": "+value+unit;
        return str;
    }
}
