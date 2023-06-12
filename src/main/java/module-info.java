module com.example.testhibgradle_2306122126 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.testhibgradle_2306122126 to javafx.fxml;
    exports com.example.testhibgradle_2306122126;
}