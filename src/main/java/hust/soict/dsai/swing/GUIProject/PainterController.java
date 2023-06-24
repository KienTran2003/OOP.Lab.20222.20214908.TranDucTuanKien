package hust.soict.dsai.guiprojects;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class PainterController {
    private  Color color;
    @FXML
    private Pane drawingAreaPane;
    @FXML
    void clearPress(ActionEvent e){
        drawingAreaPane.getChildren().clear();
    }
    @FXML
    ToggleButton pen;
    @FXML
    ToggleButton eraser;

    @FXML
    void togglePress(ActionEvent e){
        if (e.getSource() == pen){
            color = Color.BLACK;
        } else if (e.getSource() == eraser){
            color = Color.WHITE;
        }

    }
    @FXML
    void drawingAreaMouseDragged(MouseEvent e){
        if (e.getX()>0) {
            Circle newCircle = new Circle(e.getX(), e.getY(), 4, color);

            drawingAreaPane.getChildren().add(newCircle);
        }
    }
}
