package phonebook;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class PhoneBook {
    public Button addButton;
    public Button getButton;
    public TextField nameTF;
    public TextField numberTF;
    public TextField resultTF;
    public ListView nameLV;
    private ArrayList<String> names;
    private ArrayList<String> numbers;

    public PhoneBook(){
        names = new ArrayList<>();
        numbers = new ArrayList<>();

        names.add("Alison");
        names.add("Bob");
        names.add("Carl");
        names.add("David");
        names.add("Edith");

        numbers.add("000001");
        numbers.add("000002");
        numbers.add("000003");
        numbers.add("000004");
        numbers.add("000005");
    }

    public void addNewEntry(String name, String number){
        names.add(name);
        numbers.add(number);
    }

    public String getNumber(String name){
        for (int i = 0; i < names.size(); i++){
            if (names.get(i).equals(name)){
                return numbers.get(i);
            }
        }

        // if no match found then return null
        return null;
    }

    public void addNewEntry(ListView.EditEvent actionEvent) {
        String name = nameTF.getText();
        String number = numberTF.getText();

        names.add("" + name);
        numbers.add("" + number);
    }

    public void getNumber(ActionEvent actionEvent) {
        String name = resultTF.getText();

        for (int i =0; i < names.size(); i++) {
            if (names.get(i).equals(name)) {
                resultTF.setText("" + numbers.get(i));
            }
        }
    }



}
