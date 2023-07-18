package sample;

import javafx.animation.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private ImageView myImage;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        // translate
//        TranslateTransition translate = new TranslateTransition();
//        translate.setNode(myImage);
//        translate.setDuration(Duration.millis(1500));
//        translate.setCycleCount(TranslateTransition.INDEFINITE);
//        translate.setByX(100);
//        translate.setByY(-100);
//        translate.setAutoReverse(true);
//        translate.play();

        // rotate
//        RotateTransition rotate = new RotateTransition();
//        rotate.setNode(myImage);
//        rotate.setDuration(Duration.millis(1500));
//        rotate.setCycleCount(TranslateTransition.INDEFINITE);
//        rotate.setInterpolator(Interpolator.LINEAR);
//        rotate.setByAngle(360);
//        rotate.setAxis(Rotate.Z_AXIS);
//        rotate.play();

        // fade
//        FadeTransition fade = new FadeTransition();
//        fade.setNode(myImage);
//        fade.setDuration(Duration.millis(1500));
//        fade.setCycleCount(TranslateTransition.INDEFINITE);
//        fade.setInterpolator(Interpolator.LINEAR);
//        fade.setFromValue(0);
//        fade.setToValue(1);
//        fade.play();

        // scale
        ScaleTransition scale = new ScaleTransition();
        scale.setNode(myImage);
        scale.setDuration(Duration.millis(1500));
        scale.setCycleCount(TranslateTransition.INDEFINITE);
        scale.setInterpolator(Interpolator.LINEAR);
        scale.setByX(2.0);
        scale.setByY(2.0);
        scale.setAutoReverse(true);
        scale.play();
    }
}
