package app.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class Navigation {
    public Button btnFilms;
    public Button btnSnacks;
    public Button btnSceneChange;

    public void sceneChange(String fxml) {
        btnFilms.setOnMouseClicked(event -> {
            try {
                Parent root = FXMLLoader.load(getClass().getResource(fxml));
                Scene scene = new Scene(root);
                Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
                stage.hide();
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });


    }

    public void sceneChangeFilms(ActionEvent actionEvent) throws IOException {
        sceneChange("../fxml/films.fxml");
        System.out.println("ACTION_EVENT: change scene films");
    }

    public void sceneChangeSnacks(ActionEvent actionEvent) throws IOException {
        sceneChange("../fxml/snacks.fxml");
        System.out.println("ACTION_EVENT: change scene snacks");
    }
}
