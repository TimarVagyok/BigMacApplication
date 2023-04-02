module com.example.bigmac {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bigmac to javafx.fxml;
    exports com.example.bigmac;
}