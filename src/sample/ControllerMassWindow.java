package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import model.formula.Formula;
import model.formula.MassFormula;
import model.formula.VolumeFormula;

public class ControllerMassWindow {
    @FXML
    private Button obliczButton1;

    @FXML
    private TextField data1;

    @FXML
    private TextField data2;

    @FXML
    private ChoiceBox<String> unit1;

    @FXML
    private ChoiceBox<String> unit2;

    @FXML
    private Button obliczButton2;

    @FXML
    private TextField data3;

    @FXML
    private TextField data4;

    @FXML
    private ChoiceBox<String> unit3;

    @FXML
    private ChoiceBox<String> unit4;

    @FXML
    private TextField solution1;


    @FXML
    private TextField solution2;

    private Formula formula1=new MassFormula();
    private Formula formula2=new VolumeFormula();


    @FXML
    public void initialize() {
        unit1.setItems(formula1.getData1Unit().getUnitList());
        unit1.setValue(formula1.getData1Unit().getUnitList().get(0));
        unit2.setItems(formula1.getData2Unit().getUnitList());
        unit2.setValue(formula1.getData2Unit().getUnitList().get(0));
        unit3.setItems(formula2.getData1Unit().getUnitList());
        unit3.setValue(formula2.getData1Unit().getUnitList().get(0));
        unit4.setItems(formula2.getData2Unit().getUnitList());
        unit4.setValue(formula2.getData2Unit().getUnitList().get(0));



    }

    @FXML
    void accept1(ActionEvent event) {
        double solVal;
        solution1.clear();
        if (!data1.getText().isEmpty() && !data2.getText().isEmpty()) {
            formula1.setData1(Double.parseDouble(data1.getText()));
            formula1.setData2(Double.parseDouble(data2.getText()));
            solVal=formula1.solution(unit1.getValue(),unit2.getValue());
            solution1.setText(Double.toString(solVal));
        }

    }

    @FXML
    void accept2(ActionEvent event) {
        double solVal;
        solution2.clear();
        if (!data3.getText().isEmpty() && !data4.getText().isEmpty()) {
            formula2.setData1(Double.parseDouble(data3.getText()));
            formula2.setData2(Double.parseDouble(data4.getText()));
            solVal=formula2.solution(unit3.getValue(),unit4.getValue());
            solution2.setText(Double.toString(solVal));
        }

    }

    }


