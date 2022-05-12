package Homework11;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.util.Objects;

/**
 * 主函数，程序基于JavaFx
 * 生成GumballMachine的基本窗体
 * JDK版本：1.8
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        AnchorPane root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Init.fxml")));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("GumballMachine");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
