package Homework13;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.util.Objects;

public class FxMain extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("GUI.fxml")));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Strategy");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
