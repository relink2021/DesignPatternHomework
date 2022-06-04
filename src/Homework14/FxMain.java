package Homework14;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.Objects;

/* JavaFx启动类 */
public class FxMain extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        AnchorPane root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("GUI.fxml")));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Composite");
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
