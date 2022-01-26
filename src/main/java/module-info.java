module com.medina.timesheets {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.medina.timesheets to javafx.fxml;
    exports com.medina.timesheets;
}