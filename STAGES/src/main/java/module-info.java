module org.example.stages {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.stages to javafx.fxml;
    exports org.example.stages;
}