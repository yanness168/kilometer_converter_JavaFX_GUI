package com.example.kilometer_converter;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
public class HelloController {
    @FXML
    public Label resultText;

    @FXML
    public Label promptLabel;

    @FXML
    public Button convertBtn;

    @FXML
    public TextField kmText;


//    @FXML
//    protected void onHelloButtonClick() {
//        welcomeText.setText("Welcome to JavaFX Application!");
//    }


    public void convertBtnListener (){
        final double FACTOR = 0.6214;
        String kr = kmText.getText();
        double miles = Double.parseDouble(kr)*FACTOR;
        resultText.setText(kr + "Km is " + miles +" miles.");
    }
}