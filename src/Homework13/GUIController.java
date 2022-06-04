package Homework13;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class GUIController {

    @FXML
    private TextField seed1;

    @FXML
    private TextField seed2;

    @FXML
    private TextArea view;

    @FXML
    private void start() {
        StringBuilder context = new StringBuilder("");
        try {
            if(seed1.getText().isEmpty() || seed2.getText().isEmpty()) {
                view.setText("seed1和seed2请输入数字，不能为其他字符或空!");
                return;
            }
            int seed_1 = Integer.parseInt(seed1.getText());
            int seed_2 = Integer.parseInt(seed2.getText());
            Player player1 = new Player("Taro", new WinningStrategy(seed_1));
            Player player2 = new Player("Hana", new ProbStrategy(seed_2));
            for (int i = 0; i < 100; i++) {
                Hand nextHand1 = player1.nextHand();
                Hand nextHand2 = player2.nextHand();
                if (nextHand1.isStrongerThan(nextHand2)) {
                    context.append("Winner:" + player1 + "\n");
                    player1.win();
                    player2.lose();
                } else if (nextHand2.isStrongerThan(nextHand1)) {
                    context.append("Winner:" + player2 + "\n");
                    player1.lose();
                    player2.win();
                } else {
                    context.append("Even...\n");
                    player1.even();
                    player2.even();
                }
            }
            context.append("Total result:\n");
            context.append("" + player1 + "\n");
            context.append("" + player2 + "\n");
            view.setText(context.toString());
        } catch (Exception e) {
            view.setText("seed1和seed2请输入数字，不能为其他字符或空!");
            return;
        }
    }
}
