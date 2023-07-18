package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Label myLabel;
    @FXML
    private ListView<String> myListView;

    String[] dessert = {"ice cream", "cake", "pudding", "macaroon", "puff", "waffle", "fruit tart"};
    String currentDessert;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        myListView.getItems().addAll(dessert);

        myListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {

                currentDessert = myListView.getSelectionModel().getSelectedItem();
                myLabel.setText(currentDessert);

            }
        });

    }
}
