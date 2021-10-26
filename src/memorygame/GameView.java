/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memorygame;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Oscar Neiva
 */
public class GameView {
    private Rectangle[] cards;
    private HBox row1, row2, row3;
    private VBox mainBox;
    private Scene scene;
    
    public GameView(){
        initializeComponents();
    }
    
    public void initializeComponents(){
        cards = new Rectangle[12];
        for (int i = 0; i < cards.length; i++) {
            cards[i] = new Rectangle();
            Image img = new Image("./images/0.png");
            cards[i].setFill(new ImagePattern(img));
        }
        
        mainBox = new VBox();
        mainBox.getChildren().addAll(cards[0]);
        mainBox.setAlignment(Pos.CENTER);
        
        scene = new Scene(mainBox);
    }
    
    public Scene getScene(){
        return scene;
    }
}
