/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memorygame;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author Oscar Neiva
 */
public class MemoryGame extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    public void start(Stage stage){
        stage.setHeight(700);
        stage.setWidth(800);
        stage.setTitle("Crypto Memory game");
        
        MainScene gameView = new MainScene();
        stage.setScene(gameView.getScene());
        stage.show();
    }
    
}
