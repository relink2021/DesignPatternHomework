package Homework11;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.BorderPane;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class InitController implements Initializable {

    public static int initVal = 0;

    @FXML
    private ChoiceBox<Integer> choiceBox;

    @FXML
    private Button button;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // choiceBox添加选择内容
        choiceBox.getItems().addAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // 切换场景到GumballMachine
        button.setOnAction(actionEvent ->  {
            BorderPane other = null;
            try {
                initVal = choiceBox.getValue();
                other = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("GumballMachine.fxml")));
            } catch (IOException e) {
                e.printStackTrace();
            }
            ((Button)actionEvent.getSource()).getScene().setRoot(other);
        });
    }
}
