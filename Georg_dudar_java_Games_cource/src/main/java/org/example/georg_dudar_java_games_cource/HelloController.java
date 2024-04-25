package org.example.georg_dudar_java_games_cource;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    private Button MainBut;

    @FXML
    private Label MainLabel;

    @FXML
    void ShowText(ActionEvent event) {
        MainLabel.setText("Какой хороший маааальчик");

    }

}
