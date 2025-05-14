module mdut.pwprojekt {
    requires javafx.controls;
    requires javafx.fxml;

    opens mdut.pwprojekt to javafx.fxml;
    exports mdut.pwprojekt;
}
