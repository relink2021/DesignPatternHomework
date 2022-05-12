package Homework11;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class GumballMachineController implements Initializable {

    private static GumballMachine gumballMachine;
    private String message;

    @FXML
    private Button refill;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if(gumballMachine == null) {
            gumballMachine = new GumballMachine(InitController.initVal);
        } else {
            gumballMachine.refill(InitController.initVal);
        }
        // refill按键功能：添加若干的Gumball
        refill.setOnAction(actionEvent ->  {
            AnchorPane other = null;
            try {
                // 切换回初始化界面进行添加
                other = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Init.fxml")));
            } catch (IOException e) {
                e.printStackTrace();
            }
            ((Button)actionEvent.getSource()).getScene().setRoot(other);
        });
    }

    @FXML
    public void insertQuarter() {
        message = gumballMachine.insertQuarter();
        if(message != "") {
            dialog(message, "Insert Quarter", Alert.AlertType.INFORMATION);
        }
    }

    @FXML
    public void TurnCrank() {
        message = gumballMachine.turnCrank();
        if(message != "") {
            dialog(message, "Turn Crank", Alert.AlertType.INFORMATION);
        }
    }

    @FXML
    public void printMessage() {
        dialog(gumballMachine.toString(), "Print Message", Alert.AlertType.INFORMATION);
    }

    private void dialog(String msg, String title, Alert.AlertType alertType) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(msg);
        alert.showAndWait();
    }
}
