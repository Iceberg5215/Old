package app.controllers;

import app.formats.Film;
import app.formats.Seat;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Window;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Films extends Navigation implements Initializable {
    @FXML
    public ListView<Film> lvFilms;
    @FXML
    public TextField tfPrice;
    @FXML
    public TextField tfRating;
    @FXML
    public TextField tfDuration;
    @FXML
    public TextField tfTime;
    @FXML
    public TextField tfDate;
    @FXML
    public TextField tfFilm;
    @FXML
    public TextField tfTheatre;
    @FXML
    public ListView<Seat> lvSeats;
    @FXML
    public ListView<String> lvSelections;
    @FXML
    public Button btnConfirmSelectionsFilm;
    @FXML
    public Button btnClearSelectionsFilm;

    ObservableList<Film> films = FXCollections.observableArrayList();
    ObservableList<Seat> seats = FXCollections.observableArrayList();
    ObservableList<String> selections = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loadFilmData();
        formatFilmData();
    }

    public void loadFilmData() {
        Film avatar = new Film("Avatar",16,1,"2h 10m","12:30","18/03/2019",10);
        Film avengers = new Film("Avengers",16,2,"2h 12m","12:45","18/03/2019",10);
        Film iron = new Film("Iron Man",16,3,"2h 14m","1:00","18/03/2019",10);
        Film spiderman = new Film("Spiderman",16,4,"2h 16m","1:15","18/03/2019",10);
        Film america = new Film("Captain America",16,5,"2h 18m","1:30","18/03/2019",10);
        Film lantern = new Film("Green Lantern",16,6,"2h 20m","1:45","18/03/2019",10);
        Film cars = new Film("Cars",6,7,"2h 22m","2:00","18/03/2019",10);
        Film planes = new Film("Planes",6,8,"2h 24m","2:15","18/03/2019",10);
        Film up = new Film("Up",6,9,"2h 26m","2:30","18/03/2019",10);
        Film queen = new Film("Queen",16,10,"2h 26m","2:45","18/03/2019",10);

        films.addAll(avatar, avengers, iron, spiderman, america, lantern, cars, planes, up, queen);
        lvFilms.setItems(films);
        System.out.println("INITIALIZE_EVENT: films loaded");

        for (int i = 0; i < 50; i++) {
            Seat seat = new Seat(i + 1);
            seats.addAll(seat);
            lvSeats.setItems(seats);
        }
    }

    public void formatFilmData() {
        lvFilms.setCellFactory(listView -> new ListCell<Film>() {
            public void updateItem(Film film, boolean empty) {
                super.updateItem(film, empty);
                if (empty) {
                    setText(null);
                } else {
                    setText(film.getFilm());
                    setOnMouseClicked(event1 -> {
                        Integer age = film.getRating();
                        String ageRating = String.valueOf(age);

                        Integer theatre = film.getTheatre();
                        String theatreNumber = String.valueOf(theatre);

                        double fPrice = film.getPrice();
                        String filmPrice = String.valueOf(fPrice);

                        if (event1.getClickCount() == 1) {
                            tfFilm.setText(film.getFilm());
                            tfRating.setText(ageRating);
                            tfTheatre.setText(theatreNumber);
                            tfDuration.setText(film.getDuration());
                            tfTime.setText(film.getTime());
                            tfDate.setText(film.getDate());
                            tfPrice.setText(filmPrice);
                        }
                        System.out.println("INITIALIZE_EVENT: films formatted");

                        setOnMouseClicked(event2 -> {
                            String title = film.getFilm();
                            String filmTitle = String.valueOf(title);
                            if (event2.getClickCount() == 2) {
                                lvFilms.getSelectionModel().getSelectedItem();
                                selections.add(filmTitle);
                                lvSelections.setItems(selections);
                                System.out.println("MOUSE_EVENT: film selected");
                            }
                        });
                    });
                }
            }
        });

        lvSeats.setCellFactory(listView -> new ListCell<Seat>() {
            public void updateItem(Seat seat, boolean empty) {
                super.updateItem(seat, empty);
                if (empty) {
                    setText(null);
                } else {
                    setText(String.valueOf(seat.getSeat()));

                    Integer chosenSeat = seat.getSeat();
                    String selectedSeat = String.valueOf(chosenSeat);

                    System.out.println("INITIALIZE_EVENT: seats formatted");

                    setOnMouseClicked(event3 -> {
                        if (event3.getClickCount() == 1) {
                            lvSeats.getSelectionModel().getSelectedItem();
                            selections.add(selectedSeat);
                            lvSelections.setItems(selections);
                            System.out.println("MOUSE_EVENT: seat selected");
                        }
                    });
                }
            }
        });
    }

    public void confirmSelectionsFilm(ActionEvent actionEvent) throws IOException {
        sceneChange("../fxml/snacks.fxml");
        System.out.println("ACTION_EVENT: selections confirmed");
        System.out.println("ACTION_EVENT: change scene films");
    }

    public void clearSelectionsFilm(ActionEvent actionEvent) {
        selections.clear();
        System.out.println("ACTION_EVENT: selections cleared");
    }
}
