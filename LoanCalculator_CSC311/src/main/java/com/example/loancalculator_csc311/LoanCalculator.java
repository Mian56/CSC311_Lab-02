package com.example.loancalculator_csc311;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoanCalculator extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        //access the fxml file
        Parent root = FXMLLoader.load(getClass().getResource("calculator.fxml"));
        primaryStage.setTitle("Loan Calculator");
        primaryStage.setScene(new Scene(root));
        primaryStage.show(); //displays the scene
    }

    public static void main(String[] args) {
        launch(args);
    }
}
