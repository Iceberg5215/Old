package app.controllers;

import app.formats.Drink;
import app.formats.Snack;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Snacks extends Navigation implements Initializable {
    @FXML
    public Button btnConfirmSelectionsSnacks;
    @FXML
    public Button btnClearSelectionsSnacks;
    @FXML
    public ListView<Snack> lvSnacks;
    @FXML
    public TextField tfSnacksPrice;
    @FXML
    public TextField tfAmountSnacks;
    @FXML
    public ListView<String> lvSelections;
    @FXML
    public ListView<Drink> lvDrinks;
    @FXML
    public TextField tfDrinksPrice;
    @FXML
    public TextField tfAmountDrinks;
    @FXML
    public TextField tfTotalPrice;

    public double total = 0;

    ObservableList<Snack> snacks = FXCollections.observableArrayList();
    ObservableList<Drink> drinks = FXCollections.observableArrayList();
    ObservableList<String> selections = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loadSnackData();
        formatSnackData();
    }

    public void loadSnackData() {
        Snack wotsits = new Snack("wotsits",1.20);
        Snack quavers = new Snack("quavers",1.25);
        Snack twix = new Snack("twix",1.30);

        snacks.addAll(wotsits, quavers, twix);
        lvSnacks.setItems(snacks);

        Drink sprite = new Drink("sprite",1.40);
        Drink coke = new Drink("coke",1.55);
        Drink pepsi = new Drink("pepsi",1.35);

        drinks.addAll(sprite, coke, pepsi);
        lvDrinks.setItems(drinks);

        System.out.println("INITIALIZE_EVENT: snacks loaded");
        System.out.println("INITIALIZE_EVENT: drinks loaded");
    }

    public void formatSnackData() {
        lvSnacks.setCellFactory(listView -> new ListCell<Snack>() {
            public void updateItem(Snack snack, boolean empty) {
                super.updateItem(snack, empty);
                if (empty) {
                    setText(null);
                } else {
                    setText(snack.getSnack());

                    setOnMouseClicked(event -> {
                        String chosenSnack = snack.getSnack();
                        String selectedSnack = String.valueOf(chosenSnack);

                        double price = snack.getPrice();
                        String priceSnack = String.valueOf(price);

                        if (event.getClickCount() == 1) {
                            tfAmountSnacks.setText(selectedSnack);
                            tfSnacksPrice.setText(priceSnack);
                            System.out.println("MOUSE_EVENT: snack text field values set");
                        }

                        if (event.getClickCount() == 2) {
                            lvSnacks.getSelectionModel().getSelectedItem();
                            selections.add(selectedSnack);
                            lvSelections.setItems(selections);
                            System.out.println("MOUSE_EVENT: snack selected");

                            total += snack.getPrice();
                            tfTotalPrice.setText(String.valueOf(total));
                        }
                    });

                    System.out.println("INITIALIZE_EVENT: snacks formatted");
                }
            }
        });

        lvDrinks.setCellFactory(listView -> new ListCell<Drink>() {
            public void updateItem(Drink drink, boolean empty) {
                super.updateItem(drink, empty);
                if (empty) {
                    setText(null);
                } else {
                    setText(drink.getDrink());

                    setOnMouseClicked(event -> {
                        String chosenDrink = drink.getDrink();
                        String selectedDrink = String.valueOf(chosenDrink);

                        double price = drink.getPrice();
                        String priceDrink = String.valueOf(price);

                        if (event.getClickCount() == 1) {
                            tfAmountDrinks.setText(selectedDrink);
                            tfDrinksPrice.setText(priceDrink);
                            System.out.println("MOUSE_EVENT: drink text field values set");
                        }

                        if (event.getClickCount() == 2) {
                            lvDrinks.getSelectionModel().getSelectedItem();
                            selections.add(selectedDrink);
                            lvSelections.setItems(selections);
                            System.out.println("MOUSE_EVENT: drink selected");

                            total += drink.getPrice();
                            tfTotalPrice.setText(String.valueOf(total));
                        }
                    });

                    System.out.println("INITIALIZE_EVENT: drinks formatted");
                }
            }
        });
    }

    public void confirmSelectionSnacks(ActionEvent actionEvent) throws IOException {
        sceneChange("../fxml/checkout.fxml");
        System.out.println("ACTION_EVENT: selections confirmed");
        System.out.println("ACTION_EVENT: change scene films");
    }

    public void cancelSelectionSnacks(ActionEvent actionEvent) {
        selections.clear();
        System.out.println("ACTION_EVENT: selections cleared");
    }
}
