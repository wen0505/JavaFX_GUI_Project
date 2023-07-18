package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {

    // ImageView is a Node used for painting image loaded with Images
    // Image = photograph
    // ImageView = picture frame

    @FXML
    ImageView myImageView;

    Button myButton;

    Image myImage = new Image(getClass().getResourceAsStream("image2.jpg"));

    public void displayImage() {
        myImageView.setImage(myImage);
    }

}
