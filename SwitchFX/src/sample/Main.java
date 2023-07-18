package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
        Scene scene1 = new Scene(root);
        stage.setScene(scene1);
        //stage.setTitle("Hello World");
        //stage.setScene(new Scene(root, 300, 275));
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
