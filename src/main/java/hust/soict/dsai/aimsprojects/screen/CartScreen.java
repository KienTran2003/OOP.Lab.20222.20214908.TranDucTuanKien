package hust.soict.dsai.aimsprojects.screen;

import javax.swing.*;

import hust.soict.dsai.aimsprojects.cart.Cart;
import hust.soict.dsai.aimsprojects.store.Store;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.awt.*;
import java.io.IOException;

public class CartScreen extends JFrame {
    private Cart cart;
    private Store store;
    public CartScreen(Cart cart, Store store){
        super();

        this.cart = cart;
        this.store = store;

        JFXPanel fxPanel = new JFXPanel();
        this.add(fxPanel);

        this.setTitle("Cart");
        this.setVisible(true);
        this.setSize(new Dimension(1500,800));
        this.setLocationRelativeTo(null);
        Runnable windowCloser = () -> SwingUtilities.invokeLater(
                () -> this.setVisible(false)
        );
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("cart.fxml"));
                    CartScreenController controller = new CartScreenController(cart, store, this);
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
