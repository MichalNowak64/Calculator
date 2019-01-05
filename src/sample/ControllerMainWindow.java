package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.formula.*;
import model.history.FormulaValue;
import model.history.HistoryList;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ControllerMainWindow {

    private ObservableList<String> choiceFormulaList = FXCollections.observableArrayList();
    private List<Formula> formulaList = new ArrayList<>();
    private Formula formula;
    private Map<String, Integer> formulaMap = new HashMap<>();
    private HistoryList historyList=new HistoryList();
    @FXML
    private TextField data1;
    @FXML
    private TextField data2;
    @FXML
    private TextField solution;
    @FXML
    private ChoiceBox<String> unit1;
    @FXML
    private ChoiceBox<String> unit2;
    @FXML
    private Label data1Label;
    @FXML
    private Label data2Label;
    @FXML
    private Label solLabel;
    @FXML
    private ChoiceBox<String> choiceFormula;
    @FXML
    private TextField weryfikacja;

    @FXML
    public void initialize() {
        formulaList.add(new MassConcentration());//Stezenie masowe
        formulaList.add(new MoleConcentration());//Stezenie molowe
        formulaList.add(new PercentMassConcentration());//Stezenie procentowe masowe
        formulaList.add(new PercentMoleConcentration());//Stezenie procentowe molowe
        formulaList.add(new PercentVolumeConcentration());//Stezenie procentowe objetosciowe
        formulaList.add(new MassFraction());//Ulamek masowy
        formulaList.add(new MoleFraction());//Ulamek molowy
        formulaList.add(new VolumeFraction());//Ulamek objetosciowy

        for(int i=0;i<formulaList.size();i++){
            choiceFormulaList.add(formulaList.get(i).getName());
        }

        for(int i=0;i<formulaList.size();i++){
            formulaMap.put(formulaList.get(i).getName(),i);
        }

        formula = formulaList.get(0);

        unit1.setItems(formula.getData1Unit().getUnitList());
        unit1.setValue(formula.getData1Unit().getUnitList().get(0));
        unit2.setItems(formula.getData2Unit().getUnitList());
        unit2.setValue(formula.getData2Unit().getUnitList().get(0));


        choiceFormula.setItems(choiceFormulaList);
        choiceFormula.setValue(choiceFormulaList.get(0));

        data1Label.setText(formula.getData1Name());
        data2Label.setText(formula.getData2Name());
        solLabel.setText("");


    }

    public void accept(ActionEvent event) {
        double solVal;
        solution.clear();

        if (!data1.getText().isEmpty() && !data2.getText().isEmpty()) {
            System.out.println(unit1.getValue());
            System.out.println(unit2.getValue());
            formula=formulaList.get(formulaMap.get(choiceFormula.getValue()));
            formula.setData1(Double.parseDouble(data1.getText()));
            formula.setData2(Double.parseDouble(data2.getText()));
            solVal=formula.solution(unit1.getValue(),unit2.getValue());
            solution.setText(Double.toString(solVal));
            historyList.add(new FormulaValue(formula.getName(),solVal,formula.getSolUnit()));
            historyList.print();
        }

    }

    public void acceptFormula(ActionEvent event){
        System.out.println(formulaMap.get(choiceFormula.getValue()));
        formula=formulaList.get(formulaMap.get(choiceFormula.getValue()));

        data1Label.setText(formula.getData1Name());
        data2Label.setText(formula.getData2Name());
        weryfikacja.setText(formula.getName());
        solLabel.setText(formula.getSolUnit());

        unit1.setItems(formula.getData1Unit().getUnitList());
        unit1.setValue(formula.getData1Unit().getUnitList().get(0));
        unit2.setItems(formula.getData2Unit().getUnitList());
        unit2.setValue(formula.getData2Unit().getUnitList().get(0));
    }

    public void openHistory(ActionEvent event) throws FileNotFoundException {

        PrintWriter zapis = new PrintWriter("historia.txt");
        for(int i=0;i<historyList.getValueList().size();i++){
            zapis.println(historyList.getValueList().get(i).getString());
        }
        zapis.close();

        try {
            FXMLLoader loader =new FXMLLoader(getClass().getResource("history.fxml"));
            Parent root=loader.load();
            ControllerHistoryWindow controllerHistoryWindow=new ControllerHistoryWindow();
            Stage stage = new Stage();
            stage.setTitle("Historia");
            stage.setScene(new Scene(root, 400, 600));
            stage.show();
            // Hide this current window (if this is what you want)

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void openMass(ActionEvent event){
        try {
            FXMLLoader loader =new FXMLLoader(getClass().getResource("mass.fxml"));
            Parent root=loader.load();
            ControllerHistoryWindow controllerHistoryWindow=new ControllerHistoryWindow();
            Stage stage = new Stage();
            stage.setTitle("Masa/Objętość");
            stage.setScene(new Scene(root, 800, 600));
            stage.show();

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }


}


