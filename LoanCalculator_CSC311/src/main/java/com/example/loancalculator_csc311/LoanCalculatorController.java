package com.example.loancalculator_csc311;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class LoanCalculatorController {
    @FXML
    private TextField amount_TF;

    @FXML
    private TextField interestRate_TF;

    @FXML
    private TextField monthlyPayment_TF;

    @FXML
    private TextField totalPayment_TF;

    @FXML
    private TextField years_TF;


    @FXML
    private void calculateLoneMethod(ActionEvent event) {
        try {
            // can access information put in the text filed
            double amount = Double.parseDouble(amount_TF.getText());
            double interestRate = Double.parseDouble(interestRate_TF.getText()) / 100 / 12;
            int years = Integer.parseInt(years_TF.getText());
            int numberOfPayments = years * 12;

            // monthly payment formula
            double monthlyPayment = (amount * interestRate) /
                    (1 - Math.pow(1 + interestRate, -numberOfPayments));

            // total payment is calculated
            double totalPayment = monthlyPayment * numberOfPayments;

            // shoes results in  text fields
            monthlyPayment_TF.setText(String.format("%.2f", monthlyPayment));
            totalPayment_TF.setText(String.format("%.2f", totalPayment));

        } catch (NumberFormatException e) {
            //if input is not satisfied than invalid input message will be displayed
            monthlyPayment_TF.setText("Invalid input");
            totalPayment_TF.setText("Invalid input");
        }
    }

}
