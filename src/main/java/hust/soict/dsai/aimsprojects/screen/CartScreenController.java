package hust.soict.dsai.aimsprojects.screen;

import hust.soict.dsai.aimsprojects.cart.Cart;
import hust.soict.dsai.aimsprojects.media.Media;
import hust.soict.dsai.aimsprojects.media.Playable;
import hust.soict.dsai.aimsprojects.store.Store;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CartScreenController {
    private Cart cart;
    private Store store;
    private double dCost = 0;
    private JFrame frame = new JFrame();
    private Runnable windowCloser;
    @FXML
    private TableView<Media> tblMedia;
    @FXML
    private TableColumn<Media, String> colMediaTitle;

    @FXML
    private TableColumn<Media, String> colMediacategory;
    @FXML
    private TableColumn<Media, Float> colMediaCost;

    @FXML
    private Button btnPlay;

    @FXML
    private  Button btnRemove;
    @FXML
    private Button btnPlayOrder;
    @FXML
    private Label totalCost;
    @FXML
    private MenuItem viewStore;
    @FXML
    private MenuItem addBook;
    @FXML
    private MenuItem addCD;
    @FXML
    private MenuItem addDVD;


    public CartScreenController(Cart cart, Store store, Runnable windowCloser){
        super();
        this.cart = cart;
        this.store = store;
        this.windowCloser  = windowCloser;


    }



    @FXML
    private void initialize(){

        colMediaTitle.setCellValueFactory(new PropertyValueFactory<Media, String>("title"));
        colMediacategory.setCellValueFactory(new PropertyValueFactory<Media, String>("category"));
        colMediaCost.setCellValueFactory(new PropertyValueFactory<Media, Float>("cost"));

        tblMedia.setItems(this.cart.getItemsOrdered());

        btnPlay.setVisible(false);
        btnRemove.setVisible(false);

        tblMedia.getSelectionModel().selectedItemProperty().addListener(
                new ChangeListener<Media>() {
                    @Override
                    public void changed(ObservableValue<? extends Media> observable, Media oldValue, Media newValue) {
                        if (newValue != null){
                            updateButtonBar(newValue);
                        }

                    }
                }
        );

        //Set text for cost label
        for (Media media:cart.getItemsOrdered()){
            dCost += media.getCost();
        }
        totalCost.setText(dCost + "$");


        // Set action for remove button
        btnRemove.setOnAction(e -> {
            Media media = tblMedia.getSelectionModel().getSelectedItem();

            cart.removeMedia(media);
            dCost -= media.getCost();
            totalCost.setText(dCost + "$");
        });


        //Set action for play button
        btnPlay.setOnAction(e -> {
            Media media = tblMedia.getSelectionModel().getSelectedItem();

            JDialog dialog = new JDialog(frame,"Play Media", true);
            dialog.setLayout(new GridLayout(3,1));
            dialog.setSize(300,150);
            dialog.add(new JLabel("Title: " + media.getTitle()));
            dialog.add(new JLabel("Category: "+ media.getCategory()));
            JButton playButton = new JButton("OK");
            playButton.setSize(10,10);
            playButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    dialog.setVisible(false);
                }
            });
            dialog.add(playButton);
            dialog.setLocationRelativeTo(null);
            dialog.setVisible(true);
        });


        // Set action for place order button
        btnPlayOrder.setOnAction(e -> {
            JDialog dialog = new JDialog(frame,"Place Order", true);
            dialog.setLayout(new GridLayout(3,1));
            dialog.setSize(300,150);
            String mess = "You have payed " + dCost;
            dialog.add(new JLabel(mess));
            dialog.add(new JLabel("Your order is prepared!"));
            JButton playButton = new JButton("OK");
            playButton.setSize(10,10);
            playButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    dialog.setVisible(false);
                    for (int i = tblMedia.getItems().size()-1  ;i>-1;i--){
                        System.out.println(tblMedia.getItems().size());
                        cart.removeMedia(tblMedia.getItems().get(0));
                    }
                }
            });
            dialog.add(playButton);
            dialog.setLocationRelativeTo(null);

            dialog.setVisible(true);
        });

        viewStore.setOnAction(e -> {
            windowCloser.run();
            new StoreScreen(store, cart);


        });


        addBook.setOnAction(e -> {
            windowCloser.run();
            new AddBookToStoreScreen(store, cart);

        });
        addCD.setOnAction(e -> {
            windowCloser.run();
            new AddCompactDiscToStoreScreen(store, cart);
        });

        addDVD.setOnAction(e -> {
            windowCloser.run();
            new AddDigitalVideoDiscToStoreScreen(store, cart);
        });



        }








    void updateButtonBar(Media media){
        btnRemove.setVisible(true);
        if (media instanceof Playable){
            btnPlay.setVisible(true);
        } else {
            btnPlay.setVisible(false);
        }
    }
    public void setWindowCloser(Runnable windowCloser){
        this.windowCloser = windowCloser;
    }




}
