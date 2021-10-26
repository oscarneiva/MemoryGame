/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memorygame;

import java.util.Random;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author Oscar Neiva
 */
public class GameView {
    private Button[] cardsBtns;
    private HBox row1, row2, row3;
    private VBox mainBox;
    private Scene scene;
    
    public GameView(){
        initializeComponents();
    }
    
    public void initializeComponents(){
        Random random = new Random();
        CardController cardController = new CardController();
        cardsBtns = new Button[12];
        
        cardsBtns[0] = new Button();
        cardsBtns[0].setText("?");
        cardsBtns[0].setStyle("-fx-background-color: #fff; ");
        cardsBtns[0].setPrefSize(50, 50);
        cardsBtns[0].setOnAction(e->{
            cardsBtns[0].setGraphic(new ImageView(cardController.readCards()[0].getImage()));
            cardsBtns[0].setPrefSize(50, 50);
        });    
        
        mainBox = new VBox();
        mainBox.getChildren().addAll(cardsBtns[0]);
        mainBox.setAlignment(Pos.CENTER);
        
        scene = new Scene(mainBox);
    }
    
    public Scene getScene(){
        return scene;
    }
}
