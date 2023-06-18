module hust.soict.dsai.aimsprojects {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.swing;



    opens hust.soict.dsai.aimsprojects to javafx.fxml;
    exports hust.soict.dsai.aimsprojects;
    exports hust.soict.dsai.aimsprojects.media;
    opens hust.soict.dsai.aimsprojects.media to javafx.fxml;
    exports hust.soict.dsai.aimsprojects.store;
    opens hust.soict.dsai.aimsprojects.store to javafx.fxml;
    exports hust.soict.dsai.aimsprojects.cart;
    opens hust.soict.dsai.aimsprojects.cart to javafx.fxml;
    exports hust.soict.dsai.aimsprojects.screen;
    opens hust.soict.dsai.aimsprojects.screen to javafx.fxml;


}