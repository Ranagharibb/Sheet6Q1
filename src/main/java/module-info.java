module com.example.testbefassign {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.testbefassign to javafx.fxml;
    exports com.example.testbefassign;
}