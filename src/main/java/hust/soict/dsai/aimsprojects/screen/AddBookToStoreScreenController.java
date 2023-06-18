package hust.soict.dsai.aimsprojects.screen;

import hust.soict.dsai.aimsprojects.cart.Cart;
import hust.soict.dsai.aimsprojects.media.Book;
import hust.soict.dsai.aimsprojects.store.Store;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;


public class AddBookToStoreScreenController {

    private Store store;
    private Cart cart;
    private Runnable windowCloser;

    @FXML
    private TextField textTitle;
    @FXML
    private TextField textCategory;
    @FXML
    private TextField textCost;
    @FXML

    Button btnAdd;
    @FXML
    private javafx.scene.control.MenuItem viewStore;

    @FXML
    private javafx.scene.control.MenuItem addCD;
    @FXML
    private MenuItem addDVD;
    @FXML
    private MenuItem viewCart;

    public AddBookToStoreScreenController(Store store, Cart cart){
        super();
        this.store = store;
        this.cart = cart;

    }

    @FXML
    private void initialize() {
        btnAdd.setOnAction(e -> {
            String title = textTitle.getText();
            String category = textCategory.getText();
            Float cost = Float.parseFloat(textCost.getText());
            Book book = new Book(title,category,cost);
            store.addMedia(book);
            textTitle.setText("");
            textCategory.setText("");
            textCost.setText("");


        });
        viewStore.setOnAction(e -> {
            windowCloser.run();
            new StoreScreen(store, cart);


        });
        viewCart.setOnAction(e -> {
            windowCloser.run();
            new CartScreen(cart, store);


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
    public void setWindowCloser(Runnable windowCloser){
        this.windowCloser = windowCloser;
    }









}
