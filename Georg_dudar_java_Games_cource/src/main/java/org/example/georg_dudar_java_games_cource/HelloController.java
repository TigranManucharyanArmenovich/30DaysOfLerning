package org.example.georg_dudar_java_games_cource;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label CoreLabel;

    @FXML
    private Button MainButton;

    @FXML
    void BtnClick(ActionEvent event) {
        CoreLabel.setText("Good boy!");
    }

    @FXML
    void initialize() {

    }

}
