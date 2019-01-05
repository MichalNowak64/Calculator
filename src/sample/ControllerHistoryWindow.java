package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ControllerHistoryWindow {
    @FXML
    private Label label1;

    @FXML
    private Label label2;

    @FXML
    private Label label3;

    @FXML
    private Label label4;

    @FXML
    private Label label5;

    @FXML
    private Label label6;

    @FXML
    private Label label7;

    @FXML
    private Label label8;

    @FXML
    private Label label9;

    @FXML
    private Label label10;




    @FXML
    public void initialize() throws FileNotFoundException {
        File file = new File("historia.txt");
        Scanner in = new Scanner(file);
        String zdanie;
        if(in.hasNext()) {
            zdanie=in.nextLine();
            label1.setText(zdanie);
        }
        if(in.hasNext()) {
            zdanie=in.nextLine();
            label2.setText(zdanie);
        }
        if(in.hasNext()) {
            zdanie=in.nextLine();
            label3.setText(zdanie);
        }
        if(in.hasNext()) {
            zdanie=in.nextLine();
            label4.setText(zdanie);
        }
        if(in.hasNext()) {
            zdanie=in.nextLine();
            label5.setText(zdanie);
        }
        if(in.hasNext()) {
            zdanie=in.nextLine();
            label6.setText(zdanie);
        }
        if(in.hasNext()) {
            zdanie=in.nextLine();
            label7.setText(zdanie);
        }
        if(in.hasNext()) {
            zdanie=in.nextLine();
            label8.setText(zdanie);
        }
        if(in.hasNext()) {
            zdanie=in.nextLine();
            label9.setText(zdanie);
        }
        if(in.hasNext()) {
            zdanie=in.nextLine();
            label10.setText(zdanie);
        }


    }





}
