package app.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Checkout extends Navigation implements Initializable {
    public TextField tfCardHolder;
    public TextField tfAccountNumber;
    public ChoiceBox<String> cbMonth;
    public ChoiceBox<String> cbYear;
    public TextField tfCVV;
    public ListView lvSelections;
    public ChoiceBox<String> cbMethod;
    public TextField tfTotalPrice;
    public Button btnConfirmPayment;
    public Button btnCancelPayment;
    public Button btnMethodCash;

    ObservableList<String> method = FXCollections.observableArrayList();
    ObservableList<String> month = FXCollections.observableArrayList();
    ObservableList<String> year = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setCbMethod();
        setCbMonth();
        setCbYear();
    }

    public void setCbMethod() {
        method.addAll("Debit Card", "Credit Card");
        cbMethod.setItems(method);
    }

    public void setCbMonth() {
        month.addAll("01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12");
        cbMonth.setItems(month);
    }

    public void setCbYear() {
        year.addAll("2020", "2021", "2022", "2023", "2024", "2025", "2026");
        cbYear.setItems(year);
    }

    public void checkDetails() {
        if (tfAccountNumber.getText().length() == 16) {
            System.out.println("EVENT: length checked 16 chars");
        }
        else if (tfCVV.getText().length() == 3) {
            System.out.println("EVENT: length checked 3 chars");
        }
        else if (tfAccountNumber.getText().length() == 16 && tfCVV.getText().length() == 3) {
            sceneChange("../fxml/receipt.fxml");
        }
        else {
            System.out.println("ERROR: length invalid");
        }
    }

    public void confirmPayment(ActionEvent actionEvent) {
        checkDetails();
    }

    public void cancelPayment(ActionEvent actionEvent) {

    }

    public void paymentCash(ActionEvent actionEvent) {

    }
}
