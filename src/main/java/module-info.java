module com.example.sklep {
    requires javafx.controls;
    requires javafx.fxml;
            
            requires com.dlsc.formsfx;
                        
    opens com.example.sklep to javafx.fxml;
    exports com.example.sklep;
}