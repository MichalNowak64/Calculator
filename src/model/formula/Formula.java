package model.formula;

import model.unit.Unit;

public abstract class Formula {
    private double data1;
    private double data2;
    private double Sol;
    private Unit data1Unit;
    private Unit data2Unit;
    private String name;
    private String data1Name;
    private String data2Name;
    private String solUnit;




    public Formula(double data1, double data2) {
        this.data1 = data1;
        this.data2 = data2;
    }

    public Formula() {
    }

    public double getData1() {
        return data1;
    }

    public void setData1(double data1) {
        this.data1 = data1;
    }

    public double getData2() {
        return data2;
    }

    public void setData2(double data2) {
        this.data2 = data2;
    }

    public double getSol() {
        return Sol;
    }

    public void setSol(double sol) {
        Sol = sol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData1Name() {
        return data1Name;
    }

    public void setData1Name(String data1Name) {
        this.data1Name = data1Name;
    }

    public String getData2Name() {
        return data2Name;
    }

    public void setData2Name(String data2Name) {
        this.data2Name = data2Name;
    }

    public abstract double solution(String d1, String d2);

    public void setSolUnit(String solUnit) {
        this.solUnit = solUnit;
    }

    public String getSolUnit() {
        return solUnit;
    }

    public Unit getData1Unit() {
        return data1Unit;
    }

    public void setData1Unit(Unit data1Unit) {
        this.data1Unit = data1Unit;
    }

    public Unit getData2Unit() {
        return data2Unit;
    }

    public void setData2Unit(Unit data2Unit) {
        this.data2Unit = data2Unit;
    }
}
