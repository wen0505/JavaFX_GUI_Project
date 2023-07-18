package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Label myLabel;
    @FXML
    private ChoiceBox<String> myChoiceBox;

    private String[] dessert = {"ice cream", "cake", "pudding", "macaroon", "puff"};

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        myChoiceBox.getItems().addAll(dessert);
        myChoiceBox.setOnAction(this::getSweet);

    }

    public void getSweet(ActionEvent event) {

        String mySweet = myChoiceBox.getValue();
        myLabel.setText(mySweet);
    }

}
