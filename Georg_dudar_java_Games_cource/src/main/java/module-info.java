module org.example.georg_dudar_java_games_cource {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.georg_dudar_java_games_cource to javafx.fxml;
    exports org.example.georg_dudar_java_games_cource;
}