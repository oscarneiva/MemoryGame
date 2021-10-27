/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memorygame;

import javafx.scene.image.Image;

/**
 *
 * @author Oscar Neiva
 */
public class CardController {
    private Card card;
    private Card[] cards;
    
    public CardController(){
        cards = new Card[7];
    }
    
    public Card[] readCards(){
        cards[0] = new Card("Ada", new Image("/images/ada.png", 100, 100, false, false));
        cards[1] = new Card("Bitcoin", new Image("/images/bitcoin.png", 100, 100, false, false));
        cards[2] = new Card("Doge Coin", new Image("/images/doge.png", 100, 100, false, false));
        cards[3] = new Card("Ether", new Image("/images/ether.png", 100, 100, false, false));
        cards[4] = new Card("Shiba", new Image("/images/shiba.png", 100, 100, false, false));
        cards[5] = new Card("XRP", new Image("/images/xrp.png", 100, 100, false, false));
        cards[6] = new Card("card", new Image("/images/card.jpg", 100, 100, false, false));
        
        return cards;
    }
}
