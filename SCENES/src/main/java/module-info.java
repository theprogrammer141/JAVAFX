module org.example.scenes {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.scenes to javafx.fxml;
    exports org.example.scenes;
}