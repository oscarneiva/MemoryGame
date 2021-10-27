/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memorygame;

import java.awt.Color;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author Oscar Neiva
 */
public class MainScene {
    private Button[] cardsBtns;
    private HBox row1, row2, row3, header;
    private VBox mainBox;
    private Scene scene;
    private int counter;
    
    public MainScene(){
        initializeComponents();
    }
    
    public void initializeComponents(){
        Random random = new Random();
        CardController cardController = new CardController();
        cardsBtns = new Button[12];
        
        Label attempts = new Label("Attempts: " + counter);
        attempts.setStyle("-fx-text-fill: #03DAC6; -fx-font: 80px Roboto; -fx-font-weight: bold;");
        header = new HBox();
        header.getChildren().add(attempts);
        header.setAlignment(Pos.TOP_CENTER);
        
        for (int i = 0; i < cardsBtns.length; i++) {
            cardsBtns[i] = new Button();
            cardsBtns[i].setStyle("-fx-background-color: #6200EE; -fx-effect: dropshadow(three-pass-box, rgba(0,0,0,1), 10, 0, 0, 0);");
            cardsBtns[i].setPrefSize(120,120);
            cardsBtns[i].setId(cardController.getCards()[i].getName());
            
            int I = i;
            cardsBtns[I].setOnMouseClicked(e->{
                counter++;
                attempts.setText("Attempts: " + counter);
                if(cardController.getCards()[I].getIsTurnedOver()){
                    cardsBtns[I].setStyle("-fx-background-color: transparent");
                    cardsBtns[I].setGraphic(new ImageView(cardController.getCards()[I].getImage()));
                    cardController.getCards()[I].setIsTurnedOver(false);
                }else if(!cardController.getCards()[I].getIsTurnedOver()){
                    cardsBtns[I].setStyle("-fx-background-color: #6200EE; -fx-effect: dropshadow(three-pass-box, rgba(0,0,0,1), 10, 0, 0, 0);");
                    cardsBtns[I].setGraphic(null); 
                    cardController.getCards()[I].setIsTurnedOver(true);
                }
            });       
        }
        
        row1 = new HBox(20);
        for (int i = 0; i < 4; i++) {
            row1.getChildren().add(cardsBtns[i]);
        }
        row1.setAlignment(Pos.TOP_CENTER);
        
        row2 = new HBox(20);
        for (int i = 4; i < 8; i++) {
            row2.getChildren().add(cardsBtns[i]);
        }
        row2.setAlignment(Pos.CENTER); 
        
        row3 = new HBox(20);
        for (int i = 8; i < 12; i++) {
            row3.getChildren().add(cardsBtns[i]);
        }
        row3.setAlignment(Pos.BOTTOM_CENTER); 
        
        mainBox = new VBox(20);
        mainBox.getChildren().addAll(header,row1,row2,row3);
        mainBox.setAlignment(Pos.CENTER);
        mainBox.setStyle("-fx-background-color: #fff");
        
        scene = new Scene(mainBox);
    }
    
    public Scene getScene(){
        return scene;
    }
}
