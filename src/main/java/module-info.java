module com.example.bigmac {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.bigmac to javafx.fxml;
    exports com.example.bigmac;
}