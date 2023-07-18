package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private ProgressBar myProgressBar;
    @FXML
    private Button myButton;
    @FXML
    private Label myLabel;

    BigDecimal progress = new BigDecimal(String.format("%.2f", 0.0));

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        myProgressBar.setStyle("-fx-accent: #ccffcc;");
    }

    public void increaseProgress(ActionEvent event) {

        if(progress.doubleValue() < 1) {
            progress = new BigDecimal(String.format("%.2f", progress.doubleValue() + 0.1));
            System.out.println(progress.doubleValue());
            myProgressBar.setProgress(progress.doubleValue());
            myLabel.setText(Integer.toString((int)Math.round(progress.doubleValue() * 100)) + "%");
        }

    }
}
