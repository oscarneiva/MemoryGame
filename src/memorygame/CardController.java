/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memorygame;

import java.util.Random;
import javafx.scene.control.Button;
import javafx.scene.image.Image;

/**
 *
 * @author Oscar Neiva
 */
public class CardController {
    private Card card;
    private Card[] cards;
    
    public CardController(){
        cards = new Card[12];
        cards[0] = new Card("Ada", new Image("/images/ada.png", 100, 100, false, false),true);
        cards[1] = new Card("Bitcoin", new Image("/images/bitcoin.png", 100, 100, false, false),true);
        cards[2] = new Card("Doge Coin", new Image("/images/doge.png", 100, 100, false, false),true);
        cards[3] = new Card("Ether", new Image("/images/ether.png", 100, 100, false, false),true);
        cards[4] = new Card("Shiba", new Image("/images/shiba.png", 100, 100, false, false),true);
        cards[5] = new Card("XRP", new Image("/images/xrp.png", 100, 100, false, false),true);
        cards[6] = new Card("Ada", new Image("/images/ada.png", 100, 100, false, false),true);
        cards[7] = new Card("Bitcoin", new Image("/images/bitcoin.png", 100, 100, false, false),true);
        cards[8] = new Card("Doge Coin", new Image("/images/doge.png", 100, 100, false, false),true);
        cards[9] = new Card("Ether", new Image("/images/ether.png", 100, 100, false, false),true);
        cards[10] = new Card("Shiba", new Image("/images/shiba.png", 100, 100, false, false),true);
        cards[11] = new Card("XRP", new Image("/images/xrp.png", 100, 100, false, false),true);
    
        cards = shuffleCards(cards);
    }
    
    public Card[] shuffleCards(Card[] arr){
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            int x = random.nextInt(arr.length);
            int y = random.nextInt(arr.length);

            Card aux = arr[x];
            arr[x] = arr[y];
            arr[y] = aux;
        }

        return arr;
    }

    public Card[] getCards() {
        return cards;
    }
    
}
