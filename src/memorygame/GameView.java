/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memorygame;

import java.awt.Color;
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
        
        for (int i = 0; i < cardsBtns.length; i++) {
            cardsBtns[i] = new Button();
            cardsBtns[i].setStyle("-fx-background-color: transparent");
            cardsBtns[i].setGraphic(new ImageView(cardController.readCards()[6].getImage()));
            int I = i;
            cardsBtns[i].setOnAction(e->{
                cardsBtns[I].setText("");
                cardsBtns[I].setGraphic(new ImageView(cardController.readCards()[random.nextInt(6)].getImage()));
            }); 
        }
        
        row1 = new HBox();
        for (int i = 0; i < 4; i++) {
            row1.getChildren().add(cardsBtns[i]);
        }
        row1.setAlignment(Pos.TOP_CENTER);
        
        row2 = new HBox();
        for (int i = 4; i < 8; i++) {
            row2.getChildren().add(cardsBtns[i]);
        }
        row2.setAlignment(Pos.CENTER); 
        
        row3 = new HBox();
        for (int i = 8; i < 12; i++) {
            row3.getChildren().add(cardsBtns[i]);
        }
        row3.setAlignment(Pos.BOTTOM_CENTER); 
        
        mainBox = new VBox();
        mainBox.getChildren().addAll(row1,row2,row3);
        mainBox.setAlignment(Pos.CENTER);
        mainBox.setStyle("-fx-background-color: #000");
        
        scene = new Scene(mainBox);
    }
    
    public Scene getScene(){
        return scene;
    }
}
