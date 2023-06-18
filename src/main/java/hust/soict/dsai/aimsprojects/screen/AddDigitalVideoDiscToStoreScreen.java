
package hust.soict.dsai.aimsprojects.screen;

import hust.soict.dsai.aimsprojects.cart.Cart;
import hust.soict.dsai.aimsprojects.store.Store;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;



public class AddDigitalVideoDiscToStoreScreen extends JFrame {

    private Store store;
    private Cart cart;
    public AddDigitalVideoDiscToStoreScreen(Store store, Cart cart){
        super();

        this.store = store;
        this.cart = cart;

        JFXPanel fxPanel = new JFXPanel();
        this.add(fxPanel);

        this.setTitle("Add Digital Video Disc");
        this.setVisible(true);
        this.setSize(new Dimension(600,400));
        this.setLocationRelativeTo(null);

        Runnable windowCloser = () -> SwingUtilities.invokeLater(
                () -> this.setVisible(false)
        );

        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("adddvd.fxml"));
                    AddDVDToStoreScreenController controller = new AddDVDToStoreScreenController(store, cart);
                    loader.setController(controller);
                    controller.setWindowCloser(windowCloser);


                    Parent root = loader.load();

                    fxPanel.setScene(new Scene(root));
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        });
    }
}