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
        cards = new Card[6];
    }
    
    public Card[] readCards(){
        cards[0] = new Card("Ada", new Image("/images/ada.png"));
        cards[1] = new Card("Bitcoin", new Image("/images/bitcoin.png"));
        cards[2] = new Card("Doge Coin", new Image("/images/doge.png"));
        cards[3] = new Card("Ether", new Image("/images/ether.png"));
        cards[4] = new Card("Shiba", new Image("/images/shiba.png"));
        cards[5] = new Card("XRP", new Image("/images/xrp.png"));
        
        return cards;
    }
}
