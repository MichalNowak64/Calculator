package model.history;

import sample.FormulaValue;

import java.util.ArrayList;
import java.util.List;

public class HistoryList {
    private List<FormulaValue> ValueList= new ArrayList<>();

    public List<FormulaValue> getValueList() {
        return ValueList;
    }

    public void setValueList(List<FormulaValue> valueList) {
        ValueList = valueList;
    }

    public void add(FormulaValue formulaValue){
        if(ValueList.size()<10) {
            ValueList.add(formulaValue);
        }
        else{
            ValueList.remove(0);
            ValueList.add(formulaValue);
        }
    }

    public void print(){
        for (int i=0;i<getValueList().size();i++)
        System.out.println(getValueList().get(i).getName()+" "+getValueList().get(i).getValue());
    }

}
